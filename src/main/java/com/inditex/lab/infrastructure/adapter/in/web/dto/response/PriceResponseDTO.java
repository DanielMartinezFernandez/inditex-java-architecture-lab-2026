package com.inditex.lab.infrastructure.adapter.in.web.dto.response;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 *
 * @param productId Product identifier
 * @param brandId Retail brand
 * @param priceId Applicable price id
 * @param initDate Applicable price init date
 * @param expirationDate Applicable price expiration date
 * @param price Product price in determined currency
 */
@JsonNaming(PropertyNamingStrategies.KebabCaseStrategy.class)
public record PriceResponseDTO(
        long productId,
        long brandId,
        long priceId,
        LocalDateTime initDate,
        LocalDateTime expirationDate,
        BigDecimal price,
        String currency) {
}
