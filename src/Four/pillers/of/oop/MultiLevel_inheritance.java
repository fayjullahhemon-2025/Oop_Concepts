package Four.pillers.of.oop;
class As{
    public void emon(){
        System.out.println("Grand parent Emon");
    }
}
class Bs extends As{
    public void ishaq(){
        System.out.println("Parent Ishaq");
    }
}
class C extends Bs{
    public void ismail(){
        System.out.println("Grand child of Emon and Child of Ishaq");
    }
}
public class MultiLevel_inheritance {
    public static void main(String[] args) {
        C c = new C();
        c.emon();
        c.ishaq();
        c.ismail();
    }
}
