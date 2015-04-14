package no.ciber.github.model;

import com.google.gson.annotations.SerializedName;

public class User {

    private String login;
    private Integer id;
    @SerializedName("avatar_url")
    private String avatarUrl;
    @SerializedName("gravatar_id")
    private String gravatarId;
    private String url;
    @SerializedName("html_url")
    private String htmlUrl;
    @SerializedName("followers_url")
    private String followersUrl;
    @SerializedName("following_url")
    private String followingUrl;
    @SerializedName("gists_url")
    private String gistsUrl;
    @SerializedName("starred_url")
    private String starredUrl;
    @SerializedName("subscriptions_url")
    private String subscriptionsUrl;
    @SerializedName("organizations_url")
    private String organizationsUrl;
    @SerializedName("repos_url")
    private String reposUrl;
    @SerializedName("events_url")
    private String eventsUrl;
    @SerializedName("received_events_url")
    private String receivedEventsUrl;
    private String type;
    @SerializedName("site_admin")
    private Boolean siteAdmin;
    private String name;
    private String company;
    private String blog;
    private String location;
    private String email;
    private Boolean hireable;
    private Object bio;
    @SerializedName("public_repos")
    private Integer publicRepos;
    @SerializedName("public_gists")
    private Integer publicGists;
    private Integer followers;
    private Integer following;
    @SerializedName("created_at")
    private String createdAt;
    @SerializedName("updated_at")
    private String updatedAt;
    private Double score;

    /**
     * @return The login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login The login
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return The avatarUrl
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * @param avatarUrl The avatar_url
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    /**
     * @return The gravatarId
     */
    public String getGravatarId() {
        return gravatarId;
    }

    /**
     * @param gravatarId The gravatar_id
     */
    public void setGravatarId(String gravatarId) {
        this.gravatarId = gravatarId;
    }

    /**
     * @return The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return The htmlUrl
     */
    public String getHtmlUrl() {
        return htmlUrl;
    }

    /**
     * @param htmlUrl The html_url
     */
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    /**
     * @return The followersUrl
     */
    public String getFollowersUrl() {
        return followersUrl;
    }

    /**
     * @param followersUrl The followers_url
     */
    public void setFollowersUrl(String followersUrl) {
        this.followersUrl = followersUrl;
    }

    /**
     * @return The followingUrl
     */
    public String getFollowingUrl() {
        return followingUrl;
    }

    /**
     * @param followingUrl The following_url
     */
    public void setFollowingUrl(String followingUrl) {
        this.followingUrl = followingUrl;
    }

    /**
     * @return The gistsUrl
     */
    public String getGistsUrl() {
        return gistsUrl;
    }

    /**
     * @param gistsUrl The gists_url
     */
    public void setGistsUrl(String gistsUrl) {
        this.gistsUrl = gistsUrl;
    }

    /**
     * @return The starredUrl
     */
    public String getStarredUrl() {
        return starredUrl;
    }

    /**
     * @param starredUrl The starred_url
     */
    public void setStarredUrl(String starredUrl) {
        this.starredUrl = starredUrl;
    }

    /**
     * @return The subscriptionsUrl
     */
    public String getSubscriptionsUrl() {
        return subscriptionsUrl;
    }

    /**
     * @param subscriptionsUrl The subscriptions_url
     */
    public void setSubscriptionsUrl(String subscriptionsUrl) {
        this.subscriptionsUrl = subscriptionsUrl;
    }

    /**
     * @return The organizationsUrl
     */
    public String getOrganizationsUrl() {
        return organizationsUrl;
    }

    /**
     * @param organizationsUrl The organizations_url
     */
    public void setOrganizationsUrl(String organizationsUrl) {
        this.organizationsUrl = organizationsUrl;
    }

    /**
     * @return The reposUrl
     */
    public String getReposUrl() {
        return reposUrl;
    }

    /**
     * @param reposUrl The repos_url
     */
    public void setReposUrl(String reposUrl) {
        this.reposUrl = reposUrl;
    }

    /**
     * @return The eventsUrl
     */
    public String getEventsUrl() {
        return eventsUrl;
    }

