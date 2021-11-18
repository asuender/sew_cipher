package asuender.cipher;

/**
 * Diese Klasse stellt jenes Interface da, welches alle Models implementieren.
 * Sie enthält zwei Klassen zum ver- und entschlüsseln.
 * @author Andreas Suender
 * @version 11-17-2021
 */
public interface Cipher {
    /**
     * Metehode zum Verschlüssen des angegebenen Textes.
     * @param text Text, der verschlüsselt werden soll
     * @return verschlüsselter Text
     */
    String encrypt(String text);

    /**
     * Methode zum Entschlüsseln des angegebenen Textes.
     * @param text Text, der entschlüsselt werden soll
     * @return entschlüsselter, lesbarer Text
     */
    String decrypt(String text);
}
