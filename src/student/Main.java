package student;

public class Main {
  public static void main(String[] args) {
    Student student1 = new Student("Peter Pan", (byte) 12, "A00001");
    Student student2 = new Student("Mario Bros", (byte) 30, "A00002");
    Student student3 = new Student("Betty Bob", (byte) 20);

    // getters
    System.out.println(student1.getName());
    System.out.println(student1.getAge());
    System.out.println(student1.getId());

    // setters
    student1.setName("Paco Jerez");
    student1.setAge((byte) 18);
    student1.setId("A00010");

    System.out.println(student1.getName());
    System.out.println(student1.getAge());
    System.out.println(student1.getId());

    // override toString method
    System.out.println(student1.toString());

    // others methods
    System.out.println(student1.sayHi());
    student1.increaseAge();
    System.out.println(student1.getAge());

    // default values
    Student student4 = new Student();
    System.out.println(student4.getName());
    System.out.println(student4.getAge());
    System.out.println(student4.getId());

    // Clase estática
    // Math.sqrt(12);
  }
}
