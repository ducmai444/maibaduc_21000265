package ex2.ex2_2;

import Lab05.Ex2_2.Author;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = 0;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthor() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorNames() {
        String str = "";
        for (int i = 0; i < authors.length; i++) {
            if (i == authors.length - 1){
                str = str + authors[i].getName();
            }
            str = str + authors[i].getName() + ", ";
        }
        return str;
    }


    @Override
    public String toString() {
        String str = "Book[" + "name='" + name + "', authors={";
        for (int i = 0; i < authors.length; i++) {
            if (i == authors.length - 1){
                str = str + authors[i].toString();
            }
            str = str + authors[i].toString() + ",";
        }
        str = str + "}, price=" + price + ", qty=" + qty + ']';
        return str;
    }
}
