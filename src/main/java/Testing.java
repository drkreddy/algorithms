import java.util.Optional;

public class Testing {

    public static void main(String[] args) {
        String abc="abc";
        Optional.ofNullable(abc).map(String::toUpperCase);
                String acd=null;
        Optional.ofNullable(acd).map(String::toUpperCase);
    }
}
