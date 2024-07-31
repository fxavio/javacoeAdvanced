package Intermediate.Exercise6week1;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
public class StreamApiExample {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30, "New York"));
        people.add(new Person("Bob", 25, "San Francisco"));
        people.add(new Person("Charlie", 35, "Los Angeles"));
        people.add(new Person("David", 40, "Chicago"));
        people.add(new Person("Eve", 20, "Seattle"));

        // Printing the original list
        System.out.println("Original list:");
        people.forEach(System.out::println);

        // Filtering people older than 30
        List<Person> olderThan30 = people.stream()
                .filter(person -> person.getAge() > 30)
                .toList();

        System.out.println("\nPeople older than 30:");
        olderThan30.forEach(System.out::println);

        // Mapping person names to uppercase
        List<String> allNamesUppercase = people.stream()
                .map(person -> person.getName().toUpperCase())
                .toList();

        System.out.println("\nNames of people in uppercase:");
        allNamesUppercase.forEach(System.out::println);
        // Custom comparator to sort by age
        Comparator<Person> byAge = Comparator.comparingInt(Person::getAge);

        // Sorting the list using the custom comparator
        List<Person> sortedByAge = people.stream()
                .sorted(byAge)
                .toList();

        System.out.println("Sorted by age:");
        sortedByAge.forEach(System.out::println);

        // Filtering people older than 30 and transforming their names to uppercase
        List<String> namesUppercase = sortedByAge.stream()
                .filter(person -> person.getAge() > 30)
                .map(person -> person.getName().toUpperCase())
                .toList();
        System.out.println("\nNames of people older than 30 in uppercase:");
        namesUppercase.forEach(System.out::println);

        // Sum of ages of people older than 30
        int sum = sortedByAge.stream()
                .filter(person -> person.getAge() > 30)
                .mapToInt(Person::getAge)
                .sum();
        System.out.println("\nSum of ages of people older than 30: " + sum);

        // Average age of people older than 30
        double average = sortedByAge.stream()
                .filter(person -> person.getAge() > 30)
                .mapToInt(Person::getAge)
                .average()
                .orElse(0.0);
        System.out.println("\nAverage age of people older than 30: " + average);

        // Maximum age of people older than 30
        int maxAge = sortedByAge.stream()
                .filter(person -> person.getAge() > 30)
                .mapToInt(Person::getAge)
                .max()
                .orElse(0);
        System.out.println("\nMaximum age of people older than 30: " + maxAge);

        // Minimum age of people older than 30
        int minAge = sortedByAge.stream()
                .filter(person -> person.getAge() > 30)
                .mapToInt(Person::getAge)
                .min()
                .orElse(0);
        System.out.println("\nMinimum age of people older than 30: " + minAge);

        // Count of people older than 30
        long count = sortedByAge.stream()
                .filter(person -> person.getAge() > 30)
                .count();
        System.out.println("\nCount of people older than 30: " + count);

        // Check if all people are older than 18
        boolean allAdults = sortedByAge.stream()
                .allMatch(person -> person.getAge() > 18);
        System.out.println("\nAre all people older than 18? " + allAdults);

        // Check if any person is older than 50
        boolean anyOlderThan50 = sortedByAge.stream()
                .anyMatch(person -> person.getAge() > 50);
        System.out.println("\nIs any person older than 50? " + anyOlderThan50);
    }
}
