package com.pfe.system.erp.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pfe.system.erp.models.ERole;
import com.pfe.system.erp.models.Role;

public interface RoleRepository extends MongoRepository<Role, String> {
  Optional<Role> findByName(ERole name);
}
