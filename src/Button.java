public class Button implements Component {

    private final String template;

    public Button(String caption) {
        template = String.format("<input type=text> %s </input>", caption);
    }

    @Override
    public String toString() {
        return template;
    }

}
