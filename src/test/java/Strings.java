import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Strings {

    @Test
    public void paranthesisCheck(){
        //“{“,”}”,”(“,”)”,”[“,”]”
        Map<Character,Character> leftRight = new HashMap<>();
        leftRight.put('}','{');
        leftRight.put(')','(');
        leftRight.put(']','[');


    }
}

