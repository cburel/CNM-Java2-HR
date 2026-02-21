public class PersonOrderedSet extends PersonSet {

    @Override
    public void add(Person p) {
        super.add(p);
        people.sort(null);
    }
}
