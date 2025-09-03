package com.farmacia.arthur.controller;

import com.farmacia.arthur.dto.ProdutosDto;
import com.farmacia.arthur.model.ProdutosModel;
import com.farmacia.arthur.repository.ProdutosRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/produtos")
public class ProdutosController {
    @Autowired
    private ProdutosRepository produtosRepository;

    @PostMapping
    public ResponseEntity<ProdutosModel> salvar(@RequestBody @Valid ProdutosDto produtosDto){
        var produtosModel = new ProdutosModel();
        BeanUtils.copyProperties(produtosDto, produtosModel);
        return ResponseEntity.status(
                HttpStatus.CREATED).body(
                        produtosRepository.save(produtosModel));
    }
    @GetMapping
    public ResponseEntity<List<ProdutosModel>> getAllProdutos(){
        return ResponseEntity.status(HttpStatus.OK).body(produtosRepository.findAll());
    }
    @GetMapping("/{cdProduto}")
    public ResponseEntity<Object> getProduto(@PathVariable("cdProduto") Integer cdProduto){
        Optional<ProdutosModel> produto0 = produtosRepository.findById(cdProduto);
        if (produto0.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não encontrado");
        }
        return ResponseEntity.status(HttpStatus.OK).body(produto0.get());
    }
}
