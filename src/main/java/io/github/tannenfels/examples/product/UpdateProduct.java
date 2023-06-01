package io.github.tannenfels.examples.product;

import io.github.tannenfels.Client;
import io.github.tannenfels.configs.Configs;
import io.github.tannenfels.entity.Product;
import io.github.tannenfels.examples.Example;

/**
 * UpdateProduct.
 *
 * @author javastream
 */
public class UpdateProduct extends Example {

    public static void main(String[] args) {
        Client client = boot();

        int productId = AddProduct.handle().getId();

        Product product = client.productService().get(productId);
        product.setCode("utr256587");
        product.setName("Super Router");

        client.productService().update(product);
    }
}