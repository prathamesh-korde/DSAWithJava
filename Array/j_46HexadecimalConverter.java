public class j_46HexadecimalConverter {
    public static void main(String[] args) {
        String input = "Hello World!";
        String output = convertToHex(input);
        System.out.println("Original: " + input);
        System.out.println("Hexadecimal: " + output);
    }

    public static String convertToHex(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            result.append(String.format("%02X", (int) c)).append(" ");
        }
        return result.toString().trim();
    }
}
