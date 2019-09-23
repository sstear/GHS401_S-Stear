
public class ArraysAndStuff
{
    public static void main(){
        //random integer between 90 and 100, inclusive
        int num;
        for(int i=0; i<30; i++){
            num = (int)(Math.random()*11 + 90);
            System.out.println(num);
            System.out.print("Remainder when divided by two is "+num%2);
        }
}
}