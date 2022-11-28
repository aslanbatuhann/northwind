package com.batuhanaslan.northwind.business.concretes;

import com.batuhanaslan.northwind.business.abstracts.UserService;
import com.batuhanaslan.northwind.core.dataAccess.UserDao;
import com.batuhanaslan.northwind.core.entities.User;
import com.batuhanaslan.northwind.core.utilities.results.DataResult;
import com.batuhanaslan.northwind.core.utilities.results.Result;
import com.batuhanaslan.northwind.core.utilities.results.SuccessDataResult;
import com.batuhanaslan.northwind.core.utilities.results.SuccessResult;
import com.batuhanaslan.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManager implements UserService {

    private UserDao userDao;

    @Autowired
    public UserManager(UserDao userDao) {
        super();
        this.userDao = userDao;
    }

    @Override
    public DataResult<User> getByEmail(String email) {
        return new SuccessDataResult<User>(this.userDao.getByEmail(email),
                "kullanıcı buldu.");
    }

    @Override
    public Result add(User user) {
        this.userDao.save(user);
        return new SuccessResult("Kullanıcı kaydedildi.");
    }
}
