package at.aau.se15.bsp1;

public class MyCollection {
    private String[] list;
    private int cursor=0;

    public MyCollection(int capacity){
        list = new String[capacity];
        cursor=0;
    }

    /**
     * Returns the size of the collection
     * @return The number of instances in the collection
     */
    public int size() {
        return cursor;
    }

    /**
     * Adds the String from to list. If the list is full it throws an IllegalArgumentException
     * @param s String to remove
     */
    public void add(String s) {
        list[cursor++]=s;
    }

    /**
     * Removes the String from the list. If the String is not in the list it throws an
     * IllegalArgumentException. If the list is empty it throws an IllegalArgumentException
     * @param s String to remove
     */
    public void remove(String s) throws IllegalArgumentException{
    	if(list.length==0) {
    		throw new IllegalArgumentException();
    	}
    	boolean found=false;
    	for(int i=0;i<list.length;i++) {
    		if(list[i]==s) {
    			list[i]=null;
    			cursor--;
    			found=true;
    		}
    	}
    	if(found==false) {
    		throw new IllegalArgumentException();
    	}
    }

    /**
     * Removes all items from the list and initializes a new list
     */
    public void empty() {

    }
    
    public String[] getList() {
    	return list;
    }

}