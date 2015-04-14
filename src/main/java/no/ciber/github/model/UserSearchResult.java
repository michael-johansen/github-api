package no.ciber.github.model;

import com.google.gson.annotations.SerializedName;
import no.ciber.github.model.AbstractSearchResult;
import no.ciber.github.model.User;

import java.util.List;

/**
 * User: Michael Johansen
 * Date: 14.04.2015
 * Time: 14:13
 */
public class UserSearchResult extends AbstractSearchResult {
    @SerializedName("items")
    private List<User> users;


    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
