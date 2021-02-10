package ItteratorDesignPattern;

public class WishListIterator implements Iterator {

    private Item[] items;
    private int position;

    public WishListIterator(Item[] items){
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if(position >= items.length || items[position] == null){
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public Object next() {
        Object object = items[position];
        position = position + 1;
        return object;
    }
    
}
