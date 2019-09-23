
public class Ghost{
   //instance variables for the class Ghost
   private String color;
   private int speed;
   private int level;
   //zero argument constructor, makes a default ghost
   public Ghost(){
       color = null;
       speed = 0;
       level = 0;
       System.out.println("A default ghost was constructed.");
   }
   //two argument constructor can set the instance variables to anything desired
   public Ghost(String color, int speed, int level){
       this.color = color;
       this.speed = speed;
       this.level = level;
       System.out.println("A unique ghost was constructed.");
   }
   public void bumpSpeed(int bump){
       this.speed+=bump;
   }
   public void bumpSpeed(){
       this.speed++;
   }
   public void doubleColor(){
       this.color+=this.color;
   }
   //public means other classes have access to this method
   //String is the return type of this method, it gives back a String
   //toString is the name of this method
   public String toString(){
       return "Color: " + this.color + ", Speed: " + this.speed + ", Level: " + this.level;
   }
}
