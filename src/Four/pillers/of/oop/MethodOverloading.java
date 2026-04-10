package Four.pillers.of.oop;
class Arithmetic{
    public int sum(int a, int b){
        return a+b;
    }
    public int sum(int a, int b, int c){
        return a+b+c;
    }
    public String sum(String x, String y){
        return x+y;
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Arithmetic s = new Arithmetic();
        int x = s.sum(2,4);
        int y = s.sum(2,4,4);
        String z = s.sum("Hello","world!");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
