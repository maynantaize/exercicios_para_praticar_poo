public class Ponto2D {
  private double x;
  private double y;

  // Construtor default
  public Ponto2D() {
    this.x = 0;
    this.y = 0;
  }

  // Construtor com dois parâmetros
  public Ponto2D(double x, double y) {
    this.x = x;
    this.y = y;
  }

  // Método para calcular a distância do ponto para a origem
  public double distanciaDaOrigem() {
    return Math.sqrt(this.x * this.x + this.y * this.y);
  }

  // Método para calcular a distância do ponto para outro ponto
  public double distanciaPara(Ponto2D outroPonto) {
    double dx = this.x - outroPonto.getX();
    double dy = this.y - outroPonto.getY();
    return Math.sqrt(dx * dx + dy * dy);
  }

  // Getters e setters
  public double getX() {
    return x;
  }

  public void setX(double x) {
    this.x = x;
  }

  public double getY() {
    return y;
  }

  public void setY(double y) {
    this.y = y;
  }
}