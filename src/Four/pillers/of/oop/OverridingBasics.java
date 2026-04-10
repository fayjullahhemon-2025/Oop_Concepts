package Four.pillers.of.oop;
class BangladeshBank{
    public void RateOfInterest(){
        System.out.println("Rate Of interest is 5%");
    }
}
class DhakaBank extends BangladeshBank{
    @Override
    public void RateOfInterest(){
        System.out.println("Rate of interest is 6%");
    }
}
class JamunaBank extends BangladeshBank{
    @Override
    public void RateOfInterest(){
        System.out.println("Rate of interest is 7%");
    }
}
public class OverridingBasics {
    public static void main(String[] args) {
        DhakaBank malibagBranch = new DhakaBank();
        malibagBranch.RateOfInterest();
    }
}
