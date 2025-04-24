package com.controle_plus.repository;

import com.controle_plus.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <UserModel, Long>{
}