package com.batuhanaslan.northwind.api.controllers;

import com.batuhanaslan.northwind.business.abstracts.ProductService;
import com.batuhanaslan.northwind.core.utilities.results.DataResult;
import com.batuhanaslan.northwind.core.utilities.results.Result;
import com.batuhanaslan.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductsController {

    private ProductService productService;

    @Autowired
    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/getall")
    public DataResult<List<Product>> getAll() {
        return this.productService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Product product) {
        return this.productService.add(product);

    }
}
