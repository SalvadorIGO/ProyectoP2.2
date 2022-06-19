package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Proyecto {
    private Presupuesto presupuesto;
    private String titulo;
    private String resumen;
    private double duracion;
    private boolean estado;
    private int tipoProyecto;
    private List<Integrante> equipo;
    private Integrante director;
    private String motivo;

    public Proyecto(Presupuesto presupuesto, String titulo, String resumen, double duracion, boolean estado, int tipoProyecto, Integrante director, String motivo) {
        this.presupuesto = presupuesto;
        this.titulo = titulo;
        this.resumen = resumen;
        this.duracion = duracion;
        this.estado = estado;
        this.tipoProyecto = tipoProyecto;
        this.director = director;
        this.motivo = motivo;
    }

    public Presupuesto getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(Presupuesto presupuesto) {
        this.presupuesto = presupuesto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getTipoProyecto() {
        return tipoProyecto;
    }

    public void setTipoProyecto(int tipoProyecto) {
        this.tipoProyecto = tipoProyecto;
    }

    public Integrante getDirector() {
        return director;
    }

    public void setDirector(Integrante director) {
        this.director = director;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public List<Integrante> getEquipo() {
        return equipo;
    }

    public void setEquipo(List<Integrante> equipo) {
        this.equipo = equipo;
    }
}