package com.batuhanaslan.northwind.dataAccess.abstracts;

import com.batuhanaslan.northwind.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product,Integer> {
}
