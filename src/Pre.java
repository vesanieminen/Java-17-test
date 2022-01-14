public class Pre implements Component{

    private final String template;

    public Pre(String content) {
        template = """
                <pre>%s</pre>
                """.formatted(content);
    }

    @Override
    public String toString() {
        return template;
    }

}
