package com.example.exercicio08.DTO;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Component;

@Component
public class TransacaoDTO {
    @NotNull(message = "Preencher o recebedor é obrigatorio.")
    private String recebedor;
    @NotNull(message = "Preencher o pagador é obrigatório.")
    private String pagador;
    @NotNull(message = "Preencher a quantidade é obrigatório.")
    @Min(1)
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
