package com.inditex.lab.infrastructure.adapter.in.web;

import com.inditex.lab.infrastructure.adapter.in.web.dto.response.PriceResponseDTO;
import jakarta.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * REST controller exposing endpoints related to product prices.
 * Provides read-only access to the applicable price for a given product, brand and search date.
 * <br>
 * Author email reflects code ownership for traceability in this exercise repository.
 *
 * @author dmf.api@gmail.com
 * @version 1.0
 * @since 21
 */
@RestController
@RequestMapping("/api/products")
public class ProductPriceController {

    /**
     * Returns the applicable price for a given product and brand at a specific date and time.
     * <p>
     * This endpoint matches the OpenAPI contract defined at
     * {@code GET /products/{product-id}/prices} and expects:
     * </p>
     * <ul>
     *   <li><b>product-id</b> (path): Product identifier.</li>
     *   <li><b>brand-id</b> (query): Brand identifier.</li>
     *   <li><b>search-date</b> (query): ISO-8601 date-time for which the price is requested
     *   (e.g. {@code 2020-06-14T10:00:00}).</li>
     * </ul>
     * <p>
     * On success, it returns HTTP 200 with a JSON body containing the price information
     * (product-id, brand-id, price-id, init-date, expiration-date, price, currency).
     * Possible error outcomes according to the contract include 400 (invalid request),
     * 404 (no price found) and 500 (server error).
     * </p>
     *
     * @param productId   Product identifier (path variable "product-id").
     * @param brandId     Brand identifier (query parameter "brand-id").
     * @param searchDate  Date-time for which the price is requested (query parameter "search-date", ISO-8601 format).
     * @return HTTP 200 with the applicable price details as {@link PriceResponseDTO}.
     */
    @GetMapping(value ="/{product-id}/prices",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PriceResponseDTO> getPrice(
            @PathVariable(name = "product-id")
            @NotNull
            Long productId,
            @RequestParam(name = "brand-id")
            @NotNull
            Long brandId,
            @RequestParam(name = "search-date")
            @NotNull
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
            LocalDateTime searchDate){
         //TODO Respuesta de ejemplo construida a partir de los datos de entrada
        LocalDateTime init = searchDate.minusDays(1);
        LocalDateTime end = searchDate.plusDays(1);
        return ResponseEntity.ok(new PriceResponseDTO(
                productId,
                brandId,
                5678L, // priceId de ejemplo
                init,
                end,
                new BigDecimal("35.50"), "EUR"));
    }
}
