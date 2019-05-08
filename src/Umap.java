public class Umap implements Fabrik {

  private String name;

  public Umap(String name) {
    super();
    this.name = name;
    erzeugeSportschuh();
    erzeugeWanderschuh();
    erzeugeStiefel();
  }

  public void erzeugeSportschuh() {
    Sportschuh umapSportschuh = new Sportschuh(name + "Sportschuh");
  }

  public void erzeugeWanderschuh() {
    Wanderschuh umapWanderschuh = new Wanderschuh(name + "Wanderschuh");
  }

  public void erzeugeStiefel() {
    Stiefel umapStiefel = new Stiefel(name + "Stiefel");

  }
}