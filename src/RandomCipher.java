public class RandomCipher implements Cipher
{
    public RandomCipher() {};

    public String encrypt(String userInput)
    {
        String result = "";
        String hold;
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int loc;
        int loc2;

        for(int i = 0; i < userInput.length(); i++)
        {
            loc = (int) (Math.random() * 26);
            hold = alphabet.charAt(loc) + "";

            result = result + hold;
        }
        return result;
    }

    @Override
    public String decrypt(String cipherText)
    {
        // TODO Auto-generated method stub
        return null;
    }
}
