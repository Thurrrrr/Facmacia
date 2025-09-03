package com.farmacia.arthur.controller;

import com.farmacia.arthur.dto.CargoDto;
import com.farmacia.arthur.model.CargoModel;
import com.farmacia.arthur.repository.CargoRepository;
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
@RequestMapping("api/v1/cargos")

public class CargoController {
    @Autowired
    private CargoRepository cargoRepository;

    @PostMapping
    public ResponseEntity<CargoModel> salvar(@RequestBody @Valid CargoDto cargoDto){
        var cargoModel = new CargoModel();
        BeanUtils.copyProperties(cargoDto, cargoModel);
        return ResponseEntity.status(
                HttpStatus.CREATED).body(
                        cargoRepository.save(cargoModel)
        );
    }
    @GetMapping
    public ResponseEntity<List<CargoModel>> getAllCargo(){
        return ResponseEntity.status(HttpStatus.OK).body(cargoRepository.findAll());
    }
    @GetMapping("/{cdCargo}")
    public ResponseEntity<String> getCargo(@PathVariable("cdCargo") Integer cdCargo){
        Optional<CargoModel> cargo0 = cargoRepository.findById(cdCargo);
        if (cargo0.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cargo não encontrado");
        }
        return ResponseEntity.status(HttpStatus.OK).body(cargo0.get().toString());
    }
}

