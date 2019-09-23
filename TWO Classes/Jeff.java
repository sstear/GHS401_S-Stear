import javax.swing.JOptionPane;
public class Jeff{
   public static void main(){
   Person who = new Person();
   System.out.println(who);
       
   String[] yourName = new String[3];
   String[] friendName = new String[3];
   yourName[0] = JOptionPane.showInputDialog("What is your first name?");
   yourName[1] = JOptionPane.showInputDialog("What is your middle name?");
   yourName[2] = JOptionPane.showInputDialog("What is your last name?");
   friendName[0] = JOptionPane.showInputDialog("What is your friend's first name?");
   friendName[1] = JOptionPane.showInputDialog("What is your friend's middle name?");
   friendName[2] = JOptionPane.showInputDialog("What is your friend's last name?");
   
   int firstL = 0;
   int secondL = 0;
   
   for(int i = 0; i < 3; i++){
       
       firstL += yourName[i].length();
       secondL += friendName[i].length();    
   }
   
   if(firstL > secondL)
       System.out.println("Your name is longer!");
   else if(secondL > firstL)
       System.out.println("Your friend's name is longer!");
   else 
       System.out.println("Your names have the same length!");
   int yourAge = Integer.parseInt(JOptionPane.showInputDialog("What is your age?"));
   int friendAge = Integer.parseInt(JOptionPane.showInputDialog("What is your friend's age?"));
   Person you = new Person(yourName, yourAge);
   Person friend = new Person(friendName, friendAge);
   System.out.println(you);
   System.out.println(friend);
   
  }
}
