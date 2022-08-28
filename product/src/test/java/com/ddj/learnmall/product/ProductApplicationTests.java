package com.ddj.learnmall.product;

import com.ddj.learnmall.product.entity.BrandEntity;
import com.ddj.learnmall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductApplicationTests {
    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("doudouj");
        brandService.save(brandEntity);
        System.out.println("success ...");
    }

}
