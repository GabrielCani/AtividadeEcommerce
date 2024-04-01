package br.senai.fatesg.ecommerce.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Endereco extends BaseModel {
    private String logradouro;
    private LocalDateTime dataInicio;
    private  LocalDateTime dataFim;
    private Contato contato;
}
