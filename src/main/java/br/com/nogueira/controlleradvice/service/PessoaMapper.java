package br.com.nogueira.controlleradvice.service;

import br.com.nogueira.controlleradvice.controller.data.PessoaRequest;
import br.com.nogueira.controlleradvice.domain.Pessoa;

public class PessoaMapper {

    static Pessoa toDomain(PessoaRequest pessoaRequest) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(pessoaRequest.nome());
        pessoa.setTelefone(pessoaRequest.telefone());
        pessoa.setEndereco(pessoaRequest.endereco());
        return pessoa;
    }

    static PessoaRequest toRequest(Pessoa pessoa) {
        return new PessoaRequest(pessoa.getNome(), pessoa.getTelefone(), pessoa.getEndereco());
    }
}
