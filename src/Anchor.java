public class Anchor implements Component {

    private final String template;

    public Anchor(String url, String caption) {
        template = """
                <a href="%s"> %s </a>
                """.formatted(url, caption);
    }

    @Override
    public String toString() {
        return template;
    }

}
