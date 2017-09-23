package visitor;

public class proyectilenemigo extends proyectil{

	public proyectilenemigo() {
		fuerzaimpacto=8;
	}
	
	@Override
	public void atacaraliado(aliado a) {
		System.out.println("ataque a aliado con: " +fuerzaimpacto);
		a.setVida(a.getVida()-fuerzaimpacto);
		
	}

	@Override
	public void atacarenemigo(enemigo e) {
		// no hago nada
		System.out.println("no ataco a enemigos");
		
	}

}
