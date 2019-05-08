public class Sportschuh implements Schuh {

  String name;

  public Sportschuh(String name) {
    this.name = name + this.getClass().getSimpleName();
    System.out.println(this.name);
  }

}
