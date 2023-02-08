package com.javastream.examples;

import com.javastream.Client;
import com.javastream.configs.Configs;

abstract public class Example {
    public static Client boot()
    {
        return new Client(
                Configs.token,
                Configs.account,
                Configs.restId
        );
    }
}
