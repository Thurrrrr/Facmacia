package com.farmacia.arthur.repository;

import com.farmacia.arthur.model.ProdutosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProdutosRepository extends JpaRepository<ProdutosModel, Integer> {
    Optional<ProdutosModel> findByCdProduto(Integer cdProduto);
    Optional<ProdutosModel> findAllByCdProduto(Integer cdProduto);
}
