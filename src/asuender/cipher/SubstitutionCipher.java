package asuender.cipher;

/**
 * Diese Klasse verschlüsselt anhand eines personalisierten Geheimalphabets.
 * @author Andreas Suender
 * @version 11-19-2021
 */
public class SubstitutionCipher extends MonoAlphabetCipher {
    /**
     * Erstellt ein neues SubstitutionCipher-Objekt mit dem angegebenen Geheimalphabet.
     * @param secretAlphabet Geheimalphabet
     */
    public SubstitutionCipher(String secretAlphabet) {
        super.setSecretAlphabet(secretAlphabet);
    }
}
