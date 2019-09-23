import javax.swing.JOptionPane;
public class hsigfh{
    public static void main() {
        double hoursSleep = Double.parseDouble(JOptionPane.showInputDialog("How many hours of sleep do you get?"));
        while(hoursSleep<0){
            System.out.println("That is not possible!");
            hoursSleep = Double.parseDouble(JOptionPane.showInputDialog("How many hours of sleep do you get?"));
        }
        System.out.println("You said "+hoursSleep+" hours!");
    }
}
