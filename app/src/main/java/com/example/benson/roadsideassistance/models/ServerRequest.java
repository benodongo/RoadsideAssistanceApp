package com.example.benson.roadsideassistance.models;

/**
 * Created by benson on 8/11/16.
 */
public class ServerRequest {
    private String operation;
    private User user;

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
