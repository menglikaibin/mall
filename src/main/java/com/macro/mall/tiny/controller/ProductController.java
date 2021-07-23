package com.macro.mall.tiny.controller;

import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.entity.product.ShowProduct;
import com.macro.mall.tiny.mbg.model.PmsProduct;
import com.macro.mall.tiny.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Api(tags = "ProductController", description = "产品管理")
@Controller
@RequestMapping("/product")
public class ProductController {
    public static final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private ProductService productService;

    @ApiOperation("创建产品")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult createProduct(@RequestBody PmsProduct product) {
        CommonResult commonResult;
        int count = productService.createProduct(product);
        if (count == 1) {
            commonResult = CommonResult.success(product);
            LOGGER.debug("商品创建成功: {}", product);
        } else {
            commonResult = CommonResult.failed("操作失败");
            LOGGER.debug("商品创建失败: {}", product);
        }

        return commonResult;
    }

    @ApiOperation("商品详情")
    @RequestMapping(value = "/show/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<ShowProduct> show(@PathVariable Long id) {
        ShowProduct product;

        product = productService.show(id);

        return CommonResult.success(product);
    }
}
