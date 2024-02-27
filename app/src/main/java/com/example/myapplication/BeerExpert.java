package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
List<String> getMarcas(String color){
    List <String> marcas= new ArrayList<>();
    if(color.equals("Red")){
    marcas.add("Red Captain Beer");
    marcas.add("RedSkull German Beer");
    }else {
        if (color.equals("Dark")) {
            marcas.add("Darkside Moon Beer");
            marcas.add("Darknight Beer");
        }else{
            marcas.add("Anber Loot");
            marcas.add("Beer bet");
        }
    }
    return marcas;
}
}
