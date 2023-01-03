package com.order.ecommerce.dto;

import javax.validation.constraints.NotNull;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class ProductDto {

    @NotNull
    private final String productId;

    @NotNull
    private final String sku;

    @NotNull
    private final String title;

    @NotNull
    private final String description;

    private final double price;
}
