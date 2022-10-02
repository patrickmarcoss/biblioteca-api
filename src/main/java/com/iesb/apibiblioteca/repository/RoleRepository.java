package com.iesb.apibiblioteca.repository;

import com.iesb.apibiblioteca.model.security.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
