

package com.mercadolibre.linktracker.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;


@Entity
@Table(name = "Link")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Link implements java.io.Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String url;
    @JsonIgnore
    private String password;
    private Boolean valid;
    private Long visit;
}
