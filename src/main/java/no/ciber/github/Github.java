package no.ciber.github;

import com.google.gson.Gson;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.GetRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

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
        if (hasText(key)){
            logger.info("github.key was set: Using key for future requests.");
            this.key = Optional.of(key);
        }
        else {
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

    private boolean hasText(String text) {
        return text != null && !text.matches("^\\s*$");
    }

    private <T> T getResource(String url, Class<T> returnClass) {
        GetRequest request = Unirest.get(url);
        key.ifPresent(key -> request.header("Authorization", "token " + key));
        try {
            return gson.fromJson(request.asString().getBody(), returnClass);
        } catch (UnirestException e) {
            throw new GitHubApiException(e);
        }
    }
}
