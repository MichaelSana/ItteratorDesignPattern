package ItteratorDesignPattern;
import java.util.Iterator;
/**
 * The class which iterates through the WishList array
 * @author Michael Sana
 */
public class WishListIterator implements Iterator {

    private Item[] items;
    private int position = 0;

    /**
     * This method constructs the wish list iterator
     * @param items
     */
    public WishListIterator(Item[] items)
    {
        this.items = items;
    }

    /** This method determines if the wishlist has an open spot
     *  @return have next
     */
    public boolean hasNext()
    {
        if(position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
    }

    /** This method goes to the next avaiable spot  
     * @return item
     */
    public Item next()
    {
        Item item = items[position];
		position = position + 1;
		return item;
    }
    
}
