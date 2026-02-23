public class PersonImperialSet extends PersonSet {

    @Override
    public void add(Person p) {

        // convert cm to in
        p.setHeight(convertHeight(p.getHeight()));

        // convert kg to lb
        p.setWeight(convertWeight(p.getWeight()));

        super.add(p);
    }

    private double convertHeight(double height) {
        return height /= 2.54;
    }

    private double convertWeight(double weight) {
        return weight *= 2.20462;
    }
}
