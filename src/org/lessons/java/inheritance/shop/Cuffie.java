package org.lessons.java.inheritance.shop;

import java.math.BigDecimal;

public class Cuffie extends Product{

    //ATTRIBUTI
    private String color;
    private boolean cablate;

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


    @Override
    public String toString() {
        return "Cuffie :\n" +
                "code=" + super.getCode() + "\n" +
                "name=" + super.getName() + '\'' + "\n" +
                "description=" + super.getDescription() + '\'' + "\n" +
                "price=" + super.getPrice() + "\n" +
                "vat=" + super.getVat() + " " + "\n" +
                "pollici=" + color + "\n" +
                "smart=" + cablate + "\n";
    }

}
