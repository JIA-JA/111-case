package com.system;

public class API2 {
    private String sympton_name;
    public API2(String sympton_name){
        this.sympton_name = sympton_name;
    }

    public String getSympton_name(){
        return sympton_name;
    }

    public String toString(){
        return "sympton_name: "+sympton_name;
    }
}
