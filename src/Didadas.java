public class Didadas implements Fabrik {

  private String name;

  public Didadas(String name) {
    super();
    this.name = name;
    createSchuh();
  }

  public void createSchuh() {
    Schuh didadasSportschuh = new Sportschuh(this.name);
    Schuh didadasWanderschuh = new Wanderschuh(this.name);
    Schuh didadasStiefel = new Stiefel(this.name);
  }
}