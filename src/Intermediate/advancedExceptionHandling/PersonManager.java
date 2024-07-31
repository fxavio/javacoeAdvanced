package Intermediate.advancedExceptionHandling;

import java.util.ArrayList;
import java.util.List;

public class PersonManager {

    private final List<Person> people = new ArrayList<>();

    public void addPerson(Person person) throws InvalidPersonException {
        if (person.getName() == null || person.getName().isEmpty()) {
            throw new InvalidPersonException("Person name cannot be null or empty");
        }
        people.add(person);
    }

    public void getPerson(int index) {
        if (index < 0 || index >= people.size()) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    public static void main(String[] args) {
        PersonManager manager = new PersonManager();

        try {
            manager.addPerson(new Person("", 25));
        } catch (InvalidPersonException e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        }

        try {
            manager.getPerson(1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught unchecked exception: " + e.getMessage());
        }
    }
}



