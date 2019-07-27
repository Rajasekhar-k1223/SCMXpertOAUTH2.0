
package com.sec.AuthServerSecurity.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.sec.AuthServerSecurity.entity.Role;

public interface RoleRepository extends MongoRepository<Role, String> {

	Role findByRole(String role);
}
