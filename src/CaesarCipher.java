public class CaesarCipher extends RandomCipher implements Cipher
{
    public CaesarCipher() {}

    @Override
    public String encrypt(String clearText)
    {
        String alphabet;
        String letter;
        String numbers;
        String hold;
        String result;

        alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCabcdefghijklmnopqrstuvwxyzabc0000111122223343454455556666777788889999    ";
        hold = clearText;
        result = "";

        for(int i = 0; i < hold.length(); i++)
        {
            //String character;
            int loc;
            //loc = alphabet.indexOf(hold.charAt(i) + "") + 3;
            loc = alphabet.indexOf(hold.charAt(i) + "");
            loc = loc + 3;
            letter = alphabet.charAt(loc) + "";
            //result = result + alphabet.charAt(loc);
            result = result + letter;
        }
        return result;
    }

    @Override
    public String decrypt(String cipherText)
    {
        String alphabet;
        String numbers;
        int loc;
        String hold;
        String result;

        alphabet = "XYZABCDEFGHIJKLMNOPQRSTUVWXYZxyzabcdefghijklmnopqrstuvwxyz0000111122223333444455556666777788889999 ";
        numbers = "0123456789";

        hold = cipherText;
        result = "";
        loc = 0;

        for(int i = 0; i < cipherText.length(); i++)
        {
            String symbol;
            symbol = hold.charAt(i) + "";
            loc = alphabet.indexOf(symbol);
            if(numbers.indexOf(symbol) >= 0 || symbol.equals(" "))	// if finds a number or space
            {
                loc = loc;
            }
            else
            {
                loc = alphabet.indexOf(hold.charAt(i)) - 3;
            }
            result = result + alphabet.charAt(loc);
        }
        return result;
    }
}
