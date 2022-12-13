package com.example.sia.tacocloud;

import lombok.AllArgsConstructor;
import lombok.Data;
// import lombok.RequiredArgsConstructor;

@Data
// @RequiredArgsConstructor
@AllArgsConstructor
public class Ingredient {
    
    private final String id;
    private final String name;
    private final Type type;

    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }

}
