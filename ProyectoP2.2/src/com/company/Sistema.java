package com.company;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class Sistema {
    private ArrayList<Proyecto> ingresados;

    public Sistema() {

    }

    public void lecturaArchivo(String direccion){
        Gson gson = new Gson();
        String json = "";
        String linea;
        try {
            BufferedReader buff = new BufferedReader(new FileReader(direccion));
            while ((linea = buff.readLine()) != null) {
                json += linea;
            }
            buff.close();

            System.out.println(json);

            Type tipoListaProyecto = new TypeToken<ArrayList<Proyecto>>(){}.getType();

            this.ingresados = gson.fromJson(json,tipoListaProyecto);

        }catch (Exception e){
            System.out.println("Error al leer los arhivos");
        }
    }

    private int verificarPresupuesto(Presupuesto v1){
        if(v1.total() < 30000000){
            return 1;
        }
        return 0;
    }

    private int verificarDuracion(double duracion){
        if(duracion < 12){
            return 1;
        }
        return 0;
    }

    public void crearArchsJS(){

    }

    public ArrayList<Proyecto> getIngresados() {
        return ingresados;
    }

    public void setIngresados(ArrayList<Proyecto> ingresados) {
        this.ingresados = ingresados;
    }
}
