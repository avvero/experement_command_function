package com.company.command;

import com.company.Request;

/**
 * Created by Avvero on 17.05.2017.
 */
public class CreateClientRequest implements Request {

    int clientId;

    public CreateClientRequest(int clientId) {
        this.clientId = clientId;
    }
}
