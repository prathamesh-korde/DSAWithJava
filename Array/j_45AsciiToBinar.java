public class j_45AsciiToBinar {
    public static void main(String[] args) {
        String input = "Hello, World!";
        StringBuilder binaryResult = new StringBuilder();
        
        for (char character : input.toCharArray()) {
            // Convert character to ASCII code
            int ascii = (int) character;
            // Convert ASCII code to 7-bit binary string
            String binaryString = String.format("%7s", Integer.toBinaryString(ascii)).replace(' ', '0');
            // Append to result
            binaryResult.append(binaryString).append(" ");
        }
        
        System.out.println("Original String: " + input);
        System.out.println("7-bit ASCII Binary: " + binaryResult.toString());
    }
}

