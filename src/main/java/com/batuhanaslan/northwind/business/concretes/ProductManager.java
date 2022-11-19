package com.batuhanaslan.northwind.business.concretes;

import com.batuhanaslan.northwind.business.abstracts.ProductService;
import com.batuhanaslan.northwind.core.utilities.results.DataResult;
import com.batuhanaslan.northwind.core.utilities.results.Result;
import com.batuhanaslan.northwind.core.utilities.results.SuccessDataResult;
import com.batuhanaslan.northwind.core.utilities.results.SuccessResult;
import com.batuhanaslan.northwind.dataAccess.abstracts.ProductDao;
import com.batuhanaslan.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductManager implements ProductService {

    private ProductDao productDao;

    @Autowired
    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public DataResult<List<Product>> getAll() {
        return new SuccessDataResult<List<Product>>(this.productDao.findAll(),
                "Data Listelendi");
    }

    @Override
    public Result add(Product product) {
        this.productDao.save(product);
        return new SuccessResult("Ürün eklendi");
    }
}
