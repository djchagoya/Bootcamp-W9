package com.example.demo.models;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Greeting{

    private long id;
    private String context;
    private String className;

}
