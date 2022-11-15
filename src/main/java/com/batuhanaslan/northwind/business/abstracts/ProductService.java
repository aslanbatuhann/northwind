package com.batuhanaslan.northwind.business.abstracts;

import com.batuhanaslan.northwind.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
}
