public class Pre implements Component{

    private final String template;

    public Pre(String content) {
        template = String.format("<pre>%s</pre>", content);
    }

    @Override
    public String toString() {
        return template;
    }

}
