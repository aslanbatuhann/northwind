package com.batuhanaslan.northwind.business.abstracts;

import com.batuhanaslan.northwind.core.utilities.results.DataResult;
import com.batuhanaslan.northwind.core.utilities.results.Result;
import com.batuhanaslan.northwind.entities.concretes.Product;
import com.batuhanaslan.northwind.entities.dtos.ProductWithCategoryDto;

import java.util.List;

public interface ProductService {
    DataResult<List<Product>> getAll();

    DataResult<List<Product>> getAllSorted();

    DataResult<List<Product>> getAll(int pageNo, int pageSize);

    Result add(Product product);

    DataResult<Product> getByProductName(String productName);

    DataResult<Product> getByProductNameAndCategory_CategoryId(String productName, int categoryId);

    DataResult<List<Product>> getByProductNameOrCategory_CategoryId(String productName, int categoryId);

    DataResult<List<Product>> getByCategoryIn(List<Integer> categories);

    DataResult<List<Product>> getByProductNameContains(String productName);

    DataResult<List<Product>> getByProductNameStartsWith(String productName);

    DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId);

    DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails();
}
