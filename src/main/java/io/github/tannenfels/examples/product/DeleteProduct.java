package io.github.tannenfels.examples.product;

import io.github.tannenfels.Client;
import io.github.tannenfels.configs.Configs;

/**
 * DeleteProduct.
 *
 * @author javastream
 */
public class DeleteProduct {

    public static void main(String[] args) {
        Client client = new Client(
                Configs.token,
                Configs.account,
                Configs.restId
        );

        client.productService().delete(6);
    }
}