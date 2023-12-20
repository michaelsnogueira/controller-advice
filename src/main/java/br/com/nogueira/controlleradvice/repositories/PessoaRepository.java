package br.com.nogueira.controlleradvice.repositories;

import br.com.nogueira.controlleradvice.domain.Pessoa;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface PessoaRepository extends CrudRepository<Pessoa, UUID> {
}
