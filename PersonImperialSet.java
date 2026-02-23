public class PersonImperialSet extends PersonSet {

    @Override
    public void add(Person p) {

        // convert cm to in
        p.height /= 2.54;

        // convert kg to lb
        p.weight *= 2.2046;

        super.add(p);
    }
}
