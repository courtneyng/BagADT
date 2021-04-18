import java.io.FileNotFoundException; //If the file cannot be found

public class HelperClass {
    public static void start() throws exceptionEmptyBag, exceptionOutOfBound, FileNotFoundException{
        bagMethods myBag = new bagMethods();
        //myBag.insert("Apple");
        //System.out.println(myBag.size());
    
        //Adds 10 Apples and 1 Orange into the list to test.
        for(int i=0; i<10; i++){
            myBag.insert("Apple");
        }
        myBag.insert("Orange");
        myBag.print();
        
                
    }

    public static void create(bagMethods myBag){
        for(int i=0; i<10; i++){
            myBag.insert("Apple");
        }

        myBag.removeLast(); //Removes last object in bag
        myBag.print(); //Prints bag contents
        myBag.removeRandom(); //Removes a random object in the bag
        System.out.println(myBag.getItem("Apple")); //Prints and gets the first occurence of the item
        System.out.println(myBag.getIndex(1)); //Prints and gets the item at whatever index
        myBag.size(); //Prints the size of the bag
        System.out.println(myBag.isEmpty()); //Prints and returns if the bag is empty
        myBag.makeEmpty(); //Empties the bag
    }
}