    /**
     * @param eventsUrl The events_url
     */
    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    /**
     * @return The receivedEventsUrl
     */
    public String getReceivedEventsUrl() {
        return receivedEventsUrl;
    }

    /**
     * @param receivedEventsUrl The received_events_url
     */
    public void setReceivedEventsUrl(String receivedEventsUrl) {
        this.receivedEventsUrl = receivedEventsUrl;
    }

    /**
     * @return The type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return The siteAdmin
     */
    public Boolean getSiteAdmin() {
        return siteAdmin;
    }

    /**
     * @param siteAdmin The site_admin
     */
    public void setSiteAdmin(Boolean siteAdmin) {
        this.siteAdmin = siteAdmin;
    }

    /**
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The company
     */
    public String getCompany() {
        return company;
    }

    /**
     * @param company The company
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * @return The blog
     */
    public String getBlog() {
        return blog;
    }

    /**
     * @param blog The blog
     */
    public void setBlog(String blog) {
        this.blog = blog;
    }

    /**
     * @return The location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location The location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return The email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email The email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return The hireable
     */
    public Boolean getHireable() {
        return hireable;
    }

    /**
     * @param hireable The hireable
     */
    public void setHireable(Boolean hireable) {
        this.hireable = hireable;
    }

    /**
     * @return The bio
     */
    public Object getBio() {
        return bio;
    }

    /**
     * @param bio The bio
     */
    public void setBio(Object bio) {
        this.bio = bio;
    }

    /**
     * @return The publicRepos
     */
    public Integer getPublicRepos() {
        return publicRepos;
    }

    /**
     * @param publicRepos The public_repos
     */
    public void setPublicRepos(Integer publicRepos) {
        this.publicRepos = publicRepos;
    }

    /**
     * @return The publicGists
     */
    public Integer getPublicGists() {
        return publicGists;
    }

    /**
     * @param publicGists The public_gists
     */
    public void setPublicGists(Integer publicGists) {
        this.publicGists = publicGists;
    }

    /**
     * @return The followers
     */
    public Integer getFollowers() {
        return followers;
    }

    /**
     * @param followers The followers
     */
    public void setFollowers(Integer followers) {
        this.followers = followers;
    }

    /**
     * @return The following
     */
    public Integer getFollowing() {
        return following;
    }

    /**
     * @param following The following
     */
    public void setFollowing(Integer following) {
        this.following = following;
    }

