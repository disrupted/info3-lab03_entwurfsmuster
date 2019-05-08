public class Umap implements Fabrik {

  private String name;

  public Umap(String name) {
    super();
    this.name = name;
    createSchuh();
  }

  public void createSchuh() {
    Schuh umapSportschuh = new Sportschuh("Umap");
    Schuh umapWanderschuh = new Wanderschuh("Umap");
    Schuh umapStiefel = new Stiefel("Umap");
  }
}