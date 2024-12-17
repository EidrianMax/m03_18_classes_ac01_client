package client;

public class Client {
  private String accountNum;
  private String name;
  private String surname;
  private String nationality = "ES";
  private String phone = "NOT_PROVIDED";
  private String dni;
  private byte age = 18;
  private float debts = 0;
  private boolean active = true;

  public Client(String accountNum, String name, String surname, String nationality, String phone, String dni,
      byte age) {
    this.accountNum = accountNum;
    this.name = name;
    this.surname = surname;
    this.nationality = nationality;
    this.phone = phone;
    this.dni = dni;
    this.age = age;
  }

  public Client(String accountNum, String name, String surname, String dni) {
    this.accountNum = accountNum;
    this.name = name;
    this.surname = surname;
    this.dni = dni;
  }

  public String getAccountNum() {
    return accountNum;
  }

  public void setAccountNum(String accountNum) {
    this.accountNum = accountNum;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getDni() {
    return dni;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }

  public byte getAge() {
    return age;
  }

  public void setAge(byte age) {
    this.age = age;
  }

  public float getDebts() {
    return debts;
  }

  public void setDebts(float debts) {
    this.debts = debts;
  }

  public boolean isActive() {
    return active;
  }

  public void setActive(boolean active) {
    this.active = active;
  }

  /**
   * Cancel debts only for active client
   * 
   * @return true if the debt is cancelled
   */
  public boolean cancelDebts() {
    if (active) {
      setDebts(0);
      return true;
    }

    return false;
  }

  /**
   * Reduce debts only for active client and amounts > 0
   * 
   * @param amount the amount to reduce, it must be > 0
   * @return true if the debt is reduced
   */
  public boolean reduceDebts(float amount) {
    if (amount < 0)
      return false;

    if (active) {
      if (amount > debts) {
        setDebts(0);
        return true;
      } else {
        setDebts(debts - amount);
        return true;
      }
    }

    return false;
  }

  /**
   * Increase debt of person, only if client is active an amount > 0
   * 
   * @param amount the amount to add to debt
   * @return true if the debt is increased
   */
  public boolean increaseDebts(float amount) {
    if (active && amount > 0) {
      setDebts(amount + debts);
      return true;
    }

    return false;
  }

  @Override
  public String toString() {
    return "[accountNum=" + accountNum + ", " + "name=" + name + ", " + "surname=" + surname + "nationality="
        + nationality + ", " + "phone=" + phone + ", " + "dni=" + dni + ", " + "age=" + age + ", " + "debts=" + debts
        + ", " + "active=" + active + "]";
  }

}
