
public class Casilla {

	private int valor;
	private boolean inicial,
			utilizado;
	
	public Casilla() {
		this.valor = 0;
		this.inicial = false;
		this.utilizado = false;
	}
	
	public Casilla(int valor, boolean inicial) {
		this.valor = valor;
		this.inicial = inicial;
		this.utilizado = true;
	}
	
	public boolean setValor(int valor) {
		if(valor >=1 && valor <= 9 && !this.inicial){
			this.valor = valor;
			this.utilizado = true;
			return true;
		}
		else {
			return false;
		}
	}
	
	public int getValor() {
		return this.valor;
	}
	
	public boolean getInicial() {
		return this.inicial;
	}
	
	public boolean getUtilizado() {
		return this.utilizado;
	}
}
