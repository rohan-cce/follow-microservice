package com.example.follow.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Follow {
    @Id
    private String id;
    private List<String> friends;
    private List<String> pending;
    private List<String> requested;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public List<String> getPending() {
        return pending;
    }

    public void setPending(List<String> pending) {
        this.pending = pending;
    }

    public List<String> getRequested() {
        return requested;
    }

    public void setRequested(List<String> requested) {
        this.requested = requested;
    }

    @Override
    public String toString() {
        return "Follow{" +
                "id='" + id + '\'' +
                ", friends=" + friends +
                ", pending=" + pending +
                ", requested=" + requested +
                '}';
    }
}
