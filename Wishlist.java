/**
 * The main class for the wishlist
 * @author Michael Sana
 */
package ItteratorDesignPattern;
public class Wishlist {
    
    private String name;
    private Item[] items;
    private int count = 0;

    /** This method constructs the wishlist
     * @param name
     */
    public Wishlist(String name){
        this.name = name;
        items = new Item[5];
    }

    /**
     * This method adds an item to the wishlist
     * @param title
     * @param description
     * @param price
     */
    public void addItem(String title, String description, double price){
        Item item = new Item(title, description, price);
        if (count >= 5) {
			System.err.println("Sorry, wish list is full!  Can't add item to wish list");
		} else {
			items[count] = item;
			count++;
		}
    }

    /**
     * This method creates an iterator
     * @return new wishlist iterator
     */
    public WishListIterator createIterator(){
        return new WishListIterator(items);
    }

    /**
     * This method calculates the total wishlist cost
     * @return total cost
     */
    public double getTotalCost(){
        double cost = 0;
        for(int i = 0; i < count; i++)
        {
            cost += items[i].getPrice();
        }
        return cost;
    }

    /**
     * This methods doubles the size of the array
     * @param Item[] items
     * @return newItems
     */
    public Item[] growArray(Item[] items){
        Item[] temp = new Item[count];
        temp = items;
        Item[] newItems = new Item[count*2];
        for(int i = 0; i < temp.length; i++)
        {
            newItems[i] = temp[i];
        }
        return newItems;
    }
}
