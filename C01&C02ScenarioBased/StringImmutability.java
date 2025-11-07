public class StringImmutability {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("Original String: " + str);

        String replaced = str.replace('H', 'J');
        String concatenated = str.concat(" World");

        System.out.println("After replace(): " + replaced);
        System.out.println("After concat(): " + concatenated);
        System.out.println("Original String remains: " + str);
    }
}
