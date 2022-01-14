public class Button implements Component {

    private final String template;

    public Button(String caption) {
        template = """
                <input type=text> %s </input>
                """.formatted(caption);
    }

    @Override
    public String toString() {
        return template;
    }

}
