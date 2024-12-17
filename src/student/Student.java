package student;

public class Student {
  // attributes == instance variable
  private String name;
  private byte age;
  private String id;

  // constructor
  public Student(String name, byte age, String id) {
    this.name = name;
    this.age = age;
    this.id = id;
  } 

  public Student(String name, byte age) {
    this.name = name;
    this.age = age;
  }

  public Student() {
    name = "Nadie";
    age = 0;
    id = "A00000";
  }

  // methods: getters, setters...
  // getters
  public String getName() {
    return name;
  }

  public byte getAge() {
    return age;
  }

  public String getId() {
    return id;
  }

  // setters
  public void setName(String name) {
    this.name = name;
  }

  public void setAge(byte age) {
    this.age = age;
  }

  public void setId(String id) {
    this.id = id;
  }

  // override toString
  @Override
  public String toString() {
    return "Student: " + this.name + " " + this.age + " " + this.id;
  }

  // others methdos
  public String sayHi() {
    return "Hello " + this.name;
  }

  public void increaseAge() {
    this.age++;
  }
}
