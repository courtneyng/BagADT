import java.util.Random; //Import random to get random numbers


/**
 * Abstract Data Type Bag
 * @author: Courtney Ng
 * @version 1.7.0
 */


public class bagMethods implements bagInterface{
    private int count; //Keeps count of the size.
    private Object[] bag; //Creates the bag array.

    //Constucts a new bag object and starts the count at 0.
    public bagMethods(){
        this.count = 0;
        bag = new Object[100]; //Initializes the bag to have 100 spaces.
    }

    
    /**
     * Inserts new item at the end of the list if not full.
     * @param item - Variable for object that is getting inserted into the array
     * @exception - Exception out of bounds
     */

    public void insert(Object item) throws exceptionOutOfBound{
        /**
         * If the count(the amount of items in the bag) is equal to the limit
         * of the bag, throw exception because it is full.
         * Otherwise, set the index to the item and increment count.
         */
        if(count == bag.length){
            throw new exceptionOutOfBound("The bag is full.");
        }
        else{
            bag[count] = item;
            count++;
        }
        
    }

    /**
     * @return - Integer
     * Returns the amount of items that are in the bag.
     */

    public int size(){
        return count;     
    }

    /**
     * Removes the last item in the bag.
     * @return - Boolean
     * @exception - Throws empty bag exception.
     */
    public boolean removeLast() throws exceptionEmptyBag{
        /**
         * If the count is 0, it throws empty bag exception.
         * Otherwise removes the index of count(size) and
         * changes the count to one less.
         */
        if(count == 0){
            throw new exceptionEmptyBag("The bag is empty");
        }

        else{
            bag[count-1] = null;
            count--;
    
            return true;
        }
        
    }

    /**
     * Removes a random item in the bag.
     * @return - Boolean
     * @exception - Throws empty bag exception. 
     */

    public boolean removeRandom() throws exceptionEmptyBag{
        Object temp; //Temp is a placeholder for the random number index.
        Random rand = new Random(); //Sets random function.
        int randNum = rand.nextInt(count); //Gets a random number between 0-99.
        
        //If the random number picked is empty, throws the empty bag exception.
        if(bag[randNum] == null){
            throw new exceptionEmptyBag("That slot is empty.");
        }
        else{
            //Removes random number
            bag[randNum] = null;
            temp = bag[randNum];

            //Shifts all indexes up 1 to be consecutive.
            bag[randNum] = bag[randNum+1];
            for(int i=randNum;i<count-randNum; i++){
                bag[i]=bag[i+1];
            }
            //Takes the removed object out of the count.
            bag[count]=temp;
            count--;

            return true;
        }
    }

    /**
     * Get index of the first occurance of an item from this bag get(reference to an item).
     * @param - Object item
     * @return - Integer (index)
     */
    public int getItem(Object item){
        int sum=0; //Sets a count to check first.
        int index=0;
        //Checks if the name of the bag matches and stops where it is first seen. 
        for(int i=0;i<bag.length;i++){
            if(bag[i] == item && sum<1){
                sum++;
                index = i;       
            }
        }
        return index;
        
    }

    /**
     * Get a reference to an item at position(index)
     * @param - Integer num
     * @return - Returns object
     * @exception - Exception out of bounds
     */
    public Object getIndex(int num){
        /**
         * If num(index) is less than 0 or greater than count throws out of bounds.
         * Otherwise returns the object name.
         */
        if(num < 0 || num > count){
            throw new exceptionOutOfBound("Nonexistent");
        }
        else{
            return bag[num];
        }
       
    }

    /**
     * Checks if the bag is empty.
     * If the size(count) has 1 or greater that means something is in the bag.
     * @return - Boolean
     */
    public boolean isEmpty(){
        if(count>1){
            return false;
        }
        else{
            return true;
        }
    }

    /**
     * Empties the bag.
     * @return - Boolean
     */
    public boolean makeEmpty(){
        for(int i=0;i<count; i++){
            bag[i] = null;
        }
        count = 0;
        return true;
    }


    /**
     * Prints the contents of the bag.
     */
    public void print() {
        for (int j = 0; j < bag.length; j++) {
            System.out.println(bag[j]);
        }
    }

    
}