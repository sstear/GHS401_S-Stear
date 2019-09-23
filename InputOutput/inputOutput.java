import javax.swing.JOptionPane;
public class inputOutput{
    public static void main(){
        String[] classmates = {"Sarah", "Chase", "Drake", "Aiden"};
        for(int i=0; i<classmates.length; i++){
            if(classmates[i] != null){
                System.out.println(classmates[i].length());
                
            }
        }
    }
}