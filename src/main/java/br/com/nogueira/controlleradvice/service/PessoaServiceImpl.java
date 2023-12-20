package br.com.nogueira.controlleradvice.service;

import br.com.nogueira.controlleradvice.controller.PessoaService;
import br.com.nogueira.controlleradvice.controller.data.PessoaRequest;
import br.com.nogueira.controlleradvice.domain.Pessoa;
import br.com.nogueira.controlleradvice.repositories.PessoaRepository;
import br.com.nogueira.controlleradvice.service.exception.NomeExisteNaBasePessoa;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
public class PessoaServiceImpl implements PessoaService {

    private final PessoaRepository repository;

    public PessoaServiceImpl(PessoaRepository repository) {
        this.repository = repository;
    }

    @Override
    public Pessoa salvar(PessoaRequest pessoaRequest) {
        try {
            return repository.save(PessoaMapper.toDomain(pessoaRequest));

        } catch (DataIntegrityViolationException ex) {
            System.out.println("Entrouuuuuuuuuuuuuuuuuuuu");
            throw new NomeExisteNaBasePessoa("O nome da pessoa já existe na base");
        }

    }
}
