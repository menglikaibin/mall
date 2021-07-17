package com.macro.mall.tiny.service.impl;

import com.macro.mall.tiny.mbg.mapper.PmsProductMapper;
import com.macro.mall.tiny.mbg.model.PmsProduct;
import com.macro.mall.tiny.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Resource
    private PmsProductMapper productMapper;

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
    public PmsProduct show(Long id) {
        return productMapper.selectByPrimaryKey(id);
    }
}
