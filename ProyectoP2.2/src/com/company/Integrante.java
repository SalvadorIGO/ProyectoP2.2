package com.company;
public abstract class Integrante {
    private String rut;
    private String nombre;
    private double dedicacionMax;
    private double dedicacionMin;
    private int tipoIntegrante;

    public Integrante(String rut, String nombre, double dedicacionMax, double dedicacionMin, int tipoIntegrante) {
        this.rut = rut;
        this.nombre = nombre;
        this.dedicacionMax = dedicacionMax;
        this.dedicacionMin = dedicacionMin;
        this.tipoIntegrante = tipoIntegrante;
    }

    public double getDedicacionMax() {
        return this.dedicacionMax;
    }

    public void setDedicacionMax(double dedicacionMax) {
        this.dedicacionMax = dedicacionMax;
    }

    public double getDedicacionMin() {
        return this.dedicacionMin;
    }

    public void setDedicacionMin(double dedicacionMin) {
        this.dedicacionMin = dedicacionMin;
    }

    public abstract void reducH(double var1);

    public String getRut() {
        return this.rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipoIntegrante() {
        return this.tipoIntegrante;
    }

    public void setTipoIntegrante(int tipoIntegrante) {
        this.tipoIntegrante = tipoIntegrante;
    }
}

