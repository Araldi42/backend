package com.example.exercicio09;

import com.example.exercicio09.DTO.CachorroMapper;
import com.example.exercicio09.Model.Cachorro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

public class ApplicationController {
    @Autowired
    private ApplicationService service;
    @Autowired
    private CachorroMapper cachorroMapper;

    @GetMapping("/Cachorro/{id}")
    public Cachorro getCachorro(@PathVariable UUID cachorro_id){
        return cachorroMapper.toEntity(service.getCachorroById(cachorro_id));
    }

    @GetMapping("/Cachorro/List")
    public List<Cachorro> getCachorros(){
        return cachorroMapper.toEntity(service.getCachorroList());
    }

    @PostMapping("/Cachorro/Create")
    public Cachorro createCachorro(@RequestBody Cachorro cachorro){
        return cachorroMapper.toEntity(service.setCachorro(cachorro));
    }

    @PutMapping("/Cachorro/Update")
    public Cachorro updateCachorro(@RequestBody Cachorro cachorro){
        return cachorroMapper.toEntity(service.setCachorroById(cachorro));
    }

    @DeleteMapping("/Cachorro/Delete/{id}")
    public Cachorro deleteCachorro(@PathVariable UUID cachorro_id){
        return cachorroMapper.toEntity(service.deleteCachorroById(cachorro_id));
    }
}
