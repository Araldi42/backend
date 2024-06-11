package com.example.exercicio08;

import com.example.exercicio08.DTO.ClienteDTO;
import com.example.exercicio08.DTO.TransacaoDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ApplicationService {
    private ArrayList<ClienteDTO> clientes;
    private ArrayList<TransacaoDTO> transacoes;

    public ClienteDTO getCliente(String clienteNome){
        ClienteDTO cliente = null;
        for (int i = 0; i < clientes.toArray().length; i++) {
            if (clientes.get(i).getNome() == clienteNome) {
                cliente = clientes.get(i);
            }
        }
        return cliente;
    }

    public TransacaoDTO createTransacao(TransacaoDTO transacao){
        transacoes.add(transacao);
        return transacao;
    }
}
