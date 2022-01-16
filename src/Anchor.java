public class Anchor implements Component {

    private final String template;

    public Anchor(String url, String caption) {
        template = String.format("<a href='%s'> %s </a>", url, caption);
    }

    @Override
    public String toString() {
        return template;
    }

}
