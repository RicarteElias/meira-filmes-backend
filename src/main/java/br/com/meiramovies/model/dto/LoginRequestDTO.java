package br.com.meiramovies.model.dto;

import lombok.Data;

@Data
public class LoginRequestDTO {

    private String senha;
    private String email;

}
