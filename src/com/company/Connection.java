package com.company;

/**
 * Created by Avvero on 17.05.2017.
 */
public interface Connection {

    <R extends Response> R send(Request request);

    <R extends Response> R send(Command<R> command);

    void close();

}
