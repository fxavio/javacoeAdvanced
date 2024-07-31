package Intermediate.advancedExceptionHandling;

public class CustomExceptionExample {

    public static void main(String[] args) {
        CustomExceptionExample example = new CustomExceptionExample();
        try {
            example.processPerson(new Person("Alice", -5));
        } catch (InvalidAgeException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }

    public void processPerson(Person person) throws InvalidAgeException {
        if (person.getAge() < 0) {
            throw new InvalidAgeException("Age cannot be negative");
        }
        System.out.println("Processing person: " + person);
    }
}

