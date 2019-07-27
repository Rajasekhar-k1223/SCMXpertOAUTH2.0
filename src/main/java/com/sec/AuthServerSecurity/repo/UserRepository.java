/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sec.AuthServerSecurity.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.sec.AuthServerSecurity.entity.User;

public interface UserRepository extends MongoRepository<User, String> {

	@Query("{email:'?0'}")
	User findByEmail(String email);

}
