/**
 * Created by Администратор on 18.03.2016.
 */
public class Runner {

    public static void main(String[] args) {


        Swither swither = new Swither();

        System.out.println("До");
        swither.switherOn();

        swither.consumer =  new Lamp();

        System.out.println("\nПісля");
        swither.switherOn();

    }
}
