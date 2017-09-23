package visitor;

public class enemigo extends personaje{
	
	public enemigo() {
		vida=100;
	}

	@Override
	public void seratacado(proyectil p) {
		p.atacarenemigo(this);
		
	}
}