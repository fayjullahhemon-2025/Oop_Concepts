package Four.pillers.of.oop.Problem.In.Multiple.inheritance;
interface P{
    public void foo();
}
interface Q{
    public void foo();
}
class R implements P,Q{
    public void foo(){
        System.out.println("From C");
    }
}
public class Solution_Interface {
    public static void main(String[] args) {
        R r = new R();
        r.foo();
    }
}
