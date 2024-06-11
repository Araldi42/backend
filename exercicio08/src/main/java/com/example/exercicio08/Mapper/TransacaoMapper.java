package com.example.exercicio08.Mapper;

import com.example.exercicio08.DTO.TransacaoDTO;
import com.example.exercicio08.Model.Transacao;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TransacaoMapper {
    @Autowired
    private ModelMapper modelMapper;

    public Transacao toEntity(TransacaoDTO dto){
        Transacao e = modelMapper.map(dto, Transacao.class);
        return e;
    }

    public TransacaoDTO toDTO(Transacao e){
        TransacaoDTO dto = modelMapper.map(e, TransacaoDTO.class);
        return dto;
    }
}
