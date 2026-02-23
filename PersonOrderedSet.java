import java.util.ArrayList;

public class PersonOrderedSet extends PersonSet {

    @Override
    public void add(Person p) {
        super.add(p);
        sort(people);
    }

    private void sort(ArrayList<Person> people) {
        people.sort(null);
    }
}
