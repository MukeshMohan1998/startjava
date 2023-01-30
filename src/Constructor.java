import java.security.PublicKey;
import java.sql.SQLOutput;

class  Car{


    public int speed;
    public String color;

    Car(){
        speed=25;
        color="red";
        System.out.println("Default constructor");
    }

    Car(int i){
        speed=i;

    }
    Car(String l){
        color=l;
    }
    Car(int j ,String k){
        speed=j;
        color=k;

    }



    public  void run() {

        System.out.println("class template");



    }
        }
public class Constructor {
    public static void main(String[] args){

        System.out.println("Main class calling other classes below ");


     /*   Car audi;
        audi = new Car();
        audi.speed=100;
        audi.color="black"; */

        Car tata =new Car();

        //tata.speed=90;
      //  tata.color="White";
        System.out.println(tata.color);
        // audi.run();







    }
}
