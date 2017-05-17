package com.company;

/**
 * Created by Avvero on 17.05.2017.
 */
public class OneTimeConnectionFactory implements ConnectionFactory {

    CommonConnectionFactory commonConnectionFactory;

    @Override
    public Connection getConnection() {
        Connection inner = commonConnectionFactory.getConnection();
        Connection connection = new Connection() {
            @Override
            public <R extends Response> R send(Request request) {
                R r = inner.send(request);
                close();
                return r;
            }

            @Override
            public <R extends Response> R send(Command<R> command) {
                R r = inner.send(command);
                close();
                return r;
            }

            @Override
            public void close() {
                inner.close();
            }
        };
        return connection;
    }

}
