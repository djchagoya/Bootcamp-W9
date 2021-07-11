package com.mercadolibre.linktracker.dto.response;

import com.mercadolibre.linktracker.entity.Link;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.concurrent.atomic.AtomicLong;

@Data
@AllArgsConstructor
public class MetricsResponseDto {
    Long visit;
}
