package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User, String> {
@Query("select user from User user where user.user=?1 and user.password=?2")
	public User findByuserpwd(String username,String password);

	
}
