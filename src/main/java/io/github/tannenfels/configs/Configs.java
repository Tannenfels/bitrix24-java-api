package io.github.tannenfels.configs;

import io.github.cdimascio.dotenv.Dotenv;

public class Configs {
    public static final String token = Dotenv.load().get("TOKEN");
    public static final String account = Dotenv.load().get("ACCOUNT");
    public static final int restId = Integer.parseInt(Dotenv.load().get("REST_ID"));
}
