package metier;

import static org.junit.Assert.*;

import org.junit.Test;

import iit.service.Calcul;

public class CalculTest {
	private Calcul calcul;
	@Test
	public void testSomme() {
		calcul= new Calcul();
		double a =5;
		double b =10;
		//prenez un scenario: on a output et input
		double expected = 15;
		double res = calcul.somme(a, b);
		assertTrue(res == expected);
		
		
	}


}
