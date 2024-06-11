package com.example.exercicio08.Mapper;

import com.example.exercicio08.DTO.ClienteDTO;
import com.example.exercicio08.Model.Cliente;
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
