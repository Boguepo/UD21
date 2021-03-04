package obj;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Hashtable;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;




class GeometriaTest {
	Geometria g;
	Hashtable<Integer, String> figura = new Hashtable<Integer, String>();
	
	
	@BeforeEach
	void before() {
		g = new Geometria();
	}
	@Test
	void testGeometriaInt() {
		Geometria geo = new Geometria(1);
		
		int actual = geo.getId();
		int expected = 1;
		assertEquals(expected, actual);
		
		String actual2 = geo.getNom();
		String expected2 = "cuadrado";
		assertEquals(expected2, actual2);
		
		double actual3 = geo.getArea();
		double expected3 = 0.0;
		assertEquals(expected3, actual3);
		
	}

	@Test
	void testGeometria() {
		
		int id_e = 9;
		int id = g.getId();
		String nom_e = "Default";
		String nom = g.getNom();
		double area_e = 0;
		double area = g.getArea();
		
		assertEquals(id_e, id);
		assertEquals(nom_e, nom);
		assertEquals(area_e, area);
		
		
	}

	@Test
	void testAreacuadrado() {
		int actual = g.areacuadrado(3);
		int expected = 9;
		assertEquals(expected, actual);
	}

	@Test
	void testAreaCirculo() {
		double actual = g.areaCirculo(3);
		double expected = 3.1416 * Math.pow(3, 2);
		assertEquals(expected, actual);
	}

	@Test
	void testAreatriangulo() {
		int actual = g.areatriangulo(3, 2);
		int expected = (3*2)/2;
		assertEquals(expected, actual);
	}

	@Test
	void testArearectangulo() {
		int actual = g.arearectangulo(3, 2);
		int expected =  3*2;
		assertEquals(expected, actual);
	}

	@Test
	void testAreapentagono() {
		int actual = g.areapentagono(3, 2);
		int expected = (3*2)/2;
		assertEquals(expected, actual);
	}

	@Test
	void testArearombo() {
		int actual = g.arearombo(3, 2);
		int expected = (3*2)/2;
		assertEquals(expected, actual);
	}

	@Test
	void testArearomboide() {
		int actual = g.arearomboide(3, 2);
		int expected = 3*2;
		assertEquals(expected, actual);
	}

	@Test
	void testAreatrapecio() {
		int actual = g.areatrapecio(3, 2, 3);
		int expected = ((3+2)/2)*3;
		assertEquals(expected, actual);
	}

	@Test
	
	void testFigura() {
		figura.put(1, "cuadrado");
		figura.put(2, "Circulo");
		figura.put(3, "Triangulo");
		figura.put(4, "Rectangulo");
		figura.put(5, "Pentagono");
		figura.put(6, "Rombo");
		figura.put(7, "Romboide");
		figura.put(8, "Trapecio");
		figura.put(9, "Default");
		for(int i = 1; i<=9; i++) {
			String actual = g.figura(i);
			String expected = figura.get(i);
			assertEquals(expected, actual);
		}
	
	}

	@Test
	void testSetId() {
		g.setId(10);
		int actual = g.getId();
		int expected = 10;
		assertEquals(expected, actual);
	}

	@Test
	void testSetNom() {
		g.setNom("Prueba");
		String actual = g.getNom();
		String expected = "Prueba";
		assertEquals(expected, actual);
	}

	@Test
	void testSetArea() {
		g.setArea(0.5);
		double actual = g.getArea();
		double expected = 0.5;
		assertEquals(expected, actual);
	}

	@Test
	void testToString() {
		String actual = g.toString();
		String expected = "Geometria [id=9, nom=Default, area=0.0]";
		assertEquals(expected, actual);
	}

}
