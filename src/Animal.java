import java.util.Calendar;

public abstract class Animal {
    private int animalId;
    private String name;
    private Calendar calendar;

    public Animal(int animalId, String name, Calendar calendar) {
        this.animalId = animalId;
        this.name = name;
        this.calendar = calendar;
    }

    public void setAnimalId(int animalId) {
        if(animalId < 0){
            throw new RuntimeException("ERROR");
        }
        this.animalId = animalId;
    }

    public int getAnimalId() {




        return animalId;
    }

    public String getName() {



        return name;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }
}
