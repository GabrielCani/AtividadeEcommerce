package br.senai.fatesg.ecommerce.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Telefone extends BaseModel{
    private String ddd;
    private String numero;
    private LocalDateTime dataInicio;
    private  LocalDateTime dataFim;
    private Contato contato;

}
