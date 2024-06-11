package com.example.exercicio08;

import com.example.exercicio08.Mapper.ClienteMapper;
import com.example.exercicio08.Mapper.TransacaoMapper;
import com.example.exercicio08.Model.Cliente;
import com.example.exercicio08.Model.Transacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class ApplicationController {
    @Autowired
    private ApplicationService service;
    @Autowired
    private ClienteMapper customerMapper;
    @Autowired
    private TransacaoMapper transactionMapper;

    @GetMapping("/cliente/{nome}")
    public Cliente getCliente(@PathVariable String nome){
        return customerMapper.toEntity(service.getCliente(nome));
    }

    @PostMapping("/transacao")
    public Transacao postTransacao(@RequestBody Transacao transacao){
        return transactionMapper.toEntity(service.createTransacao(transactionMapper.toDTO(transacao)));
    }
}
