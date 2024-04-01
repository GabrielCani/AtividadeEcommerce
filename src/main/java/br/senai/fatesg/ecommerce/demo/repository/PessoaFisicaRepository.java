package br.senai.fatesg.ecommerce.demo.repository;

import br.senai.fatesg.ecommerce.demo.model.PessoaFisica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaFisicaRepository extends JpaRepository<PessoaFisica, Integer> {
}
