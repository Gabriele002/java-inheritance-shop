package org.lessons.java.inheritance.shop;

import java.math.BigDecimal;

public class Smartphone extends Product{
    //ATRIBBUTI
    int memoria;
    int codiceImei;

    //COSTRUTTORI

    public Smartphone(String name, String description, BigDecimal price, BigDecimal vat, int memoria, int codiceImei) throws IllegalArgumentException {
        super(name, description, price, vat);
        this.memoria = memoria;
        this.codiceImei = codiceImei;
    }

    //GETTER E SETTTER

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public int getCodiceImei() {
        return codiceImei;
    }

    public void setCodiceImei(int codiceImei) {
        this.codiceImei = codiceImei;
    }


    //METODI



}
