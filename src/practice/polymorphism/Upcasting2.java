package polymorphism;

import static net.mindview.util.Print.print;

 class Cycle1 {
   int wheels() {
         return 1;
     }
 }
 class Unicycle1 extends Cycle1{
     int wheels(){
         return 2;
    }
}
 class Bicycle1 extends Cycle1{
     int wheels(){
         return 3;
    }
}
 class Tricycle1 extends Cycle1{
     int wheels(){
         return 4;
    }
}
public class Upcasting2{
    public static void ride(Cycle c){
        print("车轮子数为:");
    }
     public static void main(String args[]){
        Unicycle unicycle=new Unicycle();
        Bicycle bicycle=new Bicycle();
        Tricycle tricycle=new Tricycle();
        ride(unicycle);
        ride(bicycle);
        ride(tricycle);

    }
}
