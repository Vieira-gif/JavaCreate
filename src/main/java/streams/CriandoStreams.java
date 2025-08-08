package streams;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {
        Consumer<String> print = System.out::println;

        Stream<String> langs = Stream.of("English", "Spanish", "French\n");
        langs.forEach(print);
    }
}
