package asuender.cipher.view;

import javax.swing.*;

/**
 * Frame-Klasse für die GUI, welche dem Testen der Cipher-Klassen dient.
 * @author Andreas Suender
 * @version 11-19-2021
 */
public class CipherFrame extends JFrame {
    /**
     * Erstellt ein neues CipherFrame mit dem Titel "Ü 5b.1: Verschlüsselung".
     * @param panel CipherPanel, welches in dieser Frame angezeigt werden soll
     */
    public CipherFrame(CipherPanel panel) {
        super("Ü 5b.1: Verschlüsselung");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.add(panel);
        super.setVisible(true);
        super.pack();
    }
}
