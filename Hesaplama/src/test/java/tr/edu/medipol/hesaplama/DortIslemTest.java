package tr.edu.medipol.hesaplama;

import static org.junit.Assert.*;

import org.junit.Test;

public class DortIslemTest {

	@Test
	public final void testToplama() {
		int sonuc = new DortIslem().toplama(45, 55);
		assertEquals(100, sonuc);
	}

	@Test
	public final void testCikarma() {
		int sonuc = new DortIslem().cikarma(45, 55);
		assertEquals(-10, sonuc);
	}

	@Test
	public final void testCarpma() {
		int sonuc = new DortIslem().carpma(45, 10);
		assertEquals(450, sonuc);
	}

	@Test
	public final void testBolme() {
		int sonuc = new DortIslem().bolme(45, 5);
		assertEquals(9, sonuc);
	}

}
