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
        // TODO change this to be a database-ready string
        return name + ", " + height + ", " + weight;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }

        if (o == this) {
            return true;
        }

        if (!(o instanceof Person)) {
            return false;
        }

        Person p = (Person) o;

        if (p.name.equals(this.name) && p.height == this.height && this.weight == this.weight) {
            return true;
        }

        return false;
    }
}
