package com.jis.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jis.crud.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
