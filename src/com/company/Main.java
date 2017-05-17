package com.company;

import com.company.command.AuthRequest;
import com.company.command.AuthResponse;
import com.company.command.CreateClientRequest;
import com.company.command.CreateClientResponse;

public class Main {

    public static void main(String[] args) {

        Connection connection = new CommonConnection();

        CreateClientResponse createClientResponse = connection.send(conn -> {
            AuthResponse response = conn.send(new AuthRequest("login"));
            CreateClientResponse response2 = conn.send(new CreateClientRequest(101));
            conn.close();
            return response2;
        });

        CreateClientResponse response2 = new API(new OneTimeConnectionFactory()).createClientRequest(new CreateClientRequest(101));
    }
}
