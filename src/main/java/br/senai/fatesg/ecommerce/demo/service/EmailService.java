package br.senai.fatesg.ecommerce.demo.service;
import lombok.extern.slf4j.Slf4j;
import br.senai.fatesg.ecommerce.demo.interfaces.IService;
import br.senai.fatesg.ecommerce.demo.model.Email;
import br.senai.fatesg.ecommerce.demo.repository.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service //indica camada de serviço/negócio
public class EmailService implements IService<Email, Integer> {

    @Autowired //injeção de dependência
    private EmailRepository emailRepository;

    @Override
    @Transactional
    public Email create(Email entity) {
        log.info("Acessando método EmailService.create");
        log.debug("Valores recebidos: {}", entity);

        return emailRepository.save(entity);
    }

    @Override
    public List<Email> read() {
        log.info("Acessando método EmailResource.read()");

        List<Email> lista = emailRepository.findAll();

        log.debug("Resultado da consulta: {} registros", lista.size());

        return lista;
    }

    @Override
    public Email read(Integer id) {
        log.info("Acessando método EmailResource.read(id)");
        log.debug("Valores recebidos: id = {}", id);
        //Contato contatoEncontrado = contatoRepository.findById(id);
        log.debug("Resultado da consulta: {} registros", 0);
        return null;
    }

    @Override
    @Transactional
    public Email update (Integer id, Email entity) {
        log.info("Acessando método EmailService.update");
        log.debug("Valores recebidos - id: {}, entity: {}", id, entity);


        Optional<Email> emailEncontrado = emailRepository.findById(id);
        if(emailEncontrado.isPresent()){
            emailRepository.save(entity);
        }

        return null;
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        log.info("Acessando método delete");
        log.info("Valor recebido: {id}", id);

    }
}

