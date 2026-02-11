
/*
This code is provided to give you a
starting place. It should be modified.
No further imports are needed.
To earn full credit, you must also
answer the following questions:

Q1: Car and Engine are related
by which, Inheritance or Composition?

Q2: Color and Red are related
by which, Inheritance or Composition?

Q3: Shirt and Clothing are related
by which, Inheritance or Composition?

Q4: Furniture and Desk are related
by which, Inheritance or Composition?

Q5: CellPhone and Battery are related
by which, Inheritance or Composition?

*/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println();

        // the name of the file to read into the program
        String fileName = "hr.txt";

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
        System.out.println("List of people:");
        for (Person person : ps.people) {
            System.out.println(person);
        }

        /*
         * // Don't overcomplicate the data
         * // reading. After skipping the
         * // first row, you can use the
         * // following to read a row of
         * // character info, assuming your
         * // Scanner is named "fileReader"
         * String name = fileReader.next();
         * double height = fileReader.nextDouble();
         * double weight = fileReader.nextDouble();
         */

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
