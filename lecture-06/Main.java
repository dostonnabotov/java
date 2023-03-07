import java.util.Scanner;

public class Main {
    static String encrypt(String string) {
        String result = "";

        for (int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);
            int ascii = character;
            result += (char) (ascii + 1);
        }

        return result;
    }

    static String decrypt(String string) {
        String result = "";

        for (int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);
            int ascii = character;
            result += (char) (ascii - 1);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Settings settings = new Settings();

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        System.out.print("Enter a password: ");
        String password = input.nextLine();

        String key = settings.getSecret_key();

        // Check if password is correct
        if (password.compareTo(key) == 0) {
            String encrypted = encrypt(sentence);
            String decrypted = decrypt(encrypted);

            System.out.printf("Encrypted: %s\n", encrypted);
            System.out.printf("Decrypted: %s\n", decrypted);
        } else {
            System.out.println("Wrong password!");
        }
    }
}

class Settings {
    private String secret_key = "nOpassw!";
    
    // Getter
    public String getSecret_key() {
        return secret_key;
    }
    
    // Setter
    public void setSecret_key(String newSecret_key) {
        this.secret_key = newSecret_key;
    }
}
