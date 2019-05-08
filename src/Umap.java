public class Umap implements Fabrik {

  private String name;

  public Umap(String name) {
    super();
    this.name = name;
    createSchuh();
  }

  public void createSchuh() {
    Schuh umapSportschuh = new Sportschuh(this.name);
    Schuh umapWanderschuh = new Wanderschuh(this.name);
    Schuh umapStiefel = new Stiefel(this.name);
  }
}