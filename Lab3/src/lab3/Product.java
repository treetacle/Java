/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Treetacle
 */
public class Product {
    private Integer id;
    private String name;
    private double price;
    public String category;
    
    public Product(Integer id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }
        @Override
    public String toString() {
        return id + " " + name + " " + category + " " + price;
    }
}
