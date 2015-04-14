package no.ciber.github;

import no.ciber.github.model.Repository;
import no.ciber.github.model.SearchRequest;
import no.ciber.github.model.User;
import no.ciber.github.model.UserSearchResult;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

/**
 * User: Michael Johansen
 * Date: 14.04.2015
 * Time: 12:19
 */
public class GitHubTest {

    private GitHub gitHub;


    @Before
    public void setUp() throws Exception {
        gitHub = new GitHub();
    }

    @Test
    public void canFetchUser() throws Exception {
        User user = gitHub.getUser("michael-johansen");

        assertThat(user, is(notNullValue()));
        assertThat(user.getName(), is("Michael Johansen"));
    }

    @Test
    public void canFetchRepository() throws Exception {
        Repository repository = gitHub.getRepository("michael-johansen", "github-api");

        assertThat(repository, is(notNullValue()));
        assertThat(repository.getName(), is("github-api"));
    }

    @Test
    public void canSearchForUsers() throws Exception {
        UserSearchResult result = gitHub.searchForUser(new SearchRequest("michael", 1, 10));

        result.getUsers().stream().map(User::getScore).reduce((left, right) -> {
            if (left < right) throw new IllegalStateException("Not sorted");
            return right;
        });
        System.out.println("sorted");
    }
}
