package visitor;

public class proyectilaliado extends proyectil{

	public proyectilaliado() {
		fuerzaimpacto=10;
	}
	@Override
	public void atacaraliado(aliado a) {
		//no hacer nada		
		System.out.println("no ataco a aliados");
	}

	@Override
	public void atacarenemigo(enemigo e) {
		System.out.println("ataque a enemigo con: " +fuerzaimpacto);
		e.setVida(e.getVida()-fuerzaimpacto);
		
	}
	

}
