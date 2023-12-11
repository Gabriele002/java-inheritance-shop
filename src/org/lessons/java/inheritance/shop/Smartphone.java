package org.lessons.java.inheritance.shop;

import java.math.BigDecimal;
import java.util.Random;

public class Smartphone extends Product{
    //ATRIBBUTI
    int memoria;
    int codiceImei;

    //COSTRUTTORI

    public Smartphone(String name, String description, BigDecimal price, BigDecimal vat, int memoria) throws IllegalArgumentException {
        super(name, description, price, vat);
        codiceImei = generateCode();
        this.memoria = memoria;

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

    private int generateCode(){
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(0, 10000);
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "memoria=" + memoria +
                ", codiceImei=" + codiceImei +
                '}';
    }
}
