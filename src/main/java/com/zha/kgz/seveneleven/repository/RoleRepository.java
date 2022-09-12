package com.zha.kgz.seveneleven.repository;

import com.zha.kgz.seveneleven.model.ERole;
import com.zha.kgz.seveneleven.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Zha_Aibek@mail.com
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
