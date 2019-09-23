import javax.swing.JOptionPane;
public class FUNdamental{
    public static void main(){
        int numLength = Integer.parseInt(JOptionPane.showInputDialog("How many numbers do you want?"));
        while(numLength>10000 | 10>numLength){
            System.out.println("Wrong amount!");
            numLength = Integer.parseInt(JOptionPane.showInputDialog("How many numbers do you want?"));
        }
        int[] array = new int[numLength];
        for(int i = 0; i < numLength; i++){
            array[i] = (int)((Math.random()*(6)+15));  
        }
        for(int i = 0; i < numLength; i++){
            System.out.print(array[i]+" ");
        }
        int i = 0;
        int greatest = 0;
        int least = 100;
        while(i<numLength){
            if(array[i]>greatest){
                greatest = array[i];
            }
            if(array[i]<least){
                least = array[i];
            }
            i++;
        }
        System.out.println("");
        System.out.println("greatest "+greatest);
        System.out.println("least "+least);
    }
}
