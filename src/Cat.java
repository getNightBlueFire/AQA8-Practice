import java.util.Calendar;
import java.util.StringJoiner;

public class Cat extends Animal{
    private String eyesColor;

    public Cat(int animalId, String name, Calendar calendar, String eyesColor) {
        super(animalId, name, calendar);
        this.eyesColor = eyesColor;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Cat.class.getSimpleName() + "[", "]")
                .add("eyesColor='" + eyesColor + "'")
                .add("animalId=" + super.getAnimalId())
                .add("name='" + super.getName() + "'")
                .add("calendar=" + getDate(super.getCalendar()))
                .toString();
    }


    private String getDate(Calendar c){
        int i = c.get(1);
        int i1 = c.get(2);


        return i+" "+ i1;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }
}
