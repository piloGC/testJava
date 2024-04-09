package com.test.Test.repository;

import com.test.Test.entity.UserResponse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserResponseRepository extends JpaRepository<UserResponse, Integer> {
}
