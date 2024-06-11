package com.example.exercicio09;

import com.example.exercicio09.DTO.CachorroDTO;
import com.example.exercicio09.Model.Cachorro;
import com.example.exercicio09.Mapper.CachorroMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

public class ApplicationService {
    private List<CachorroDTO> cachorros;
    @Autowired
    private CachorroMapper CachorroMapper;

    public CachorroDTO getCachorroById(UUID id){
        for (int i = 0; i < cachorros.toArray().length; i++) {
            if (cachorros.get(i).getId().equals(id)) {
                return cachorros.get(i);
            }
        }
        return null;
    }

    public List<CachorroDTO> getCachorroList(){
        if(!cachorros.isEmpty()){
            return cachorros;
        }
        return null;
    }

    public CachorroDTO setCachorro(Cachorro cachorro){
        if(cachorro != null){
            CachorroDTO dto = CachorroMapper.toDTO(cachorro);
            cachorros.add(dto);
            return dto;
        }
        return null;
    }

    public CachorroDTO setCachorroById(Cachorro cachorro){
        CachorroDTO dto = CachorroMapper.toDTO(cachorro);

        if(dto != null){
            for (int i = 0; i < cachorros.toArray().length; i++) {
                if (cachorros.get(i).getId() == dto.getId()) {
                    cachorros.remove(i);
                    cachorros.add(dto);
                    return dto;
                }
            }
        }
        return null;
    }

    public CachorroDTO deleteCachorroById(UUID id){
        for (int i = 0; i < cachorros.toArray().length; i++) {
            if (cachorros.get(i).getId().equals(id)) {
                CachorroDTO dto = cachorros.get(i);
                cachorros.remove(i);
                return dto;
            }
        }
        return null;
    }
}
