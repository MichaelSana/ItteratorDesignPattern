package ItteratorDesignPattern;
/**
 * The main class for an individual item
 * @author Michael Sana
 */
public class Item {
    private String title;
    private String description;
    private double price;

    /**
     * Gives title,description, and price for the item
     * @param title
     * @param description
     * @param price
     */
    public Item(String title, String description, double price){
        this.title = title;
        this.description = description;
        this.price = price;
    }

    /**
     * Gives the string representation of an item
     * @return String representation of an item
     */
    public String toString(){
        return "\n***** " + title + " *****\n" + description + "\nPrice: $" + price;
    }

    /**
     * gives the price for the item
     * @return price
     */
    public double getPrice(){
        return price;
    }

    /** This method prints the item attributes string */
    public void print(){
        System.out.println(toString());
    }
}
