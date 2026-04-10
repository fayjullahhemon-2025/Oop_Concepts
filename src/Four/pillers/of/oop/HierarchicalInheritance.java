package Four.pillers.of.oop;
class GrandFather{

    public void accessGrandProperty(){
        System.out.println(" Grand Properties");
    }
    public void accessOwnProperty(){
        System.out.println("Own Properties");
    }
}
class Father extends GrandFather{

    public void accessFathersProperty(){
        System.out.println("Own Properties");
    }
}
class Uncle extends GrandFather{

}
class Me extends Father{

    public void accessMyProperty(){
        System.out.println("Own Properties");
    }
}
class Sibling1 extends Father{

}
class Sibling2 extends Father{
}
class Cousin1 extends Uncle{
}
class Cousin2 extends Uncle{
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Father father = new Father();
        System.out.print("Father can access ");
        father.accessGrandProperty();
        System.out.println("");
        System.out.print("Father also can access ");
        father.accessFathersProperty();
        //-------
        Me me = new Me();
        System.out.print("I can access ");
        me.accessGrandProperty();
        System.out.print("");
        System.out.print("I can access Fathers ");
        me.accessFathersProperty();
        System.out.print("I also can access my ");
        me.accessMyProperty();

    }
}
