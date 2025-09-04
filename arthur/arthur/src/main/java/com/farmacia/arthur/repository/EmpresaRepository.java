package com.farmacia.arthur.repository;

import com.farmacia.arthur.model.ClienteModel;
import com.farmacia.arthur.model.EmpresaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface EmpresaRepository extends JpaRepository<EmpresaModel, Integer> {
    Optional<EmpresaModel> findByCdEmpresa(Integer cdEmpresa);
    Optional<EmpresaModel> findAllByCdEmpresa(Integer cdEmpresa);

}