public class DocumentEditor {
    public static void main(String[] args) {
        String text = "OpenAI Editor";
        System.out.println("Original: " + text);

        text.replace("Editor", "Writer");
        System.out.println("After replace(): " + text);

        text = text.concat(" Tool");
        System.out.println("After concat(): " + text);

        text = text.toUpperCase();
        System.out.println("After toUpperCase(): " + text);
    }
}
