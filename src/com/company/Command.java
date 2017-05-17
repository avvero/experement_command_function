package com.company;

/**
 * Created by Avvero on 17.05.2017.
 */
public interface Command<S extends Response> {

    S process(Connection connection);

}
