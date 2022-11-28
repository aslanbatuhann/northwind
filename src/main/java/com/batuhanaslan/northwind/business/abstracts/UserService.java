package com.batuhanaslan.northwind.business.abstracts;

import com.batuhanaslan.northwind.core.entities.User;
import com.batuhanaslan.northwind.core.utilities.results.DataResult;
import com.batuhanaslan.northwind.core.utilities.results.Result;

public interface UserService {
    DataResult<User> getByEmail(String email);

    Result add(User user);
}
