
public class Person
{
   private String[] fullName;
   private int age;
   public Person(){
       fullName = new String[3];
       age = 0;
   }
   public Person(String[] fullName, int age){
       this.fullName = fullName;
       this.age = age;
   }
   public String toString(){
     
       return this.fullName[0] + " " + this.fullName[1] + " " + this.fullName[2] + "\tAge: " + this.age;
      
   }
}
