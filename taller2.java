public class taller2 {

  public static void main(String[] args) {
    taller2 taller = new taller2();
    saga Punto1 = taller.new saga("Saga ", "English ", "George Lucas", "Sci-fi ", 9);
    movie Punto2 = taller.new movie("Movie ", "English ", "George Lucas ", "Sci-fi ", 1,
        "Episode III – Revenge of the Sith", "2h 20m");
    licores vodka = taller.new licores("Vodka ", 350000, " 30% ", "700 ml ", "Russia");
    pola aguila = taller.new pola("Aguila ", 4000, " 11% ", "330 ml ", "Barranquilla", true);
    ron bacardi = taller.new ron("Bacardi ", 450000, " 40% ", "700 ml ", "Cuba ", false);
    guaro antioqueno = taller.new guaro("Antioqueno Azul ", 200000, " 35% ", "700ml ", "Medellin", true);
    System.out.println("Punto 1 ________________________________");
    Punto1.getInfo();
    System.out.println("Punto 2 ________________________________");
    Punto2.getMovieInfo();
    System.out.println("Punto 3 ________________________________");
    vodka.getInfo();
    vodka.ppp(3);
    System.out.println("Punto 4 ________________________________");
    aguila.getInfo();
    aguila.imDrunk(7);
    bacardi.getInfo();
    bacardi.ppp(2);
    antioqueno.getInfo();
    antioqueno.ppp(5);
    antioqueno.imDrunk(17);
  }

  // Punto 1

  public class saga {
    private String type;
    private String language;
    private String creator;
    private String gender;
    private int quantity;

    public saga(String type, String language, String creator, String gender, int quantity) {
      this.type = type;
      this.language = language;
      this.creator = creator;
      this.gender = gender;
      this.quantity = quantity;
    }

    public void getInfo() {

      System.out.println("The information about the class is : " + type + language + creator + gender + quantity);
    }

  }

  // Punto 2

  public class movie extends saga {
    private String name;
    private String duration;

    public movie(String type, String language, String creator, String gender, int quantity, String name,
        String duration) {
      super(type, language, creator, gender, quantity);
      this.name = name;
      this.duration = duration;
    }

    public void getMovieInfo() {
      System.out.println("The name of the movie is " + name + " with a duration of " + duration);
      getInfo();
    }

  }

  // Punto 3

  public class licores {
    private String name;
    private double price;
    private String alcohol;
    private String volume;
    private String origin;

    public licores(String name, double price, String alcohol, String volume, String origin) {
      this.name = name;
      this.alcohol = alcohol;
      this.origin = origin;
      this.volume = volume;
      this.price = price;
    }

    public void getInfo() {
      System.out.println("The info is : " + name + price + alcohol + volume + origin);
    }

    public void ppp(int numOfPeople) {
      double ppp = price / numOfPeople;
      System.out.println("The price per person is : " + ppp);
    }

    public void imDrunk(int shots) {
      int limit = 5;
      if (shots > limit) {
        System.out.println("You are drunk");

      } else {
        System.out.println("You can drink more");
      }
    }
  }

  public class ron extends licores {

    private boolean isColombian;

    public ron(String name, double price, String alcohol, String volume, String origin, boolean isColombian) {
      super(name, price, alcohol, volume, origin);
      this.isColombian = isColombian;
    }

    @Override
    public void imDrunk(int shots) {
      int limit = 5;
      if (shots > limit) {
        System.out.println("You are drunk");

      } else {
        System.out.println("You can drink more");
      }
    }

    @Override
    public void getInfo() {
      System.out.println("The info is : " + super.name + super.price + super.alcohol + super.volume + super.origin
          + " Is colombian : " + isColombian);
    }

  }

  public class pola extends licores {

    private boolean isColombian;

    public pola(String name, double price, String alcohol, String volume, String origin, boolean isColombian) {
      super(name, price, alcohol, volume, origin);
      this.isColombian = isColombian;
    }

    @Override
    public void imDrunk(int shots) {
      int limit = 12;
      if (shots > limit) {
        System.out.println("You are drunk");

      } else {
        System.out.println("You can drink more");
      }
    }

    @Override
    public void getInfo() {
      System.out.println("The info is : " + super.name + super.price + super.alcohol + super.volume + super.origin
          + "Is colombian : " + isColombian);
    }

  }

  public class guaro extends licores {

    private boolean isColombian;

    public guaro(String name, double price, String alcohol, String volume, String origin, boolean isColombian) {
      super(name, price, alcohol, volume, origin);
      this.isColombian = isColombian;
    }

    @Override
    public void imDrunk(int shots) {
      int limit = 8;
      if (shots > limit) {
        System.out.println("You are drunk");

      } else {
        System.out.println("You can drink more");
      }
    }

    @Override
    public void getInfo() {
      System.out.println("The info is : " + super.name + super.price + super.alcohol + super.volume + super.origin
          + "Is colombian : " + isColombian);
    }

  }

}
