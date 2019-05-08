public class Didadas implements Fabrik {

  private String name;

  public Didadas(String name) {
    super();
    this.name = name;
    erzeugeSportschuh();
    erzeugeWanderschuh();
    erzeugeStiefel();
  }

  public void erzeugeSportschuh() {
    Sportschuh didadasSportschuh = new Sportschuh(name + "Sportschuh");
  }

  public void erzeugeWanderschuh() {
    Wanderschuh didadasWanderschuh = new Wanderschuh(name + "Wanderschuh");
  }

  public void erzeugeStiefel() {
    Stiefel didadasStiefel = new Stiefel(name + "DidadasStiefel");
  }
}