public class Enki implements Fabrik {

  private String name;

  public Enki(String name) {
    super();
    this.name = name;
    createSchuh();
  }

  public void createSchuh() {
    Schuh enkiSportschuh = new Sportschuh(this.name);
    Schuh enkiWanderschuh = new Wanderschuh(this.name);
    Schuh enkiStiefel = new Stiefel(this.name);
  }
}