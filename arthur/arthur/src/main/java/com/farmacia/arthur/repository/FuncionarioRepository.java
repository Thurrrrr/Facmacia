package com.farmacia.arthur.repository;

import com.farmacia.arthur.model.FuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface FuncionarioRepository extends JpaRepository<FuncionarioModel, Integer> {
    Optional<FuncionarioModel> findByCdFunc(Integer cdFunc);
    Optional<FuncionarioModel> findAllByCdFunc(Integer cdFunc);
}
