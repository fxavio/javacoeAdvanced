package Intermediate.advancedExceptionHandling;
public class NestedTryCatchExample {

    public void processPeople(PersonManager manager) {
        try {
            try {
                manager.addPerson(new Person("", 25));
            } catch (InvalidPersonException e) {
                System.out.println("Caught InvalidPersonException: " + e.getMessage());
                throw new RuntimeException("RuntimeException due to invalid person");
            }
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        PersonManager manager = new PersonManager();
        NestedTryCatchExample example = new NestedTryCatchExample();
        example.processPeople(manager);
    }
}
