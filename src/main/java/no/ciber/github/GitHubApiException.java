package no.ciber.github;

/**
 * User: Michael Johansen
 * Date: 14.04.2015
 * Time: 13:19
 */
public class GitHubApiException extends RuntimeException {
    public GitHubApiException(Exception e) {
        super(e);
    }
}
