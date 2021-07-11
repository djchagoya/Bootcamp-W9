package com.mercadolibre.linktracker.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mercadolibre.linktracker.entity.Link;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LinkRequest {
    private String name;
    private String url;
    @JsonIgnore
    private String password;


}
