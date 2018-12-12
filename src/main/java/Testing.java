import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Testing {

    public static void main(String[] args) {
        List<String> ac = new ArrayList<>();
        ac.add("ABC");
        ac.add("DEF");
        ac.add("GGG");
        ac.add("AMF");
        List<String> adf = ac.stream().filter(x -> x.contains("A")).collect(Collectors.toList());
        adf.stream().forEach(System.out::println);
    }

}
