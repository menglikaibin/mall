package com.macro.mall.tiny.entity.product;

import lombok.Data;

@Data
public class ShowProduct {
    protected Long id;

    protected String name;

    protected ProductBrand brand;
}
