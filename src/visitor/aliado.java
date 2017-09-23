package visitor;

public class aliado extends personaje{
	
	public aliado() {
		vida=100;
	}

	@Override
	public void seratacado(proyectil p) {
		p.atacaraliado(this);
		
	}
	

}
