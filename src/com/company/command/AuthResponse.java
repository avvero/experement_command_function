package com.company.command;

import com.company.Response;

/**
 * Created by Avvero on 17.05.2017.
 */
public class AuthResponse implements Response {

    String code;

    public AuthResponse(String code) {
        this.code = code;
    }
}
