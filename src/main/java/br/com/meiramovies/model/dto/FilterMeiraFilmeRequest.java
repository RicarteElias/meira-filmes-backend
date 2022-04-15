package br.com.meiramovies.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FilterMeiraFilmeRequest {
    private String title;
    private boolean assistido;
}
