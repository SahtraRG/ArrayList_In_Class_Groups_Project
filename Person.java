package ArrayClassProject;

public class Person {
  private String name;
  private int numberOfClasses;
  private String desiredJobTitle;
  private int desiredSalary;
  
  public Person(String name, int numberOfClasses, String desiredJobTitle, int desiredSalary) {
     this.name = name;
     this.numberOfClasses = numberOfClasses;
     this.desiredJobTitle = desiredJobTitle;
     this.desiredSalary = desiredSalary;
  }
  
  public String getName() {
     return name;
  }
  public void setName(String name) {
     this.name = name;
  }

  public int getNumberOfClasses() {
     return numberOfClasses;
  }
  public void setNumberOfClasses(int numberOfClasses) {
     this.numberOfClasses = numberOfClasses;
  }

  public String getDesiredJobTitle() {
     return desiredJobTitle;
  }
  public void setDesiredJobTitle(String desiredJobTitle) {
     this.desiredJobTitle = desiredJobTitle;
  }

  public int getDesiredSalary() {
     return desiredSalary;
  }
  public void setDesiredSalary(int desiredSalary) {
     this.desiredSalary = desiredSalary;
  }
}
