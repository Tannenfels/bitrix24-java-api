package io.github.tannenfels.examples.product;

import io.github.tannenfels.Client;
import io.github.tannenfels.configs.Configs;
import io.github.tannenfels.entity.Product;

/**
 * GetProduct.
 *
 * @author javastream
 */
public class GetProduct {

    public static void main(String[] args) {
        Client client = new Client(
                Configs.token,
                Configs.account,
                Configs.restId
        );

        Product product = client.productService().get(4);
    }
}