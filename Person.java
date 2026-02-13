public class Person {
    String name;
    double height, weight;

    public Person(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {

        // TODO change this to be a database-ready string, check spacing requirements
        String output = String.format("%-10s %-10.0f %-10.0f", name, height, weight);

        return output;
    }

    @Override
    public boolean equals(Object o) {

        // if there is no object, automatically false
        if (o == null) {
            return false;
        }

        // if the object is the same object as this, automatically true
        if (o == this) {
            return true;
        }

        // if the object isn't a Person, automatically false
        if (!(o instanceof Person)) {
            return false;
        }

        // if the above checks have passed, object is a person, so cast to person and
        // assign it to a new variable for additional comparison
        Person p = (Person) o;

        // if name, height, and weight are the same on both this object and the other
        // object, this entry is equal to the other
        if (p.name.equals(this.name) && p.height == this.height && this.weight == this.weight) {
            return true;
        }

        // if the final check above is not true, then the objects are not equal
        return false;
    }
}
