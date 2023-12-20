package br.com.nogueira.controlleradvice.service.exception;

public class NomeExisteNaBasePessoa extends RuntimeException {

    public NomeExisteNaBasePessoa(String message) {
        super(message);
    }
}
