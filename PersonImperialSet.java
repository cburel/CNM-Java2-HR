public class PersonImperialSet extends PersonSet {

    @Override
    public void add(Person p) {

        // DEBUG
        System.out.println("DEBUG: height and weight before conversion: " + p.height + ", " + p.weight);

        // convert cm to in
        p.height /= 2.54;

        // convert kg to lb
        p.weight *= 2.20462;

        System.out.println("DEBUG: height and weight AFTER conversion: " + p.height + ", " + p.weight);

        super.add(p);
    }
}
