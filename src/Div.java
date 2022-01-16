import java.util.stream.Stream;

public class Div implements Component {

    private final String template;

    public Div(String id, Component... content) {
        template = String.format("<div %s > %s </div>",
                id == null ? "" : "id='" + id + "'",
                Stream.of(content).map(Object::toString).reduce("", (total, element) -> total + element));
    }

    public Div(Component... content) {
        this(null, content);
    }

    @Override
    public String toString() {
        return template;
    }

}
