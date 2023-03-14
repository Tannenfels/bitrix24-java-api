package io.github.tannenfels.examples;

import io.github.tannenfels.Client;
import io.github.tannenfels.configs.Configs;

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
