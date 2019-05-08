public class Wanderschuh implements Schuh {

  String name;

  public Wanderschuh(String name) {
    this.name = name + this.getClass().getSimpleName();
    System.out.println(this.name);
  }

}
