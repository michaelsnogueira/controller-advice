package br.com.nogueira.controlleradvice.controller.advice;

import br.com.nogueira.controlleradvice.service.exception.NomeExisteNaBasePessoa;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@org.springframework.web.bind.annotation.ControllerAdvice
public class ControllerAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(NomeExisteNaBasePessoa.class)
    private ResponseEntity<ProblemDetail> nomeExistenaBasePessoaHandler(NomeExisteNaBasePessoa exception) {
        ProblemDetail problem = ProblemDetail.forStatusAndDetail(HttpStatus.CONFLICT, exception.getMessage());
        problem.setTitle("Nome Duplicado");
        return ResponseEntity.of(problem).build();
    }
}
