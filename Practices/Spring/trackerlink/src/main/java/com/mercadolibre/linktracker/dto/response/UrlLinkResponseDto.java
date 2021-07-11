package com.mercadolibre.linktracker.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class UrlLinkResponseDto {
    String url;
}
