package streams;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CraindoStreams {
    public static void main(String[] args) {
        Consumer<String> print = System.out::println;

        Stream<String> langs = Stream.of("Lua ", "Java", "JavaScript\n");

        langs.forEach(print);

        String[] maisLangs = {"Python", "JavaScript", "Perl", "Go\n"};

        Stream.of(maisLangs).forEach(print);
        Arrays.stream(maisLangs).forEach(print);
        Arrays.stream(maisLangs, 1, 4).forEach(print);

        List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
        outrasLangs.stream().forEach(print);
        outrasLangs.parallelStream().forEach(print);

    }
}
