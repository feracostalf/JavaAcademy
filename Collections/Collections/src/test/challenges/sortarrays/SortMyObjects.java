package test.challenges.sortarrays;

import java.util.Arrays;
import java.util.Comparator;

public class SortMyObjects {

    public static void main(String[] args) {
        Item[] items= new Item[]{
            new Item(7, "iPhone", 38),
            new Item(3, "Xiaomi", 15),
            new Item(9, "Samsung", 45)
        };

    System.out.println(Arrays.toString(items));
    sortObjects(items);
    System.out.println(Arrays.toString(items));
        
    }

    public static void sortObjects(Item[] items){
        Arrays.sort(items, new Comparator<Item>() {

            @Override
            public int compare(Item o1, Item o2) {
                return o1.price - o2.price;
            }
            
        });
    }

}

    class Item{
        int id;
        String name;
        int price;

        public Item(int id, String name, int price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Item [id=" + id + ", name=" + name + ", price=" + price + "]";
        }

        
        

    }
    


