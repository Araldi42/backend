package com.example.exercicio07.DTO;

import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Component;

@Component
public class TransacaoDTO {
    @NotNull
    private String recebedor;
    @NotNull
    private String pagador;
    @NotNull
    private Double quantidade;

    public String getRecebedor() {
        return recebedor;
    }

    public String getPagador() {
        return pagador;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setRecebedor(String recebedor) {
        this.recebedor = recebedor;
    }

    public void setPagador(String pagador) {
        this.pagador = pagador;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }
}
