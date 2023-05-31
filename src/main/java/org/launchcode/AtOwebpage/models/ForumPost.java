package org.launchcode.AtOwebpage.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
public class ForumPost {

    @Id
    @GeneratedValue
    private int id;

    @Size(min=3, message="Post must be a minimum of 3 characters.")
    private String post;

    public ForumPost(@Size(min=3, message="Post must be a minimum of 3 characters.") String post) {
        this.post = post;
    }

    public ForumPost() {
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumPost forumPost = (ForumPost) o;
        return id == forumPost.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return post;
    }
}
