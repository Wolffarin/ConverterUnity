package com.company;

import java.util.ArrayList;

public class UNIDAD {
    String type;
    int idx;
    ArrayList<Operacion> conversiones = new ArrayList<>();

    public ArrayList<Operacion> getConversiones() {
        return conversiones;
    }

    public void setConversiones(ArrayList<Operacion> conversiones) {
        this.conversiones = conversiones;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public UNIDAD(String type, int idx){
        this.type = type;
    this.idx = idx;}

    @Override
    public String toString() {
        return type;
    }
}
