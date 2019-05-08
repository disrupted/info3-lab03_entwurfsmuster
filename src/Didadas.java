public class Didadas implements Fabrik {

  private String name;

  public Didadas(String name) {
    super();
    this.name = name;
    createSchuh();
  }

  public void createSchuh() {
    Schuh didadasSportschuh = new Sportschuh("Didadas");
    Schuh didadasWanderschuh = new Wanderschuh("Didadas");
    Schuh didadasStiefel = new Stiefel("Didadas");
  }
}