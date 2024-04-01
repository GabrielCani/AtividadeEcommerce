package br.senai.fatesg.ecommerce.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Email extends BaseModel{
    private String enderecoEmail;
    private LocalDateTime dataInicio;
    private  LocalDateTime dataFim;
    private Contato contato;

}
