package com.inditex.lab.api;

import com.inditex.lab.infrastructure.adapter.in.web.ProductPriceController;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(controllers = ProductPriceController.class)
class ProductPriceControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("GET /api/products/{price-id}/prices acepta JSON PriceRequestDTO y devuelve JSON PriceResponseDTO")
    void getPrice_shouldAcceptRequestParamPathParamAndReturnJsonResponse() throws Exception {
        mockMvc.perform(get("/api/products/35455/prices?brand-id=1234&search-date=2020-06-13T10:00:00")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.product-id").value(35455))
                .andExpect(jsonPath("$.brand-id").value(1234))
                .andExpect(jsonPath("$.price-id").value(5678))
                .andExpect(jsonPath("$.init-date").value("2020-06-12T10:00:00"))
                .andExpect(jsonPath("$.expiration-date").value("2020-06-14T10:00:00"))
                .andExpect(jsonPath("$.price").value(35.50D))
                .andExpect(jsonPath("$.currency").value("EUR"));

    }
}
