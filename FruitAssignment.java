package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Fruit {
    String name;
    int Calories;
    int price;
    String color;

    Fruit(String name, int calories, int price, String color) {
        this.name = name;
        this.Calories = Calories;
        this.price = price;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return Calories;
    }

    public void setCalories(int Calories) {
        this.Calories = Calories;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", calories=" + Calories +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

   /* class Sortbycalories implements Comparator<Fruit>
    {
        public int compare(Fruit i1, Fruit i2)
        {
            return .compareTo(str1);
        }
    }*/


}
public class FruitAssignment
{
    public static void main(String[] args)
    {
        Fruit f=new Fruit("Apple",100,100,"red");
        Fruit f1=new Fruit("Guava",80,50,"green");
        Fruit f2=new Fruit("Mongo",200,200,"yellow");
        Fruit f3=new Fruit("Banana",60,300,"paleYellow");
        ArrayList<Fruit> l=new ArrayList<>();
        {
           // List<String> updatelist= l.stream().filter(l.getColor());
        }
    }
}
