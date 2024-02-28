package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
List<String> getMarcas(String color){
    List <String> marcas= new ArrayList<>();
    if(color.equals("Agricola")){
    marcas.add("Bulto de semillas");
    marcas.add("Abono ecologico");
    marcas.add("Bulto de trigo");
    marcas.add("Fertilizante");
    }else {
        if (color.equals("Liquido")) {
            marcas.add("Agua");
            marcas.add("Leche");
            marcas.add("Vinagre");
            marcas.add("Alcohol etilico");
        }else{
            marcas.add("Cemento");
            marcas.add("Ceramica");
            marcas.add("Aluminio");
            marcas.add("Madera");
            marcas.add("Plastico");
        }
    }
    return marcas;
}
}
