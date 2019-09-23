public class challengePythagTriple{
    public static void main(){
        int a = 3;
        int b = 4;
        int c = 5;
        for(double i = 0; i<100; i++){
            System.out.print("a is "+(a*i)+", b is "+(b*i)+", and c is "+(c*i)+".");
            System.out.println("a+b+c is "+((a*i)+(b*i)+(c*i)));
        }
    }
}
