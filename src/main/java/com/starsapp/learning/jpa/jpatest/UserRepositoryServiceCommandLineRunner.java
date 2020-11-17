package com.starsapp.learning.jpa.jpatest;

import com.starsapp.learning.jpa.jpatest.entity.User;
import com.starsapp.learning.jpa.jpatest.service.UserDAOService;
import com.starsapp.learning.jpa.jpatest.service.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserRepositoryServiceCommandLineRunner implements CommandLineRunner {

    private Logger log = LoggerFactory.getLogger(UserRepositoryServiceCommandLineRunner.class);
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User("Najmeddine1","superAdmin");
        User user2 = new User("Najmeddine2","superAdmin");
        User user3 = new User("Najmeddine3","superAdmin");

        userRepository.save(user1);
        log.info("TESTEST New user is created  = "+user1);
        userRepository.save(user2);
        log.info("TESTEST New user is created  = "+user2);
        userRepository.save(user3);
        log.info("TESTEST New user is created  = "+user3);

        Optional<User> userONE =userRepository.findById(1l);
        log.info("TESTEST user one  = "+userONE);

        List<User> userList = userRepository.findAll();
        log.info("TESTEST All Users  = " + userList);

        userRepository.delete(user1);
        log.info("TESTEST USER deleted = "+user1);

        List<User> userList1 = userRepository.findAll();
        log.info("TESTEST All Users after delete first  = " + userList1);
    }
}
