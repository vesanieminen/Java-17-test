import java.util.stream.Stream;

public class VerticalLayout implements Component {

    private final String template;

    public VerticalLayout(String id, Component... content) {
        template = String.format("<div %s class='vertical-layout'> %s </div>",
                id == null ? "" : "id='" + id + "'",
                Stream.of(content).map(Object::toString).reduce("", (total, element) -> total + element));
    }

    public VerticalLayout(Component... content) {
        this(null, content);
    }

    @Override
    public String toString() {
        return template;
    }

}
