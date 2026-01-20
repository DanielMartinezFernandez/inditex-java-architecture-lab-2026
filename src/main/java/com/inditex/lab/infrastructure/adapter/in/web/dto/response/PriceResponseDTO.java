package com.inditex.lab.infrastructure.adapter.in.web.dto.response;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Immutable DTO representing the price applicable to a product for a given time window.
 * Field names are serialized using kebab-case to match the external API contract.
 * <br>
 * Author email reflects code ownership for traceability in this exercise repository.
 *
 * @author dmf.api@gmail.com
 * @version 1.0
 * @since 21
 *
 * @param productId Product identifier
 * @param brandId Retail brand identifier
 * @param priceId Applicable price identifier
 * @param initDate Start date-time when the price becomes effective
 * @param expirationDate End date-time when the price is no longer effective
 * @param price Product price amount in the given currency
 * @param currency ISO currency code of the price (e.g., EUR)
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
