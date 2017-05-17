package com.company.command;

import com.company.Request;

/**
 * Created by Avvero on 17.05.2017.
 */
public class AuthRequest implements Request {

    String login;

    public AuthRequest(String login) {
        this.login = login;
    }
}
