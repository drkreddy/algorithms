import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestFlow {

    @BeforeClass
    public static void alla(){
        System.out.println("BEFORE CLASS1");
    }
    @BeforeClass
    public static void all1(){
        System.out.println("BEFORE CLASS2");
    }
    @BeforeClass
    public static void allb(){
        System.out.println("BEFORE CLASS3");
    }
    @Before
    public void beforealla(){
        System.out.println("BEFORE");
    }
    @Before
    public void beforeall(){
        System.out.println("BEFOREa");
    }
    @Test
    public void first(){
        System.out.println("FIRST");
    }
    @Test
    public void second(){
        System.out.println("SECOND");
    }
}
