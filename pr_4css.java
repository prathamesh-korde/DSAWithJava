import java.util.*;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
public class pr_4css {
    public static void main(String[] args) {
           try (Scanner scanner = new Scanner(System.in)) {
            // Take a key from the user (must be 8 characters long)
            System.out.print("Enter a 8-character key: ");
            String userKey = scanner.nextLine();
           String encodedKey = Base64.getEncoder().encodeToString(userKey.getBytes("UTF-8"));
            System.out.println("Secret Key (Base64): " + encodedKey);
            // Encrypt a message
            System.out.println("enter the plaintext-");
            Scanner sc = new Scanner(System.in);
            String plainText = sc.nextLine();
            String cipherText = encrypt(plainText, encodedKey);
            System.out.println("Cipher Text: " + cipherText);
            // Decrypt the message
            String decryptedText = decrypt(cipherText, encodedKey);
            System.out.println("Decrypted Text: " + decryptedText);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String encrypt(String plainText, String encodedKey) throws Exception {
        SecretKeySpec keySpec = new SecretKeySpec(Base64.getDecoder().decode(encodedKey), "DES");
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(Cipher.ENCRYPT_MODE, keySpec);
        byte[] encryptedBytes = cipher.doFinal(plainText.getBytes("UTF-8"));
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }
    public static String decrypt(String cipherText, String encodedKey) throws Exception {
        SecretKeySpec keySpec = new SecretKeySpec(Base64.getDecoder().decode(encodedKey), "DES");
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(Cipher.DECRYPT_MODE, keySpec);
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(cipherText));
        return new String(decryptedBytes, "UTF-8");
    }
}

