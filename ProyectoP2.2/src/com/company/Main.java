package com.company;

import com.google.gson.stream.JsonToken;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Sistema n1 = new Sistema();

        n1.lecturaArchivo("C:\\Users\\Salvador\\Documents\\GitHub\\ProyectoP2.2\\ProyectoP2.2\\src\\proyectos.json");

        System.out.println(n1.getIngresados().get(0).getEquipo().get(0).getNombre());
    }
}