    /**
     * @return The createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt The created_at
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return The updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @param updatedAt The updated_at
     */
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "User{" +
                "avatarUrl='" + avatarUrl + '\'' +
                ", login='" + login + '\'' +
                ", id=" + id +
                ", gravatarId='" + gravatarId + '\'' +
                ", url='" + url + '\'' +
                ", htmlUrl='" + htmlUrl + '\'' +
                ", followersUrl='" + followersUrl + '\'' +
                ", followingUrl='" + followingUrl + '\'' +
                ", gistsUrl='" + gistsUrl + '\'' +
                ", starredUrl='" + starredUrl + '\'' +
                ", subscriptionsUrl='" + subscriptionsUrl + '\'' +
                ", organizationsUrl='" + organizationsUrl + '\'' +
                ", reposUrl='" + reposUrl + '\'' +
                ", eventsUrl='" + eventsUrl + '\'' +
                ", receivedEventsUrl='" + receivedEventsUrl + '\'' +
                ", type='" + type + '\'' +
                ", siteAdmin=" + siteAdmin +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", blog='" + blog + '\'' +
                ", location='" + location + '\'' +
                ", email='" + email + '\'' +
                ", hireable=" + hireable +
                ", bio=" + bio +
                ", publicRepos=" + publicRepos +
                ", publicGists=" + publicGists +
                ", followers=" + followers +
                ", following=" + following +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (login != null ? !login.equals(user.login) : user.login != null) return false;
        if (id != null ? !id.equals(user.id) : user.id != null) return false;
        if (avatarUrl != null ? !avatarUrl.equals(user.avatarUrl) : user.avatarUrl != null) return false;
        if (gravatarId != null ? !gravatarId.equals(user.gravatarId) : user.gravatarId != null) return false;
        if (url != null ? !url.equals(user.url) : user.url != null) return false;
        if (htmlUrl != null ? !htmlUrl.equals(user.htmlUrl) : user.htmlUrl != null) return false;
        if (followersUrl != null ? !followersUrl.equals(user.followersUrl) : user.followersUrl != null) return false;
        if (followingUrl != null ? !followingUrl.equals(user.followingUrl) : user.followingUrl != null) return false;
        if (gistsUrl != null ? !gistsUrl.equals(user.gistsUrl) : user.gistsUrl != null) return false;
        if (starredUrl != null ? !starredUrl.equals(user.starredUrl) : user.starredUrl != null) return false;
        if (subscriptionsUrl != null ? !subscriptionsUrl.equals(user.subscriptionsUrl) : user.subscriptionsUrl != null)
            return false;
        if (organizationsUrl != null ? !organizationsUrl.equals(user.organizationsUrl) : user.organizationsUrl != null)
            return false;
        if (reposUrl != null ? !reposUrl.equals(user.reposUrl) : user.reposUrl != null) return false;
        if (eventsUrl != null ? !eventsUrl.equals(user.eventsUrl) : user.eventsUrl != null) return false;
        if (receivedEventsUrl != null ? !receivedEventsUrl.equals(user.receivedEventsUrl) : user.receivedEventsUrl != null)
            return false;
        if (type != null ? !type.equals(user.type) : user.type != null) return false;
        if (siteAdmin != null ? !siteAdmin.equals(user.siteAdmin) : user.siteAdmin != null) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        if (company != null ? !company.equals(user.company) : user.company != null) return false;
        if (blog != null ? !blog.equals(user.blog) : user.blog != null) return false;
        if (location != null ? !location.equals(user.location) : user.location != null) return false;
        if (email != null ? !email.equals(user.email) : user.email != null) return false;
        if (hireable != null ? !hireable.equals(user.hireable) : user.hireable != null) return false;
        if (bio != null ? !bio.equals(user.bio) : user.bio != null) return false;
        if (publicRepos != null ? !publicRepos.equals(user.publicRepos) : user.publicRepos != null) return false;
        if (publicGists != null ? !publicGists.equals(user.publicGists) : user.publicGists != null) return false;
        if (followers != null ? !followers.equals(user.followers) : user.followers != null) return false;
        if (following != null ? !following.equals(user.following) : user.following != null) return false;
        if (createdAt != null ? !createdAt.equals(user.createdAt) : user.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(user.updatedAt) : user.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = login != null ? login.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (avatarUrl != null ? avatarUrl.hashCode() : 0);
        result = 31 * result + (gravatarId != null ? gravatarId.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (htmlUrl != null ? htmlUrl.hashCode() : 0);
        result = 31 * result + (followersUrl != null ? followersUrl.hashCode() : 0);
        result = 31 * result + (followingUrl != null ? followingUrl.hashCode() : 0);
        result = 31 * result + (gistsUrl != null ? gistsUrl.hashCode() : 0);
        result = 31 * result + (starredUrl != null ? starredUrl.hashCode() : 0);
        result = 31 * result + (subscriptionsUrl != null ? subscriptionsUrl.hashCode() : 0);
        result = 31 * result + (organizationsUrl != null ? organizationsUrl.hashCode() : 0);
        result = 31 * result + (reposUrl != null ? reposUrl.hashCode() : 0);
        result = 31 * result + (eventsUrl != null ? eventsUrl.hashCode() : 0);
        result = 31 * result + (receivedEventsUrl != null ? receivedEventsUrl.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (siteAdmin != null ? siteAdmin.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (company != null ? company.hashCode() : 0);
        result = 31 * result + (blog != null ? blog.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (hireable != null ? hireable.hashCode() : 0);
        result = 31 * result + (bio != null ? bio.hashCode() : 0);
        result = 31 * result + (publicRepos != null ? publicRepos.hashCode() : 0);
        result = 31 * result + (publicGists != null ? publicGists.hashCode() : 0);
        result = 31 * result + (followers != null ? followers.hashCode() : 0);
        result = 31 * result + (following != null ? following.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}