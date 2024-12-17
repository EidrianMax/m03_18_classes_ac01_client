package client;

public class ClientMain {
  public static void main(String[] args) {
    // Use Constructor 1
    Client clie1 = new Client("A0001", "Jose", "Hurtado", "EC", "556480215", "58693214G", (byte) 20);
   
    // Check attributes debt and active are initialize
    System.out.println(clie1.isActive());
    System.out.println(clie1.getDebts());

    // Use Constructor 2
    Client clie2 = new Client("A0002", "Sebastian", "Maldonado", "54893289E");

    // Check all other attributes that are not in the constructor are initialize
    System.out.println(clie2.getNationality());
    System.out.println(clie2.getPhone());
    System.out.println(clie2.getAge());
    System.out.println(clie2.getDebts());
    System.out.println(clie2.isActive());

    // Test getters and setter setAccount & getAccount
    clie2.setAccountNum("A0003");
    System.out.println(clie2.getAccountNum());

    // Test getters and setter setSurname & getSurname
    clie2.setSurname("Oliveiras");
    System.out.println(clie2.getSurname());

    // Test getters and setter setNationality & getNationality
    clie2.setNationality("VZ");
    System.out.println(clie2.getNationality());

    // Test getters and setter setPhone & getPhone
    clie2.setPhone("546546546");
    System.out.println(clie2.getPhone());

    // Test getters and setter setDni & getDni
    clie2.setDni("556154615A");
    System.out.println(clie2.getDni());

    // Test getters and setter setAge & getAge
    clie2.setAge((byte) 80);
    System.out.println(clie2.getAge());

    // Test getters and setter setDebt & getDebt
    clie2.setDebts(500);
    System.out.println(clie2.getDebts());

    // Test isActive and setActive
    clie2.setActive(false);
    System.out.println(clie2.isActive());

    // Test toString
    System.out.println(clie2.toString());

    // Test cancelDebts
    clie2.setActive(true);
    clie2.cancelDebts();
    System.out.println(clie2.getDebts());

    // Test reduceDebt with amount = 50 (set initial debt to 120.25), result = true, debt = 70.25
    clie2.setDebts(120.25f);
    System.out.println("result = " + clie2.reduceDebts(50));
    System.out.println("debt = " + clie2.getDebts());

    // Test reduceDebt with amount = 150 (set initial debt to 120.25), result = true, debt = 0
    clie2.setDebts(120.25f);
    System.out.println("result = " + clie2.reduceDebts(150));
    System.out.println("debt = " + clie2.getDebts());

    // Test reduceDebt with amount = -100 (set initial debt to 120.25), result = false, debt = 120.25
    clie2.setDebts(120.25f);
    System.out.println("result = " + clie2.reduceDebts(-100));
    System.out.println("debt = " + clie2.getDebts());

    // Test increaseDebt with amount = 50 (set initial debt to 120.25), result = true, debt = 170.25
    clie2.setDebts(120.25f);
    System.out.println("result = " + clie2.increaseDebts(50));
    System.out.println("debt = " + clie2.getDebts());

    // Test increaseDebt with amount = -50 (set initial debt to 120.25), result = false, debt = 120.25
    clie2.setDebts(120.25f);
    System.out.println("result = " + clie2.reduceDebts(-50));
    System.out.println("debt = " + clie2.getDebts());
  }
}
