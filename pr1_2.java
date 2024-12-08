public class pr1_2 {
    public static void main(String[] args) {
        String input = "Hello World!";
        String output = swapBits(input);
        System.out.println("Original: " + input);
        System.out.println("Modified: " + output);
    }
    public static String swapBits(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            char swapped = swapBitsOfChar(c);
            result.append(swapped);
        }
        return result.toString();
    }

    public static char swapBitsOfChar(char c) {
        int highNibble = (c & 0xF0) >> 4;
        int lowNibble = (c & 0x0F);
        int swapped = (lowNibble << 4) | highNibble;
        
        return (char) swapped;
    }
}

    

