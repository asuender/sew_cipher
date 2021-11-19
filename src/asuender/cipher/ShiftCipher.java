package asuender.cipher;

/**
 * Diese Klasse verschlüsselt mittels einer Verschiebung der Buchstaben,
 * welche dann daraus ein (verschobenes) Geheimalphabet ergibt.
 * @author Andreas Suender
 * @version 11-19-2021
 */
public class ShiftCipher extends MonoAlphabetCipher {
    /**
     * Erstellt ein neues ShiftCipher Objekt mit einem Geheimalphabet,
     * welches um value Buchstaben verschoben ist.
     * @param value Anzahl der Buchstaben, um welche das Alphabet verschoben werden soll
     */
    public ShiftCipher(int value) {
        this.setShiftValue(value);
    }

    /**
     * Erstellt ein neues Geheimalphabet anhand der angegebenen Verschiebung.
     * @param value Anzahl der Buchstaben, um welche das Alphabet verschoben werden soll
     */
    public void setShiftValue(int value) {
        String alphabet = "abcdefghijklmnopqrstuvwxyzäöüß";
        StringBuilder secretAlphabet = new StringBuilder();
        for (int i=0; i < alphabet.length(); i++) {
            secretAlphabet.append((char) (alphabet.charAt(i) + value));
        }
        super.setSecretAlphabet(secretAlphabet.toString());
    }
}
