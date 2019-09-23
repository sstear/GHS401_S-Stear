
public class Panda
{
   private String country;
   private double weight;
   public Panda(){
       this.country = null;
       this.weight = 0;
   }
   public Panda(String c, double w){
       this.country = c;
       this.weight = w;
   }
   public void setWeight(double w){
       this.weight = w;
   }
   public void setCountry(String c){
       this.country = c;
   }
   public String getCountry(){
       return this.country;
   }
   public double getWeight(){
       return this.weight;
   }
   public String toString(){
       return "Country: "+this.country+"\nWeight: "+this.weight;
   }
}
