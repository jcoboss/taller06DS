/**
 * 
 */
package emsamablajecomputadoras;

import emsamablajecomputadoras.Builder.AsusRogueBuilder;
import emsamablajecomputadoras.Builder.AsusZenbookBuilder;
import emsamablajecomputadoras.Builder.ComputadoraDirector;
import emsamablajecomputadoras.creacional.*;

/**
 * @author djurado
 *
 */
public class PrincipalComputadoras {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		ComputadoraDirector cD = new ComputadoraDirector(new AsusZenbookBuilder());
		
		cD.contruirComputadora();
		
		Computador zen = cD.getComputador();
		
		ComputadoraDirector cD2 = new ComputadoraDirector(new AsusRogueBuilder());
		
		cD2.contruirComputadora();
		
		Computador rogue = cD2.getComputador();
		
		//Mostrar las caracteristicas de ambas computadoras 
		System.out.print(rogue.toString());
		System.out.print(zen.toString());
		

	}

}
