public class Stiefel implements Schuh {

  String name;

  public Stiefel(String name) {
    this.name = name + this.getClass().getSimpleName();
    System.out.println(this.name);
  }

}
