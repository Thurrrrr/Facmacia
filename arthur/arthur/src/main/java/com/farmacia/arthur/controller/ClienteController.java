package com.farmacia.arthur.controller;

import com.farmacia.arthur.dto.ClienteDto;
import com.farmacia.arthur.model.ClienteModel;
import com.farmacia.arthur.repository.ClienteRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/clientes")

public class ClienteController {
    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping
    public ResponseEntity<ClienteModel> salvar(@RequestBody @Valid ClienteDto clienteDto){
        var clienteModel = new ClienteModel();
        BeanUtils.copyProperties(clienteDto, clienteModel);
        return ResponseEntity.status(
                HttpStatus.CREATED).body(
                        clienteRepository.save(clienteModel));

    }

    @GetMapping
    public ResponseEntity<List<ClienteModel>> getAllCliente(){
        return ResponseEntity.status(HttpStatus.OK).body(clienteRepository.findAll());
    }

    @GetMapping("/{cdCliente}")
    public ResponseEntity<Object> getCliente(@PathVariable("cdCliente") Integer cdCliente){
        Optional<ClienteModel> cliente0 = clienteRepository.findById(cdCliente);
        if (cliente0.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente não encontrado");
        }
        return ResponseEntity.status(HttpStatus.OK).body(cliente0.get());
    }
}
