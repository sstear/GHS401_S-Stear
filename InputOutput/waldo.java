import javax.swing.JOptionPane;
public class waldo{
    public static void main(){
        String school = JOptionPane.showInputDialog("What is your school?");
        String mascot = JOptionPane.showInputDialog("What is your school's mascot?");
        String[] characters = {"Septimus Heap", "Waldo", "Will Byers", null};
        if(school.equals("Granada")){
            if(mascot.equals("Matadors")){
                for(int i = 0; i<characters.length; i++){
                    if(characters[i]==(null)){
                        System.out.println((i+1)+". Nobody is here!");
                    }
                    else{
                        if(characters[i].equals("Waldo")){
                            System.out.println((i+1)+". Waldo is here!");
                        }
                        else{
                            System.out.println((i+1)+". Waldo is not here! "+characters[i]+" is here!");
                        }
                    }
                }
                String character = JOptionPane.showInputDialog("What is your favorite movie character?");
                if(character.equals("Deadpool")){
                    System.out.println("We have the same favorite character!");
                }
                else{
                    System.out.println("We do not have the same favorite character!");
                }
            }
            else{
                System.out.println("Incorrect! Wrong mascot!");
            }
        }
        else{
            System.out.println("Incorrect! Wrong school!");
        }
    }
}
