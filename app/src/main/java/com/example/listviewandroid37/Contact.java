package com.example.listviewandroid37;

public class Contact {
    int idIcon;
    String Name;
    String Price;

    public Contact(int idIcon, String name, String price) {
        this.idIcon = idIcon;
        Name = name;
        Price = price;
    }

    public Contact() {
    }

    public int getIdIcon() {
        return idIcon;
    }

    public String getName() {
        return Name;
    }

    public String getPrice() {
        return Price;
    }

    public void setIdIcon(int idIcon) {
        this.idIcon = idIcon;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPrice(String price) {
        Price = price;
    }
}
