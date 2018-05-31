/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Le Hoang Anh
 */
public class App {

    private String name;
    private String img;
    private String price;
    private String createdData;

    public App() {
    }

    public App(String name, String img, String price) {
        this.name = name;
        this.img = img;
        this.price = price;
    }

    public App(String name, String img, String price, String createdData) {
        this.name = name;
        this.img = img;
        this.price = price;
        this.createdData = createdData;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCreatedData() {
        return createdData;
    }

    public void setCreatedData(String createdData) {
        this.createdData = createdData;
    }

    @Override
    public String toString() {
        return "App{" + "name=" + name + ", img=" + img + ", price=" + price + ", createdData=" + createdData + '}';
    }

}
