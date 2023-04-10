package com.example.krec;

import java.io.Serializable;

public class Good implements Serializable {
    private String name;
    public Good(String name){
        this.name = name;
    }
    public String returnName(){
        return name;
    }
}
