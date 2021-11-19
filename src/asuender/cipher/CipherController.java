package asuender.cipher;

import asuender.cipher.view.CipherFrame;
import asuender.cipher.view.CipherPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Controller-Klasse für die GUI.
 * @author Andreas Suender
 * @version 11-19-2021
 */
public class CipherController implements ActionListener {
    public static final int CIPHERSHIFT = 3;
    public static final String GEHEIMALPHABET = "uflpwdrasjmconqybvtexhzkgiäöüß";

    private MonoAlphabetCipher cipher;

    private CipherFrame frame;
    private CipherPanel panel;

    /**
     * Erstellt ein neues Controller-Objekt inklusive GUI.
     */
    public CipherController() {
        this.cipher = new MonoAlphabetCipher();
        this.panel = new CipherPanel(this);
        this.frame = new CipherFrame(this.panel);
    }

    /**
     * Behandelt alle Events, welche von der GUI geworfen werden.
     * @param e Event, welches mitgegeben wird
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();

        switch (actionCommand) {
            case "MonoAlphabeticCipher":
                this.cipher = new MonoAlphabetCipher();
                break;

            case "SubstitutionCipher":
                this.cipher = new SubstitutionCipher(GEHEIMALPHABET);
                break;

            case "ShiftCipher":
                this.cipher = new ShiftCipher(CIPHERSHIFT);
                break;

            case "Verschlüsseln":
                this.panel.zeigeAusgabe(this.cipher.encrypt(this.panel.getEingabeText()));
                break;

            case "Entschlüsseln":
                this.panel.zeigeAusgabe(this.cipher.decrypt(this.panel.getEingabeText()));
                break;
        }
    }

    public static void main(String[] args) {
        new CipherController();
    }
}
