package com.inditex.lab.infrastructure.adapter.in.web;

import com.inditex.lab.infrastructure.adapter.in.web.dto.response.PriceResponseDTO;
import jakarta.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/products")
public class ProductPriceController {

    /**
     *
     * @param searchDate Date of the price sought
     * @param productId Product identifier
     * @param brandId Retail brand
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
         // Respuesta de ejemplo construida a partir de los datos de entrada
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
