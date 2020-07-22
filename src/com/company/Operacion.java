package com.company;

import java.util.ArrayList;


public class Operacion {
String conver;
float num;
int idx;
    ArrayList<TRANSFORMACION> conversiones2 = new ArrayList<>();

    public ArrayList<TRANSFORMACION> getConversiones2() {
        return conversiones2;
    }

    public void setConversiones2(ArrayList<TRANSFORMACION> conversiones2) {
        this.conversiones2 = conversiones2;
    }

    public String getConver() {
        return conver;
    }

    public float getNum() {
        return num;
    }

    public void setNum(float num) {
        this.num = num;
    }

    public void setConver(String conver) {
        this.conver = conver;
    }
    public Operacion(String conver, float num, int idx){
        this.conver = conver;
        this.num = num;
        this.idx=idx;
    }

    @Override
    public String toString() {
        return conver;
    }
}
