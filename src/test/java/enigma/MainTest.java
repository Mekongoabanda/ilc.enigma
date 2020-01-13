package enigma;

import app.Main;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

        //test si un caractère est une miniscule
    @Test
        public void not_UpperLetter(){
            Boolean expected=false;
            Boolean actual= Main.isUpperLetter('a');
            assertEquals(expected,actual);
        }
        //test si un caractere est une majuscule
    @Test
        public void is_UpperLetter(char chc){

            Boolean expected=true;
            Boolean actual=Main.isUpperLetter('D');
            assertEquals(expected,actual);
        }
        //Utilisation

}
