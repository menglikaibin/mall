package com.macro.mall.tiny.service.impl;

import com.macro.mall.tiny.entity.product.ProductBrand;
import com.macro.mall.tiny.entity.product.ShowProduct;
import com.macro.mall.tiny.mbg.mapper.PmsBrandMapper;
import com.macro.mall.tiny.mbg.mapper.PmsProductMapper;
import com.macro.mall.tiny.mbg.model.PmsBrand;
import com.macro.mall.tiny.mbg.model.PmsProduct;
import com.macro.mall.tiny.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Resource
    private PmsProductMapper productMapper;

    @Resource
    private PmsBrandMapper brandMapper;

    @Override
    public int createProduct(PmsProduct product) {
        return productMapper.insertSelective(product);
    }

    @Override
    public int updateProduct(Long id, PmsProduct brand) {
        return 0;
    }

    @Override
    public int deleteProduct(Long id) {
        return 0;
    }

    @Override
    public List<PmsProduct> listBrand(int page, int perPage) {
        return null;
    }

    @Override
    public ShowProduct show(Long id) {
        ShowProduct product = new ShowProduct();

        PmsProduct pmsProduct = productMapper.selectByPrimaryKey(id);
        PmsBrand pmsBrand = brandMapper.selectByPrimaryKey(pmsProduct.getBrandId());

        ProductBrand productBrand = new ProductBrand();
        productBrand.setId(pmsBrand.getId());
        productBrand.setName(pmsBrand.getName());


        product.setId(pmsProduct.getId());
        product.setName(pmsProduct.getName());
        product.setBrand(productBrand);
        return product;
    }
}
