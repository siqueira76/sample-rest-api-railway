package com.siqueira76.samplerestapirailway.domain.repository;

import com.siqueira76.samplerestapirailway.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}