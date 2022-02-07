package problemaTpv;

public class Dinero {

  private double euros;

  public Dinero(){
    this.euros = 0;
  }

  public Dinero(int euros) {
    this.euros = euros;
  }

  public void add(Dinero precio) {
    this.euros = this.euros + precio.getEuros();
  }

  public void minus(Dinero precio) {
    this.euros = this.euros - precio.getEuros();
  }

  public double getEuros() {
    return euros;
  }

  public double multiply(int cantidad) {
    return euros * cantidad;
  }
}
