import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;

public class LoremIpsum {

    public static String getText() {
        try {
            return Files.readAllLines(FileSystems.getDefault().getPath("resources/loremipsum.txt"))
                    .stream().reduce("", (total, line) -> total + "\r\n" + line);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}
