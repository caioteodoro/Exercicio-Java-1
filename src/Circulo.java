/* Caio Rodrigo Teodoro Santos*/
public class Circulo extends FiguraGeometrica {
	private Ponto ponto;
	private double raio;
	private double pi = Math.PI;
	
	public Circulo(int x, int y, double raio, String cor) {
		super(cor);
		this.ponto = new Ponto(x,y);
		this.raio = raio;
	}
	
	@Override
	public boolean compare(FiguraGeometrica outra) {
		if (this.Area() == outra.Area() && this.Perimetro() == outra.Perimetro()) {
			return true; 
			} else { 
				return false; 
				}
	}
	
	public double Area() {
		return Math.pow(this.raio, 2) * pi;
	}
	
	public double Perimetro() {
		return 2 * this.pi * raio;
	}
	
}
