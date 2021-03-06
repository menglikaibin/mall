package com.macro.mall.tiny.service;

import com.macro.mall.tiny.entity.product.ProductBrand;
import com.macro.mall.tiny.entity.product.ShowProduct;
import com.macro.mall.tiny.mbg.model.PmsProduct;

import java.util.List;

/**
 * ProductService
 */
public interface ProductService {
    int createProduct(PmsProduct product);

    int updateProduct(Long id, PmsProduct brand);

    int deleteProduct(Long id);

    List<PmsProduct> listBrand(int page, int perPage);

    ShowProduct show(Long id);
}
