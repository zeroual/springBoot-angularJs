package models;

/**
 * Created by zeroual on 25/04/15.
 */
public class Post {

    private String username;
    private String postBody;

    public Post() {
    }

    public Post(String username, String postBody) {
        this.username = username;
        this.postBody = postBody;
    }

    public String getUsername() {
        return username;
    }

    public String getPostBody() {
        return postBody;
    }
}
