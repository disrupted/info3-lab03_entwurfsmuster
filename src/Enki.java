public class Enki implements Fabrik {

  private String name;

  public Enki(String name) {
    super();
    this.name = name;
    createSchuh();
  }

  public void createSchuh() {
    Schuh enkiSportschuh = new Sportschuh("Enki");
    Schuh enkiWanderschuh = new Wanderschuh("Enki");
    Schuh enkiStiefel = new Stiefel("Enki");
  }
}