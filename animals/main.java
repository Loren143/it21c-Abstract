package animals;

public class Main{
    
    public static void main(String[]args){
        Pets myDog = new Dog("Tisoy");
        Cat myCat = new Cat("Bugoy");
        
        
        
        System.out.println(myDog.name + " is " + myDog.Color());
        System.out.println(myCat.name + " is " + myCat.Color());
    }
    
}

   