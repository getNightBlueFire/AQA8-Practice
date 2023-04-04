import java.util.Calendar;

public class Dog extends Animal{
    private int weight;

    public Dog(int animalId, String name, Calendar calendar, int weight) {
        super(animalId, name, calendar);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
