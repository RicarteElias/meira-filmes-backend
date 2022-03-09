package br.com.meiramovies.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class NegocioException extends ResponseStatusException {
    public NegocioException(String reason) {
        super(HttpStatus.CONFLICT, reason, new Throwable(reason));
    }
}
