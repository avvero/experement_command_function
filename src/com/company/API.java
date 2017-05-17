package com.company;

import com.company.command.CreateClientRequest;
import com.company.command.CreateClientResponse;

/**
 * Created by Avvero on 17.05.2017.
 */
public class API {

    ConnectionFactory connectionFactory;

    public API(ConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }

    public CreateClientResponse createClientRequest(CreateClientRequest request) {
        return connectionFactory.getConnection().send(request);
    }

}
