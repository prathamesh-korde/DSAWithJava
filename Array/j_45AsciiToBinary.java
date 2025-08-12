
public class j_45AsciiToBinary {
    public static void main(String[] args) {
        String input = "Hello World";
        StringBuilder binaryResult = new StringBuilder();
        
        for (char character : input.toCharArray()) {
            int ascii = (int) character;
            String binaryString = String.format("%7s", Integer.toBinaryString(ascii)).replace(' ', '0');
            binaryResult.append(binaryString).append(" ");
        }
        
        System.out.println("Original String: " + input);
        System.out.println("7-bit ASCII Binary: " + binaryResult.toString());
    }
}

