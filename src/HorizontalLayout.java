import java.util.stream.Stream;

public class HorizontalLayout implements Component {

    private final String template;

    public HorizontalLayout(String id, Component... content) {
        template = String.format("<div %s class='horizontal-layout'> %s </div>",
                id == null ? "" : "id='" + id + "'",
                Stream.of(content).map(Object::toString).reduce("", (total, element) -> total + element));
    }

    public HorizontalLayout(Component... content) {
        this(null, content);
    }

    @Override
    public String toString() {
        return template;
    }

}
