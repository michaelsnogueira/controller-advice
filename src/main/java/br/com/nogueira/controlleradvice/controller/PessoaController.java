package br.com.nogueira.controlleradvice.controller;

import br.com.nogueira.controlleradvice.controller.data.PessoaRequest;
import br.com.nogueira.controlleradvice.domain.Pessoa;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoa")

public class PessoaController {

    private final PessoaService service;

    public PessoaController(PessoaService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Pessoa> salvarPessoa(@RequestBody PessoaRequest request) {
        Pessoa pessoaBancoSalva = service.salvar(request);
        return ResponseEntity.ok(pessoaBancoSalva);
    }

}
