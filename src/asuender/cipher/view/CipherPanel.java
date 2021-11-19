package asuender.cipher.view;

import asuender.cipher.CipherController;

import javax.swing.*;
import java.awt.*;

/**
 * Panel-Klasse mit allen Elementen der GUI, welche dem Testen der Cipher-Klassen dient.
 * @author Andreas Suender
 * @version 11-19-2021
 */
public class CipherPanel extends JPanel {
    private final static Font font = new Font("Arial", Font.PLAIN, 26);
    JRadioButton rbMac, rbSubst, rbShift;
    private final JTextField textField;
    private final JButton encButton;
    private final JButton decButton;

    /**
     * Erstellt ein neues CipherPanel-Objekt. Die Radiobuttons, welche hierbei verwendet werden,
     * befinden sich in einer eigenen ButtonGroup, welche es ermöglicht, nur einen RB gleichzeitig
     * ausgewählt zu haben.
     * @param controller Controller, dem alle Events mitgegeben werden
     */
    public CipherPanel(CipherController controller) {
        super.setLayout(new BorderLayout());

        this.textField = new JTextField(25);

        JPanel botPanel = new JPanel(), leftPanel = new JPanel(), rightPanel = new JPanel();
        botPanel.setLayout(new BorderLayout());
        leftPanel.setLayout(new GridLayout(3, 1));
        rightPanel.setLayout(new GridLayout(3, 1));

        ButtonGroup radioGroup = new ButtonGroup();
        this.rbMac = new JRadioButton("MonoAlphabeticCipher");
        this.rbMac.setActionCommand("MonoAlphabeticCipher");
        this.rbMac.addActionListener(controller);
        this.rbMac.setSelected(true);
        this.rbSubst = new JRadioButton("SubstitutionCipher");
        this.rbSubst.setActionCommand("SubstitutionCipher");
        this.rbSubst.addActionListener(controller);
        this.rbShift = new JRadioButton("ShiftCipher");
        this.rbShift.setActionCommand("ShiftCipher");
        this.rbShift.addActionListener(controller);
        radioGroup.add(this.rbMac);
        radioGroup.add(this.rbSubst);
        radioGroup.add(this.rbShift);

        leftPanel.add(this.rbMac);
        leftPanel.add(this.rbSubst);
        leftPanel.add(this.rbShift);

        this.encButton = new JButton("Verschlüsseln");
        this.encButton.setActionCommand("Verschlüsseln");
        this.encButton.addActionListener(controller);
        this.decButton = new JButton("Entschlüsseln");
        this.decButton.setActionCommand("Entschlüsseln");
        this.decButton.addActionListener(controller);

        rightPanel.add(this.encButton);
        rightPanel.add(this.decButton);

        botPanel.add(leftPanel, BorderLayout.LINE_START);
        botPanel.add(rightPanel, BorderLayout.LINE_END);

        super.add(this.textField, BorderLayout.PAGE_START);
        super.add(botPanel, BorderLayout.PAGE_END);

        for (
                Component c : new Component[]{
                this.textField,
                this.encButton, this.decButton,
                this.rbMac, this.rbSubst, this.rbShift
        }) {
            c.setFont(font);
        }
    }

    /**
     * Gibt den aktuellen Text des Textfelds oben in der GUI zurück.
     * @return Text des Textfelds oben in der GUI
     */
    public String getEingabeText() {
        return this.textField.getText();
    }

    /**
     * Zeigt das mitgegebene Ergebnis des Ver- oder Entschlüsselns im Textfeld oben an.
     * @param text Ergebnis des Ver- oder Entschlüsselns
     */
    public void zeigeAusgabe(String text) {
        this.textField.setText(text);
    }
}
