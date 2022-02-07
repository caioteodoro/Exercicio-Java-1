
public abstract class FiguraGeometrica implements Calcula {
	private String cor;
	public FiguraGeometrica(String cor) {
		this.cor = cor;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public String setCor(String cor) {
		return this.cor = cor;
	}
	
	public abstract boolean compare(FiguraGeometrica outra);
	
}
