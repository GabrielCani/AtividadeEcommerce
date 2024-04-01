package br.senai.fatesg.ecommerce.demo.repository;

import br.senai.fatesg.ecommerce.demo.model.PessoaJuridica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaJuridicaRepository extends JpaRepository<PessoaJuridica, Integer> {
}
