package no.ciber.github.model;

import com.google.gson.annotations.SerializedName;
import no.ciber.github.model.AbstractSearchResult;
import no.ciber.github.model.Repository;

import java.util.List;

/**
 * User: Michael Johansen
 * Date: 14.04.2015
 * Time: 14:13
 */
public class RepositorySearchResult extends AbstractSearchResult {
    @SerializedName("items")
    private List<Repository> repositories;

    public List<Repository> getRepositories() {
        return repositories;
    }

    public void setRepositories(List<Repository> repositories) {
        this.repositories = repositories;
    }

}
