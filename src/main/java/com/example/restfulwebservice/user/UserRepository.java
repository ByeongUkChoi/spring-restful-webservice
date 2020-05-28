package com.example.restfulwebservice.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// JpaRepisitory<타입, 타입의 pk값 자료형>
public interface UserRepository extends JpaRepository<User, Integer> {
}
