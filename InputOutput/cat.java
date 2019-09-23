import javax.swing.JOptionPane;
public class cat
{
  public static void main(){
    String name = JOptionPane.showInputDialog("What is your name?");
    int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age?"));
    System.out.println("Hello " + name + ".");
    if(age > 15){
    System.out.println("You can drive, " + name + "!");
    }
    else{System.out.println("Nice bike, " + name + "!");
}
}
}