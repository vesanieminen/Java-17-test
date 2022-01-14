import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class LoremIpsum {

    public static String getText() {
        try {
            return Files.readString(Path.of("resources/loremipsum.txt"));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}
