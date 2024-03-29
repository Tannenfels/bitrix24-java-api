package io.github.tannenfels.lead;

import io.github.tannenfels.Client;
import io.github.tannenfels.entity.ProductSection;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * ProductSectionTest.
 *
 * @author javastream
 */
public class ProductSectionTest {

    private final Client client = new Client(
            Configs.token,
            Configs.account,
            Configs.restId
    );

    @DisplayName("ProductSection.getProductSectionById()")
    @Test
    void testGetProductSectionById() {
        ProductSection productSection = client.productSectionService().get(8);

        assertEquals(8, productSection.getId());
    }
}
