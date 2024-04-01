package br.senai.fatesg.ecommerce.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa extends BaseModel{
    private Integer id;
    private String nome;
   private LocalDateTime dataInicio;
   private  LocalDateTime dataFim;
   private List<Contato> contatos;
}
