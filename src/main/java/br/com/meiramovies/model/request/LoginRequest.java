package br.com.meiramovies.model.request;

import lombok.Data;

@Data
public class LoginRequest {

    private String senha;
    private String email;

}
