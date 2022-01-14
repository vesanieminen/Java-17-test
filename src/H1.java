public class H1 implements Component {

    private final String template;

    public H1(String caption) {
        template = """
                <h1> %s </h1>
                """.formatted(caption);
    }

    @Override
    public String toString() {
        return template;
    }

}
