package student;

public class Estudiant {
  private  String name;
  private byte age;
  private String id;
  
  public Estudiant(String name, byte age, String id) {
    this.name = name;
    this.age = age;
    this.id = id;
  }

  public Estudiant(String name, byte age) {
    this.name = name;
    this.age = age;
  }

  public Estudiant() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public byte getAge() {
    return age;
  }

  public void setAge(byte age) {
    this.age = age;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return super.toString();
  }
}
