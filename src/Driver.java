import java.io.*;

public class Driver
{
    public static void main(String[] args) throws IOException
    {
        // local variables
        String CCEncrypt;
        String CCDecrypt;
        String RCEncrypt;
        String userInput;

        // initialization
        CCEncrypt = "";
        CCDecrypt = "";
        RCEncrypt = "";

        // declare object
        Cipher obj;
        Cipher obj2;
        obj = new CaesarCipher();
        obj2 = new RandomCipher();

        // call method to get user input
        userInput = getUserInput();

        // CaesarCipher
        CCEncrypt = obj.encrypt(userInput);
        CCDecrypt = obj.decrypt(userInput);

        // RandomCipher
        RCEncrypt = obj2.encrypt(userInput);

        // print encrypted/decrypted message
        System.out.println("CaesarCipher: ");
        System.out.println("Encrypted word/phrase: " + CCEncrypt);
        System.out.println("Decryped word/phrase: " + CCDecrypt);
        System.out.println("\nRandomCipher: ");
        System.out.println("Encrypted word/phrase: " + RCEncrypt);
    }

    public static String getUserInput() throws IOException
    {
        String userInput;
        BufferedReader input;

        input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a word/phrase: ");
        userInput = input.readLine();

        return userInput;
    }
}
