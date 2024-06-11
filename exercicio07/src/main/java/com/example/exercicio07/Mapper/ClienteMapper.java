package com.example.exercicio07.Mapper;

import com.example.exercicio07.DTO.ClienteDTO;
import com.example.exercicio07.Model.Cliente;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClienteMapper {
    @Autowired
    private ModelMapper modelMapper;

    public Cliente toEntity(ClienteDTO dto){
        Cliente e = modelMapper.map(dto, Cliente.class);
        return e;
    }

    public ClienteDTO toDTO(Cliente e){
        ClienteDTO dto = modelMapper.map(e, ClienteDTO.class);
        return dto;
    }
}
