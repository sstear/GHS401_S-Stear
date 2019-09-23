
public class PandaDriver
{
   public static void main(){
       Panda p1 = new Panda("China",473.8);
       double currentWeight = p1.getWeight();
       currentWeight += 1000;
       p1.setWeight(currentWeight);
       System.out.println(p1.getWeight());
       Panda[] zoo = new Panda[3];
       zoo[0] = new Panda("USA",348.6);
       zoo[1] = new Panda("Canada",483.2);
       zoo[2] = new Panda("Cuba",335.5);
       for(int i = 0; i < zoo.length; i++){
           System.out.println(zoo[i]);
       }
   }
}
