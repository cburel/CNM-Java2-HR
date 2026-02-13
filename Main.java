
/**
 * @author Celeste Burel
 * Date: 2/22/2026
 * Purpose: To practice inheritance/using interfaces.
 *      Part 1: Set up Person, PersonList, and PersonSet. Test instantiating Person,
 *          PersonSet. Test adding Person to PersonSet. Test printing HR list to
 *          console.
 * Sources: N/A
 */

/*
This code is provided to give you a
starting place. It should be modified.
No further imports are needed.
To earn full credit, you must also
answer the following questions:

Q1: Car and Engine are related
by which, Inheritance or Composition?
-- Following the "is-a" = inheritence vs "has-a" = composition rule,
a car has an engine, so they are related by composition

Q2: Color and Red are related
by which, Inheritance or Composition?
-- Red is a color; inheritence

Q3: Shirt and Clothing are related
by which, Inheritance or Composition?
-- Shirt is a kind of clothing; inheritence

Q4: Furniture and Desk are related
by which, Inheritance or Composition?
-- Desk is a piece of furniture; inheritence

Q5: CellPhone and Battery are related
by which, Inheritance or Composition?
-- CellPhone has a battery; composition

*/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println();

        // check to ensure a file name was entered in the terminal
        if (args.length == 0) {
            System.err.println("File name was not entered.");
            System.exit(1);
        }

        // prompt for the name of the file to read into the program
        String fileName = args[0];

        // test adding a person and print their info
        Person p = new Person("Koopa", 50, 50);
        System.out.println(p);

        // test adding a person set and adding a person to the person set, then print
        PersonSet ps = new PersonSet();
        ps.add(p);
        System.out.println(ps.get(0));

        // try to open the file
        try (Scanner fileReader = new Scanner(new File(fileName))) {

            // if there is info in the file...
            if (fileReader.hasNextLine()) {
                // skip the first line of the file (this line should contain the header strings)
                fileReader.nextLine();
            }

            // parse the info for each person in the file
            while (fileReader.hasNextLine()) {
                String name = fileReader.next();
                double height = fileReader.nextDouble();
                double weight = fileReader.nextDouble();

                // test-print each person's info
                System.out.println("Name: " + name + ", Height: " + height + ", Weight: " + weight);

                // run this person through the PersonList add method, which will add them to the
                // list if they are not a duplicate
                Person person = new Person(name, height, weight);
                ps.add(person);
            }
        } catch (FileNotFoundException e) {

            // print error message if the file by the given file name does not exist
            System.err.println("File " + fileName + " was not found!");

            // exit the program
            System.exit(1);
        }

        // test overridden toString in Person.java
        System.out.println(ps.get(0).toString());

        // test arraylist
        // TODO: add name, height (cm), weight (kg) header
        System.out.println("List of people:");
        for (Person person : ps.people) {
            System.out.println(person);
        }

        /*
         * try
         * {
         * FileWriter fileWriterOrder = new FileWriter("outputfile.txt");
         * fileWriterOrder.write("testing");
         * fileWriterOrder.close();
         * }
         * catch(IOException e)
         * {
         * e.printStackTrace();
         * System.out.println(e);
         * System.exit(1);
         * }
         */
    }
}
