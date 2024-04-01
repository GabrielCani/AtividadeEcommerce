package br.senai.fatesg.ecommerce.demo.repository;

import br.senai.fatesg.ecommerce.demo.model.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailRepository extends JpaRepository<Email, Integer> {
}
