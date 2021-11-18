package asuender.cipher;

public class SubstitutionCipher extends MonoAlphabetCipher{
    public SubstitutionCipher(String secretAlphabet) {
        super.setSecretAlphabet(secretAlphabet);
    }

    @Override
    public String encrypt(String text) {
        return super.encrypt(text);
    }

    @Override
    public String decrypt(String text) {
        return super.decrypt(text);
    }
}
