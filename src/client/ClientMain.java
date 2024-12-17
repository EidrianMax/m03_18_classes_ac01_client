package client;

public class ClientMain {
  public static void main(String[] args) {
    System.out.println("Cliente 1");
    Client clie1 = new Client("A0001", "Jose", "Hurtado", "EC", "556480215", "58693214G", (byte) 20);
    System.out.println(clie1.isActive());
    System.out.println(clie1.getDebts());

    System.out.println("CLiente 2");
    Client clie2 = new Client("A0002", "Sebastian", "Maldonado", "54893289E");
    System.out.println(clie2.getNationality());
    System.out.println(clie2.getPhone());
    System.out.println(clie2.getAge());
    System.out.println(clie2.getDebts());
    System.out.println(clie2.isActive());
    
    clie2.setAccountNum("A0003");
    System.out.println(clie2.getAccountNum());
    clie2.setSurname("Oliveiras");
    System.out.println(clie2.getSurname());
    clie2.setNationality("VZ");
    System.out.println(clie2.getNationality());
    clie2.setPhone("546546546");
    System.out.println(clie2.getPhone());
    clie2.setDni("556154615A");
    System.out.println(clie2.getDni());
    clie2.setAge((byte) 80);
    System.out.println(clie2.getAge());
    clie2.setDebts(500);
    System.out.println(clie2.getDebts());
    clie2.setActive(false);
    System.out.println(clie2.isActive());
    System.out.println(clie2.toString());
    clie2.setActive(true);
    clie2.cancelDebts();
    System.out.println(clie2.getDebts());

  }
}
