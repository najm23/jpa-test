package com.starsapp.learning.jpa.jpatest.service;

import com.starsapp.learning.jpa.jpatest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
