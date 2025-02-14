package br.senai.fatesg.ecommerce.demo.repository;

import br.senai.fatesg.ecommerce.demo.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Integer> {
}
