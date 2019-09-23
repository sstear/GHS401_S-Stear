import javax.swing.JOptionPane;

public class stephen
{
  public static void main(){
    //String lownum = JOptionPane.showInputDialog("What is the low number?");
    int low = Integer.parseInt(JOptionPane.showInputDialog("What is the low number?"));
    int high = Integer.parseInt(JOptionPane.showInputDialog("What is the high number?"));
    int length = Integer.parseInt(JOptionPane.showInputDialog("How many numbers do you want?"));
    if(low>=high){
        System.out.println("Sorry, you are an idiot and cannot tell the difference between low and high numbers.");
        
    }
    else{
        double[] Numbers = new double[length];
        int Evens = 0;
        for(int i=0; i < length; i++){
            Numbers[i] = Math.floor(Math.random()*(high-low+1)+low);
        }
        for(int i=0; i < length; i++){
            System.out.print((i+1) + ": " + Numbers[i]);
            if(Numbers[i]%2 == 0){
                System.out.println(", even");
                Evens++;
            }
            else{
                System.out.println(", odd");
            }
        }
        System.out.println("Even Numbers: " + Evens);
        System.out.println("Odd Numbers: " + (length-Evens));
        double percent = Math.round(((double)Evens)/length * 10000)*0.01;
        
        System.out.println("Percentage Even: " + percent + "%");
    }
    }
}
