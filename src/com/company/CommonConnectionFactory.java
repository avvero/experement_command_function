package com.company;

import com.company.command.AuthRequest;
import com.company.command.AuthResponse;
import com.company.command.CreateClientRequest;
import com.company.command.CreateClientResponse;

/**
 * Created by Avvero on 17.05.2017.
 */
public class CommonConnectionFactory implements ConnectionFactory {

    @Override
    public Connection getConnection() {
        Connection connection = new CommonConnection();
        connection.process(conn -> {
            AuthResponse response = conn.send(new AuthRequest("login"));
            CreateClientResponse response2 = conn.send(new CreateClientRequest(101));
            return null;
        });
        return connection;
    }

}
