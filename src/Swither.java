/**
 * Created by Администратор on 18.03.2016.
 */
public class Swither {

    public ElectrisityInterface consumer;

    public void switherOn() {
        System.out.println("Виключатель включений");

        if (consumer != null) {
            consumer.on();
        }

    }
}
