package com.starsapp.learning.jpa.jpatest;

import com.starsapp.learning.jpa.jpatest.entity.User;
import com.starsapp.learning.jpa.jpatest.service.UserDAOService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner {

    private Logger log = LoggerFactory.getLogger(UserDAOServiceCommandLineRunner.class);
    @Autowired
    UserDAOService userDAOService;

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Najm","Admin");
        long insert = userDAOService.insert(user);
        log.info("New user is created ID = "+insert);
    }
}
