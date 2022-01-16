public class Label implements Component {

    private final String template;

    public Label(String caption) {
        template = String.format("<label> %s </label>", caption);
    }

    @Override
    public String toString() {
        return template;
    }

}
