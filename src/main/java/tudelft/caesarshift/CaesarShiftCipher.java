package tudelft.caesarshift;

public class CaesarShiftCipher {

    public String CaesarShiftCipher(String message, int shift){
        StringBuilder sb = new StringBuilder();
        char currentChar;
        int length = message.length();

        shift = shift%26;

        for(int i = 0; i < length; i++) {
            currentChar = message.charAt(i);

            //sb.append(currentChar);
            if (currentChar != ' ' && (currentChar > 'z' || currentChar < 'a')) {
                return "invalid";
            } else if (currentChar == ' ') {
                // do nothing
            } else if ((char) (currentChar + shift) > 'z') {
                currentChar = (char) (currentChar - 26);
            } else if ((char) (currentChar + shift) < 'a'){
                currentChar = (char) (currentChar + 26);
            }
            if (currentChar == ' ') {
                sb.append(currentChar);
            } else {
                sb.append((char) (currentChar + shift));
            }
        }

        return sb.toString();
    }
}
