package com.pfe.MicroServiceA.repository;

import com.pfe.MicroServiceA.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> { }
