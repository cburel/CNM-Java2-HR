import java.util.Objects;

public class Person implements Comparable<Person> {
    private String name;
    private double height, weight;

    public Person(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {

        // print as database-ready string
        String output = String.format("%-10s %-20.2f %-20.2f", name, height, weight);

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
        if (p.name.equals(this.name) && p.height == this.height && p.weight == this.weight) {
            return true;
        }

        // check for equality conditions: name values are the same, height values are
        // the same, weight values are the same. returns false if any of these values do
        // not match. otherwise, returns true.
        return (Objects.equals(this.name, p.name) &&
                Double.compare(this.height, p.height) == 0 &&
                Double.compare(this.weight, p.weight) == 0);
    }

    @Override
    public int compareTo(Person other) {

        // returns -1 if this.name < other.name (this preceeds other alphabetically),
        // returns 0 if this.name == other.name (this is equal to other),
        // returns 1 if this.name > other.name (this follows other)
        return this.name.compareTo(other.name);
    }
}
