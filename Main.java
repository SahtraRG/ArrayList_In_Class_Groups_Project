package ArrayClassProject;

import java.util.ArrayList;

public class Main {
   public static void main(String[] args) {

      ArrayList<String> names = new ArrayList<>();
      ArrayList<Integer> classesEnrolled = new ArrayList<>();
      ArrayList<Person> persons = new ArrayList<>();
      
      Person[] peopleArray = {
         new Person("Daniel", 3, "Software Engineer", 122644),
         new Person("Sahtra", 4, "Software Engineer", 15000000),
         new Person("Dean", 5, "Software Engineer", 100000)
      };
      
      for (Person person : peopleArray) {
         names.add(person.getName());
         classesEnrolled.add(person.getNumberOfClasses());
         persons.add(person);
      }

      for (Person person : persons) {
         System.out.println("Name: " + person.getName());
         System.out.println("Classes Enrolled: " + person.getNumberOfClasses());
         System.out.println("Desired Job: " + person.getDesiredJobTitle());
         System.out.println("Desired Salary: $" + person.getDesiredSalary());
      }
   }
}

