import java.util.ArrayList;

public class PersonSet implements PersonList {

    protected ArrayList<Person> people = new ArrayList<>();

    @Override
    public void add(Person p) {
        // TODO Auto-generated method stub
        if (!people.contains(p)) {
            people.add(p);
        }
    }

    @Override
    public Person get(int index) {
        // TODO Auto-generated method stub
        return people.get(index);
    }
}
