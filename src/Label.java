public class Label implements Component {

    private final String template;

    public Label(String caption) {
        template = """
                <label> %s </label>
                """.formatted(caption);
    }

    @Override
    public String toString() {
        return template;
    }

}
