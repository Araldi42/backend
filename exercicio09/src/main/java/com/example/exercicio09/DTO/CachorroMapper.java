package com.example.exercicio09.DTO;

import com.example.exercicio09.Model.Cachorro;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class CachorroMapper {
    @Autowired
    private ModelMapper modelMapper;

    public Cachorro toEntity(CachorroDTO dto){
        Cachorro e = modelMapper.map(dto, Cachorro.class);
        return e;
    }

    public CachorroDTO toDTO(Cachorro e) {
        CachorroDTO dto = modelMapper.map(e, CachorroDTO.class);
        return dto;
    }

    public List<Cachorro> toEntity(List<CachorroDTO> cachorros){
        return cachorros
                .stream()
                .map(cachorro -> toEntity(cachorro))
                .collect(Collectors.toList());
    }

    public List<CachorroDTO> toDTO(List<Cachorro> cachorros){
        return cachorros
                .stream()
                .map(cachorro -> toDTO(cachorro))
                .collect(Collectors.toList());
    }
}
