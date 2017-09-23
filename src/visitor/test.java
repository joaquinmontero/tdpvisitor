package visitor;

import java.util.Vector;

public class test {

	
	
	public static void main(String[] args) {
		Vector<personaje> personajes=new Vector<personaje>();
		Vector<proyectil> proyectiles=new Vector<proyectil>();
		
		for(int i=0;i<5;i++) {
			personajes.add(new enemigo());
			personajes.add(new aliado());
		}
		for(int i=0;i<4;i++) {
			proyectiles.add(new proyectilaliado());
			proyectiles.add(new proyectilenemigo());
		}
		
		for(int x=0;x<proyectiles.size();x++) {
			for(int y=0;y<personajes.size();y++)
				personajes.get(y).seratacado(proyectiles.get(x));
		}

	}

}
