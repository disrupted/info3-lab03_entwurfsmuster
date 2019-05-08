public class Enki implements Fabrik {

  String name;

  public Enki(String name) {
    super();
    this.name = name;
    erzeugeSportschuh();
    erzeugeWanderschuh();
    erzeugeStiefel();
  }

  public void erzeugeSportschuh() {
    Sportschuh enkiSportschuh = new Sportschuh(name + "Sportschuh");
  }

  public void erzeugeWanderschuh() {
    Wanderschuh enkiWanderschuh = new Wanderschuh(name + "Wanderschuh");
  }

  public void erzeugeStiefel() {
    Stiefel enkiStiefel = new Stiefel(name + "Stiefel");
  }
}