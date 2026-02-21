import java.util.ArrayList;

public class PersonSet implements PersonList {

    protected ArrayList<Person> people = new ArrayList<>();

    /**
     * Adds a given person to a list if the person is not already in it
     * 
     * @param p The person to check/add
     */
    @Override
    public void add(Person p) {
        // check if p is already in the list. if not, add them. otherwise, they are a
        // duplicate, so skip them
        if (!people.contains(p)) {
            people.add(p);
        }
    }

    /**
     * Returns the person at the given index in the arraylist people
     * 
     * @param index The index to pull from
     * @return The person at the input index
     */
    @Override
    public Person get(int index) {
        return people.get(index);
    }

    public String toString(ArrayList<Person> arr) {

        String peopleStr = "";

        for (int i = 0; i < arr.size(); i++) {
            peopleStr += arr.get(i);
        }

        // TODO: match format of hr.txt
        return peopleStr;
    }
}
