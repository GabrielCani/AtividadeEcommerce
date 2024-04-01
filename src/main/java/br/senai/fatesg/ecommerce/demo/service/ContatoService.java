package br.senai.fatesg.ecommerce.demo.service;

import lombok.extern.slf4j.Slf4j;
import br.senai.fatesg.ecommerce.demo.interfaces.IService;
import br.senai.fatesg.ecommerce.demo.model.Contato;
import br.senai.fatesg.ecommerce.demo.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service //indica camada de serviço/negócio
public class ContatoService implements IService<Contato, Integer> {

    @Autowired //injeção de dependência
    private ContatoRepository contatoRepository;

    @Override
    @Transactional
    public Contato create(Contato entity) {
        log.info("Acessando método ContatoService.create");
        log.debug("Valores recebidos: {}", entity);

        return contatoRepository.save(entity);
    }

    @Override
    public List<Contato> read() {
        log.info("Acessando método ContatoResource.read()");

        List<Contato> lista = contatoRepository.findAll();

        log.debug("Resultado da consulta: {} registros", lista.size());

        return lista;
    }

    @Override
    public Contato read(Integer id) {
        log.info("Acessando método ContatoResource.read(id)");
        log.debug("Valores recebidos: id = {}", id);
        //Contato contatoEncontrado = contatoRepository.findById(id);
        log.debug("Resultado da consulta: {} registros", 0);
        return null;
    }

    @Override
    @Transactional
    public Contato update(Integer id, Contato entity) {
        log.info("Acessando método ContatoService.update");
        log.debug("Valores recebidos - id: {}, entity: {}", id, entity);


        Optional<Contato> contatoEncontrado = contatoRepository.findById(id);
        if(contatoEncontrado.isPresent()){
            contatoRepository.save(entity);
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
