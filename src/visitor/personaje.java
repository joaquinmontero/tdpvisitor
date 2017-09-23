package visitor;

public abstract class personaje {
	protected int vida;
	
	public abstract void seratacado(proyectil p);
	public int getVida() {
		return vida;
	}
	public void setVida(int v) {
		
		vida=v;
	}
}
