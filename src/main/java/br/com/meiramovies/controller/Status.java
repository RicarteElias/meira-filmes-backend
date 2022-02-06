package br.com.meiramovies.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Status {
    @GetMapping
    String statusServer(){
        return "Server is ok!";
    }
}
