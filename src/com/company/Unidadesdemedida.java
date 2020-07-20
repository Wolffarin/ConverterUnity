package com.company;

public class Unidadesdemedida {
    int code;
    String Tipodeoperacion;
    float Formula;

    public Unidadesdemedida(int code , String Tipodeoperacion , Float Formula){
        this.code = code;
        this.Tipodeoperacion = Tipodeoperacion;
        this.Formula = Formula;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTipodeoperacion() {
        return Tipodeoperacion;
    }

    public void setTipodeoperacion(String tipodeoperacion) {
        Tipodeoperacion = tipodeoperacion;
    }

    public float getFormula() {
        return Formula;
    }

    public void setFormula(float formula) {
        Formula = formula;
    }

    @Override
    public String toString() {
        return Tipodeoperacion;
    }


    }
}
