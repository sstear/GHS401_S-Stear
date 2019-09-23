
public class GhostDriver{
   public static void main(){
       Ghost g1 = new Ghost();
       Ghost g2 = new Ghost();
       Ghost g3 = new Ghost();
       System.out.println(g1);
       Ghost g4 = new Ghost("chartruse",99,8);
       System.out.println(g4);
       g4.bumpSpeed();
       System.out.println(g4);
       g4.doubleColor();
       System.out.println(g4);
   }
}
