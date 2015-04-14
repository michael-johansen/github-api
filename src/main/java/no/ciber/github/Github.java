package no.ciber.github;

import com.google.gson.Gson;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.GetRequest;
import no.ciber.github.model.Repository;
import no.ciber.github.model.SearchRequest;
import no.ciber.github.model.User;
import no.ciber.github.model.UserSearchResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 * User: Michael Johansen
 * Date: 14.04.2015
 * Time: 12:22
 */
public class GitHub {
    private Logger logger = LoggerFactory.getLogger(getClass());
    private Optional<String> key;
    private final String baseUrl = "https://api.github.com";
    private final Gson gson = new Gson();

    public GitHub() {
        String key = System.getenv("github.key");
        if (TextUtil.hasText(key)) {
            logger.info("github.key was set: Using key for future requests.");
            this.key = Optional.of(key);
        } else {
            logger.warn("No key is set, a very limited amount of requests will be available. Please set github.key");
            this.key = Optional.empty();
        }
    }

    public User getUser(String userName) {
        return getResource(baseUrl + "/users/" + userName, User.class);
    }

    public Repository getRepository(String userName, String repositoryName) {
        return getResource(baseUrl + "/repos/" + userName + "/" + repositoryName, Repository.class);
    }

    private <T> T getResource(String url, Class<T> returnClass, Parameter... parameters) {
        GetRequest request = Unirest.get(url);
        key.ifPresent(key -> request.header("Authorization", "token " + key));
        for (Parameter parameter : parameters) {
            request.queryString(parameter.key, parameter.value);
        }
        try {
            logger.info("Fetching: "+ request.getUrl());
            return gson.fromJson(request.asString().getBody(), returnClass);
        } catch (UnirestException e) {
            throw new GitHubApiException(e);
        }
    }

    public UserSearchResult searchForUser(SearchRequest req) {
        ArrayList<Parameter> parameterList = new ArrayList<>();
        parameterList.add(new Parameter("q", req.getQuery()));
        req.getPage().ifPresent(page -> parameterList.add(new Parameter("page", page)));
        req.getPageSize().ifPresent(pageSize -> parameterList.add(new Parameter("per_page", pageSize)));
        req.getSort().ifPresent(sort -> parameterList.add(new Parameter("sort", sort)));
        req.getOrder().ifPresent(order -> parameterList.add(new Parameter("order", order)));

        return getResource(
                baseUrl + "/search/users",
                UserSearchResult.class,
                parameterList.toArray(new Parameter[parameterList.size()])
        );
    }

    private static class Parameter {
        private final String key;
        private final Object value;

        public Parameter(String key, Object value) {
            this.key = key;
            this.value = value;
        }
    }
}
