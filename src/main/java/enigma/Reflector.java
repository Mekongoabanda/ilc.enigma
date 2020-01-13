package enigma;

/** Class that represents a reflector in the enigma.
 *  @author
 */
public class Reflector extends Rotor {

	private static final int mConstante = 26;
	
	int[] reflection;
	
	public static Reflector reflectorFactory(String str){
		char[] s = str.trim().replace(" ", "").toCharArray();
		int[] cipher = new int[mConstante];
		for (int i = 0; i< mConstante; i++){
			cipher[i] = toIndex(s[i]);
		}
		return new Reflector(cipher);
	}
	
	Reflector(int[] r){
		super(r,0);
		reflection = r;
	}
        
    public int convertForward(int p) {
        return ((reflection[((p)%mConstante+mConstante)%mConstante])%mConstante+mConstante)%mConstante;
    }

    @Override
    public int convertBackward(int unused) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void advance() {
    }

}
