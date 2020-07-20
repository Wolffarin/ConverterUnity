package com.company;

import java.util.ArrayList;
import java.util.List;

public class Category {
    int code;
    String Vista;
   ArrayList<Unidadesdemedida> Unidades = new ArrayList();

    public Category(int code, String Vista){
        this.code = code;
        this.Vista = Vista;

    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getVista() {
        return Vista;
    }

    public void setVista(String vista) {
        Vista = vista;
    }

    public ArrayList<Unidadesdemedida> getUnidades() {
        return Unidades;
    }

    public void setUnidades(ArrayList<Unidadesdemedida> unidades) {
        Unidades = (ArrayList<Unidadesdemedida>) unidades;
    }

    @Override
    public String toString() {
        return Vista;
    }
}
