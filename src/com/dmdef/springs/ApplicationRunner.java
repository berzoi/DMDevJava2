package com.dmdef.springs;

import com.dmdef.springs.database.pool.ConnectionPool;
import com.dmdef.springs.database.repository.CompanyRepository;
import com.dmdef.springs.database.repository.UserRepository;
import com.dmdef.springs.ios.Container;
import com.dmdef.springs.service.UserService;

public class ApplicationRunner {
    public static void main(String[] args) {
        var container = new Container();

//        var connectionPool = new ConnectionPool();
//        var userRepository = new UserRepository(connectionPool);
//        var companyRepository = new CompanyRepository(connectionPool);
//        var userService = new UserService(userRepository, companyRepository);

//        var connectionPool = container.get(ConnectionPool.class);
//        var userRepository = container.get(UserRepository.class);
//        var companyRepository = container.get(CompanyRepository.class);
        var userService = container.get(UserService.class);
    }
}
