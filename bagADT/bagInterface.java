public interface bagInterface{
    public void insert(Object item) throws exceptionOutOfBound; //insert item into bag
    public int size(); //get amount of items in bag
    public boolean removeLast() throws exceptionEmptyBag; //remove last item in bag
    public boolean removeRandom() throws exceptionEmptyBag; //remove random item in bag
    public int getItem(Object item); //get index of first occurance of an item
    public Object getIndex(int num); //get a reference to an item at position index
    public boolean isEmpty(); //check if the bag is empty
    public boolean makeEmpty(); //empty the bag
    public void print(); // print out bag
}

