import java.io.IOException;
import java.net.ServerSocket;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * This project currently requires JDK 17 in order to be run!
 *
 * To start the application go ahead and run the main method. After that you can navigate to localhost:8080 with your
 * browser to view the result.
 *
 * ==== Java exercises ====
 * 1) Below exists code for a simple HTTP server. The server unfortunately has a bug which prevents it from working
 *    properly. You need to fix this before moving on.
 * 2) Review the classes involved in the project and try to figure out how the application is working. After that you
 *    can add any HTML element you wish as a new class to the project (e.g. img, p, code, ...).
 * 3) Next it's time to refactor the codebase a bit. Go ahead and move things around as much as you'd like. Adding
 *    JavaDocs where it makes sense might not be bad either. What do you see as the most egregious part of the code?
 * 4) (Optional) Create an array or any type of list with some data you wish. Now print everything in the array/list on the page
 *    using a serverside component.
 * 5) (Optional) Delete the mainLayout, everything related to it, and start implementing any layout you wish. You can
 *    also directly modify the index.html if you'd rather work more on the HTML side.
 *
 * ==== CSS exercises ====
 *
 * 1) Implement the basic application layout. Hint: you might want to look into implementing the vertical and horizontal
 *    layouts first. You can search for TODO-CSS1 comment to find the places you need to modify.
 * 2) (Optional) Implement the rest of the layout to the best of your ability. The application should look more or less
 *    like the target.png screenshot. You will find places to edit by searching for the TODO-CSS2 comment.
 *
 * ==== Hints ====
 * - The optimal order of doing the exercises initially is as follows: Java 1, CSS 1. After that you can progress however
 *   you feel like.
 *
 */
public class Main {

    public static void main(String[] args) throws IOException {
        var server = new ServerSocket(8080);
        while (true) {
            final var socket = server.accept();
            var mainLayout = new VerticalLayout(
                    new HorizontalLayout("header", new Label("Header - I should be 50px in height and 100 percent wide")),
                    new HorizontalLayout("content-container",
                            new VerticalLayout("navigation",
                                    new H1("Navigation"),
                                    new Label("I should take 20% of the width"),
                                    new Label("and 100% of the remaining height"), new Br(),
                                    new Anchor("http://google.com", "Google"),
                                    new Anchor("http://vaadin.com", "Vaadin")
                            ),
                            new VerticalLayout("content",
                                    new H1("Content"),
                                    new Label("I should take 80% of the width and 100% of the remaining height"), new Br(),
                                    new Label(LoremIpsum.getText()), new Br(),
                                    new Label(LoremIpsum.getText()), new Br(),
                                    new Label(LoremIpsum.getText())
                            )
                    ),
                    new HorizontalLayout("footer", new Label("Footer - I should be 100px in height and 100 percent wide"))
            );
            var indexHtml = Files.readString(Path.of("frontend/index.html")).formatted(mainLayout);
            final var outputStream = socket.getOutputStream();
            outputStream.write("HTTP/1.1 200 OK\r\n\r\n".getBytes());
            outputStream.flush();
            outputStream.write(indexHtml.getBytes());
        }
    }

}

