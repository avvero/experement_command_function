package com.company;

/**
 * Created by Avvero on 17.05.2017.
 */
public class CommonConnection implements Connection {

    @Override
    public <R extends Response> R send(Request request) {
        //send to socket
        return null;
    }

    public <R extends Response> R process(Command<R> command) {
        return command.process(this);
    }

    @Override
    public void close() {

    }
}
