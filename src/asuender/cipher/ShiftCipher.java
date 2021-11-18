package asuender.cipher;

public class ShiftCipher extends MonoAlphabetCipher {
    public ShiftCipher(int value) {
        this.setShiftValue(value);
    }

    public void setShiftValue(int value) {
        String alphabet = "abcdefghijklmnopqrstuvwxyzäöüß";
        StringBuilder secretAlphabet = new StringBuilder();
        for (int i=0; i < alphabet.length(); i++) {
            secretAlphabet.append((char) (alphabet.charAt(i) + value));
        }
        System.out.println(secretAlphabet);
        super.setSecretAlphabet(secretAlphabet.toString());
    }
}
