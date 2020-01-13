package enigma;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReflectorTest {

	int[] variable_cipher = new int[26];

	@Test
	public void reflectorFactory(){

		String str = "H";
		char[] s = str.trim().replace(" ", "").toCharArray();

		for (int i = 0; i< 26; i++){
			variable_cipher[i] = (s[i] - 'A');
		}

		Reflector actual = new Reflector(variable_cipher);
		Reflector expected = new Reflector(variable_cipher);
		assertEquals(expected, actual);

	}


}
