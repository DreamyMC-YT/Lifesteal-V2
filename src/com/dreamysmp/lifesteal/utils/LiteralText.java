package src.com.dreamysmp.lifesteal.utils;

public class LiteralText extends Text {
    private final LiteralTextContent content;

    public LiteralText(String text) {
        this.content = new LiteralTextContent(text);
    }

    public LiteralTextContent getContent() {
        return this.content;
    }

    public String asString() {
        return this.content.getString();
    }
}
