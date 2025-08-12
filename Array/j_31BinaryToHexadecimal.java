public class j_31BinaryToHexadecimal {
    public static void main(String[] args) {
        // Example binary string
        String binaryString = "101110101001";

        // Step 1: Parse the binary string to an integer
        int decimalValue = Integer.parseInt(binaryString, 2);

        // Step 2: Convert the integer to a hexadecimal string
        String hexadecimalString = Integer.toHexString(decimalValue);

        // Output the result
        System.out.println("Binary: " + binaryString);
        System.out.println("Hexadecimal: " + hexadecimalString);
    }
}
