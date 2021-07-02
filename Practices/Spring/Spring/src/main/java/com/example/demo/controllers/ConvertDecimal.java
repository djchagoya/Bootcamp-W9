package com.example.demo.controllers;

import com.example.demo.models.NumeroRomano;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/convertir")
public class ConvertDecimal {
    private final static Map map = new LinkedHashMap<String, Integer>();

    static {

        map.put("M", 1000);
        map.put("CM", 900);
        map.put("D", 500);
        map.put("CD", 400);
        map.put("C", 100);
        map.put("XC", 90);
        map.put("L", 50);
        map.put("XL", 40);
        map.put("X", 10);
        map.put("IX", 9);
        map.put("V", 5);
        map.put("IV", 4);
        map.put("I", 1);

    }
    @GetMapping("/decimalToRoman/{numberDecimal}")
    public NumeroRomano convertRoman(@PathVariable int numberDecimal){
        String result = "";
        int number = numberDecimal;
        while(number > 0 && number < 3999){
            Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
            while(it.hasNext()){
                Map.Entry<String, Integer> entry = it.next();
                if(number >= entry.getValue()){
                    number -= entry.getValue();
                    result += entry.getKey();
                    break;
                }
            }
        }
        return new NumeroRomano(result);
    }


}
