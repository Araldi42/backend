package com.example.exercicio07.Mapper;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class _ConfiguracoesMapper {
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
