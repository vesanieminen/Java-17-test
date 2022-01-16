public class H1 implements Component {

    private final String template;

    public H1(String caption) {
        template = String.format("<h1> %s </h1>", caption);
    }

    @Override
    public String toString() {
        return template;
    }

}
