package challenges.funcionalinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javafx.scene.image.Image;

public class FuntionalInterfaces {
    public static void main(String[] args) {

        List<Item> items= new ArrayList<>();
        Collections.addAll(items,new Item("Iphone", 1, "smarphone", "apple", 30000),
        new Item("Galletas", 2, "galletas saladas", "gamesa", 12),
        new Item("Doritos", 3, "tostada frita", "Sabritas", 13),
        new Item("Auriculares", 4, "audifonos inalambricos", "patito", 350),
        new Item("Atun", 5, "atun de rodajas", "tuny", 28)
        );
    
        /*List<String> itmNames= items.stream().map(i-> i.getName()).collect(Collectors.toList());
        itmNames.forEach(a-> System.out.println(a));*/

        Optional<Item> chpItem=getCheapestItem(items);
        System.out.println(chpItem.toString());

        List<String> itmNames=getSortedItemNames(items);
        itmNames.forEach(a->System.out.println(a));

        List<Item> expItems=getTwoExpensiveItems(items);
        expItems.forEach(a->System.out.println(a));

        Optional<Integer> sumPrice=sumAllItemsPrice(items);
        if(sumPrice.isPresent()){
            System.out.println(sumPrice.get());
        } 

        /*
OUTPUT

Optional[Item [description=galletas saladas, id=2, manufacter=gamesa, name=Galletas, price=12]]

Atun
Auriculares
Doritos
Galletas
Iphone

Item [description=smarphone, id=1, manufacter=apple, name=Iphone, price=30000]
Item [description=audifonos inalambricos, id=4, manufacter=patito, name=Auriculares, price=350]

30403

        
        */
    }

    public static Optional<Item> getCheapestItem(List<Item> items){
        return items.stream().sorted((item1,item2)-> item1.getPrice()-item2.getPrice()).findFirst();
    }

    public static List<String> getSortedItemNames(List<Item> items){
        return items.stream().map(i->i.getName()).sorted((name1,name2)-> name1.compareTo(name2)).collect(Collectors.toList());
    }

    public static List<Item> getTwoExpensiveItems(List<Item> items){
        return items.stream().sorted((item1,item2)-> item2.getPrice()-item1.getPrice()).limit(2).collect(Collectors.toList());
    }

    public static Optional<Integer> sumAllItemsPrice(List<Item> items){
        return items.stream().map(item->item.getPrice()).reduce((price1,price2)-> price1+price2);
    }

}

class Item{
    private String name;
    private int id;
    private String description;
    private String manufacter;
    private int price;
    
    public Item(String name, int id, String description, String manufacter, int price) {
        this.name = name;
        this.id = id;
        this.description = description;
        this.manufacter = manufacter;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item [description=" + description + ", id=" + id + ", manufacter=" + manufacter + ", name=" + name
                + ", price=" + price + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManufacter() {
        return manufacter;
    }

    public void setManufacter(String manufacter) {
        this.manufacter = manufacter;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    

    
}