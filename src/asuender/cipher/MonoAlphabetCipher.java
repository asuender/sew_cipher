package asuender.cipher;

/**
 * Diese Klasse ver- und entschlüsselt mithilfe eines einfachen Geheimschlüssels,
 * der im Endeffekt nur aus dem normalen Alphabet (a-z) und wenigen Sonderzeichen besteht.
 * Dabei wird das Prinzip der monoalphabetischen Substitution angewendet.
 * @author Andreas Suender
 * @version 11-17-2021
 */
public class MonoAlphabetCipher implements Cipher {
    private String secretAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZÄÖÜß";

    /**
     * Erstellt ein leeres MonoAlphabetCipher-Objekt.
     */
    public MonoAlphabetCipher() { }

    /**
     * Gibt den Geheimschlüssel zurück.
     * @return Geheimschlüssel
     */
    public String getSecretAlphabet() {
        return secretAlphabet;
    }

    /**
     * Setzt den Geheimschlüssel auf den angegebenen String. Kann von außen nicht aufgerufen werden,
     * jedoch haben alle Subklassen Zugriff darauf.
     * @param secretAlphabet neuer Geheimschlüssel
     */
    protected void setSecretAlphabet(String secretAlphabet) {
        this.secretAlphabet = secretAlphabet;
    }

    /**
     * Metehode zum Verschlüssen des angegebenen Textes.
     * @param text Text, der verschlüsselt werden soll
     * @return verschlüsselter Text
     */
    @Override
    public String encrypt(String text) {
        String alphabet = "abcdefghijklmnopqrstuvwxyzäöüß";
        StringBuilder result = new StringBuilder();

        for (char c : text.toLowerCase().toCharArray()) {
            int index = alphabet.indexOf(String.valueOf(c));
            if (index >= 0) {
                result.append(Character.toUpperCase(this.secretAlphabet.charAt(index)));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

    /**
     * Methode zum Entschlüsseln des angegebenen Textes.
     * @param text Text, der entschlüsselt werden soll
     * @return entschlüsselter, lesbarer Text
     */
    @Override
    public String decrypt(String text) {
        String alphabet = "abcdefghijklmnopqrstuvwxyzäöüß";
        StringBuilder result = new StringBuilder();

        for (char c : text.toLowerCase().toCharArray()) {
            int index = this.secretAlphabet.indexOf(String.valueOf(c));
            if (index >= 0) {
                result.append(alphabet.charAt(index));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
