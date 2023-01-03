package com.order.ecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import javax.validation.constraints.NotNull;

@Data
@Builder
@AllArgsConstructor
@Jacksonized
public class OrderItemDto {

    @NotNull
    private final String productId;
    @NotNull
    private final String quantity;
}
