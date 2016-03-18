/**
 * Created by Администратор on 18.03.2016.
 */
public class Lamp implements ElectrisityInterface {

    @Override
    public void on() {
        lampOn();
    }

    private void lampOn(){
        System.out.println("Лампа включена");
    }
}
