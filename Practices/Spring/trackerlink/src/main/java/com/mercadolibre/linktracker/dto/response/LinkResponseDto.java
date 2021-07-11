package com.mercadolibre.linktracker.dto.response;

import com.mercadolibre.linktracker.entity.Link;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class LinkResponseDto {
    private Long id;
    private String name;
    private String url;
    private Boolean valid;
    private Long visit;

    public LinkResponseDto(Link link) {
        this.id = link.getId();
        this.name = link.getName();
        this.url = link.getUrl();
        this.valid = link.getValid();
        this.visit = link.getVisit();

    }
}
