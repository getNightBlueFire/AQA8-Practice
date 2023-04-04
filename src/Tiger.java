import java.util.Calendar;
import java.util.StringJoiner;

public class Tiger extends Cat{
    private int countEatenEmployees;

    public Tiger(int animalId, String name, Calendar calendar, String eyesColor, int countEatenEmployees) {
        super(animalId, name, calendar, eyesColor);
        this.countEatenEmployees = countEatenEmployees;
    }

    public int getCountEatenEmployees() {
        return countEatenEmployees;
    }

    public void setCountEatenEmployees(int countEatenEmployees) {
        this.countEatenEmployees = countEatenEmployees;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Tiger.class.getSimpleName() + "[", "]")
                .add("countEatenEmployees=" + countEatenEmployees)
                .add("eyesColor='" + super.getEyesColor() + "'")
                .add("animalId=" + super.getAnimalId())
                .add("name='" + super.getName() + "'")
                .toString();
    }
}
