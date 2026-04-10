package Classes_Objects;

public class Animal {
    String species;
    String name;
    int age;
    String gender;
    float height;
    float weight;

    public void walking(){
        System.out.println(species + ", " + name + " is walking");
    }
    public void running(){
        System.out.println(species + ", "+ name + " is running");
    }
    public void eating(){
        System.out.println(species + ", " +name + "is eating");
    }
    public void drinking(){
        System.out.println(species + ", "+ name + " is drinking");
    }
    public void activities(){
        System.out.println(species + ", "+ name + "'s age is :"+age + " and its gender is "+gender );
        if(gender.equals("male")){
            System.out.println("His height is: "+height);
            System.out.println("and his weight is: "+weight);
        }
        else{
            System.out.println("Her height is: "+height);
            System.out.println("and her weight is: "+weight);
        }
        walking();
        running();
        eating();
        drinking();
    }


}
