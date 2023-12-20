package br.com.nogueira.controlleradvice.controller;

import br.com.nogueira.controlleradvice.controller.data.PessoaRequest;
import br.com.nogueira.controlleradvice.domain.Pessoa;

public interface PessoaService {

    Pessoa salvar(PessoaRequest pessoaRequest);
}
