package ItteratorDesignPattern;

import java.lang.reflect.Array;

public class Wishlist {
    static final int MAX_ITEMS = 5;
    private String name;
    private Item[] items;
    private int count;
    
    public Wishlist(String name){
        this.name = name;
    }

    public void AddItem(String title, String description, double price){
        
    }

    public WishListIterator createIterator(){
        return null;
    }

    public double getTotalCost(){
        return 0.00;
    }
    
    private Item[] growArray(Item[] items){
        return items;
        
    }
}
