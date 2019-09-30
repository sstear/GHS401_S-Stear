public class Driver
{
    public static void main(){
        double[] grades = {3.0,4.0,1.0,4.0,3.0};
        SmartKid jamie = new SmartKid(grades);
        System.out.println(jamie.calcGPA());
    }
}
