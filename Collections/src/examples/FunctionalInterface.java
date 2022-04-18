package examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FunctionalInterface {
    public static void main(String[] args) {
        Function<String,String> toUpper= str-> str.toUpperCase();
        System.out.println(toUpper.apply("luis fernando"));

        BiFunction<String,String,String> concat=(str1, str2)-> str1+" "+str2;
        System.out.println(concat.apply("hola","Mundo"));

        List<Item> items= new ArrayList<>();
        Collections.addAll(items,new Item("Iphone", 30),
        new Item("Samsung", 40),
        new Item("Xiaomi", 15)
        );
    
        List<String> itmNames= items.stream().map(i-> i.getName()).collect(Collectors.toList());
        itmNames.forEach(a-> System.out.println(a));
    }


}

class Item{
    private String name;
    private int price;
    
    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
}
