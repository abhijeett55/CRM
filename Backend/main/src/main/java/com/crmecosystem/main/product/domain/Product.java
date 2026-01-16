package com.crmecosystem.main.product.domain;

import java.math.BigDecimal;



import jakarta.persistence.Table;
import lombok.Data;
import tools.jackson.databind.annotation.JsonSerialize;


@Data
@Table( name = "product")
public class Product {

    //@Schema(description = "des_name")
    private String organisationId;

    private String name;

    // min and max value
    @JsonSerialize()
    private BigDecimal price;

    private String status;

    private Long pos;
}