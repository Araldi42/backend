package com.example.exercicio09.Model;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class Cachorro {
    private UUID id;
    private String nome;
    private String raca;
    private double peso;
    private String sexo;
    private int idade;
}
