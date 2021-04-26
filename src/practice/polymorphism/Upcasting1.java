package polymorphism;

import static net.mindview.util.Print.print;

class Cycle {}
class Unicycle extends Cycle{}
class Bicycle extends Cycle{}
class Tricycle extends Cycle{}
public class Upcasting1{
    public static void ride(Cycle c){}
    public static void main(String args[]){
        Unicycle unicycle=new Unicycle();
        Bicycle bicycle=new Bicycle();
        Tricycle tricycle=new Tricycle();
        ride(unicycle);
        ride(bicycle);
        ride(tricycle);

    }
}





