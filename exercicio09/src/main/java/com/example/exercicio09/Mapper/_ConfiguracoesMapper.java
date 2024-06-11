package com.example.exercicio09.Mapper;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;

public class _ConfiguracoesMapper {
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
