
public class DogDriver{
    public static void main(){
        Dog defaultDog = new Dog();
        Dog specificDog = new Dog("Jeff","Poodle",50);
        System.out.println(defaultDog);
        System.out.println(specificDog);
        System.out.println(defaultDog.getWeight());
    }
}