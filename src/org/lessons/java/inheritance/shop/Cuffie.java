package org.lessons.java.inheritance.shop;

import java.math.BigDecimal;

public class Cuffie extends Product{

    //ATTRIBUTI
    String color;
    boolean cablate;

    //COSTRUTTORI

    public Cuffie(String name, String description, BigDecimal price, BigDecimal vat, String color, boolean cablate) throws IllegalArgumentException {
        super(name, description, price, vat);
        this.color = color;
        this.cablate = cablate;
    }


    //GETTER E SETTER

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCablate() {
        return cablate;
    }

    public void setCablate(boolean cablate) {
        this.cablate = cablate;
    }


    //METODI
}
