package com.farmacia.arthur.controller;

import com.farmacia.arthur.dto.FuncionarioDto;
import com.farmacia.arthur.model.FuncionarioModel;
import com.farmacia.arthur.repository.FuncionarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/funcionarios")

public class FuncionarioController {
    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @PostMapping
    public ResponseEntity<FuncionarioModel> salvar(@RequestBody @Valid FuncionarioDto funcionarioDto){
        var funcionarioModel = new FuncionarioModel();
        BeanUtils.copyProperties(funcionarioDto, funcionarioModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(
                funcionarioRepository.save(funcionarioModel));
    }
    @GetMapping
    public ResponseEntity<List<FuncionarioModel>> getAllFuncionario(){
       return ResponseEntity.status(HttpStatus.OK).body(funcionarioRepository.findAll());

    }
    @GetMapping("/{cdFunc}")
    public ResponseEntity<Object> getFunc(@PathVariable("cdFunc") Integer cdFunc){
        Optional<FuncionarioModel> func0 = funcionarioRepository.findById(cdFunc);
        if (func0.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Funcionario não encontrado");
        }
        return ResponseEntity.status(HttpStatus.OK).body(func0.get());
    }
}
