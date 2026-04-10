package Four.pillers.of.oop;
interface X{
    public void eating();
}
class Y implements X{
   public void eating(){
       System.out.println("Implements in class Y but declared in Interface X");
   }
}
public class interface_basic {
    public static void main(String[] args) {
        X y = new Y(); //interface_name obj = new class_name()
        y.eating();
    }
}
