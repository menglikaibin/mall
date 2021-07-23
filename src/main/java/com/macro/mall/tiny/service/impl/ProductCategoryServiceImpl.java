package com.macro.mall.tiny.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.macro.mall.tiny.mbg.mapper.PmsProductCategoryMapper;
import com.macro.mall.tiny.mbg.model.PmsProductCategory;
import com.macro.mall.tiny.service.ProductCategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ProductCategoryServiceImpl extends ServiceImpl<PmsProductCategoryMapper, PmsProductCategory> implements ProductCategoryService {
    public static final Logger LOGGER = LoggerFactory.getLogger(ProductCategoryServiceImpl.class);
}
