package com.bmg;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class App {

    private JFrame frmBarcodeMaster;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextField textField_8;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    App window = new App();
                    window.frmBarcodeMaster.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public App() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmBarcodeMaster = new JFrame();
        frmBarcodeMaster.setTitle("\u0E42\u0E1B\u0E23\u0E41\u0E01\u0E23\u0E21\u0E2A\u0E23\u0E49\u0E32\u0E07 Barcode Master");
        frmBarcodeMaster.setBounds(100, 100, 716, 566);
        frmBarcodeMaster.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frmBarcodeMaster.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                if (JOptionPane.showConfirmDialog(frmBarcodeMaster, "Are you sure to close this window?", "Really Closing?",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });
        frmBarcodeMaster.getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, null, null, null));
        panel.setBounds(10, 11, 680, 484);
        frmBarcodeMaster.getContentPane().add(panel);
        panel.setLayout(null);

        JLabel lblPartNumber = new JLabel("Part Number :");
        lblPartNumber.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblPartNumber.setBounds(150, 11, 115, 31);
        panel.add(lblPartNumber);

        textField = new JTextField();
        textField.setBounds(262, 11, 230, 31);
        panel.add(textField);
        textField.setColumns(10);

        JLabel lblMaterial = new JLabel("Material 1 :");
        lblMaterial.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblMaterial.setBounds(105, 81, 86, 27);
        panel.add(lblMaterial);

        textField_1 = new JTextField();
        textField_1.setBounds(192, 81, 345, 27);
        panel.add(textField_1);
        textField_1.setColumns(10);

        JLabel lblMaterial_1 = new JLabel("Material 2 :");
        lblMaterial_1.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblMaterial_1.setBounds(105, 119, 86, 27);
        panel.add(lblMaterial_1);

        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(192, 119, 345, 27);
        panel.add(textField_2);

        JLabel lblMaterial_2 = new JLabel("Material 3 :");
        lblMaterial_2.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblMaterial_2.setBounds(105, 158, 86, 27);
        panel.add(lblMaterial_2);

        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBounds(192, 158, 345, 27);
        panel.add(textField_3);

        JLabel lblMaterial_3 = new JLabel("Material 4 :");
        lblMaterial_3.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblMaterial_3.setBounds(105, 196, 86, 27);
        panel.add(lblMaterial_3);

        textField_4 = new JTextField();
        textField_4.setColumns(10);
        textField_4.setBounds(192, 196, 345, 27);
        panel.add(textField_4);

        JLabel lblMaterial_4 = new JLabel("Material 5 :");
        lblMaterial_4.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblMaterial_4.setBounds(105, 234, 86, 27);
        panel.add(lblMaterial_4);

        textField_5 = new JTextField();
        textField_5.setColumns(10);
        textField_5.setBounds(192, 234, 345, 27);
        panel.add(textField_5);

        JLabel lblMaterial_5 = new JLabel("Material 6 :");
        lblMaterial_5.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblMaterial_5.setBounds(105, 272, 86, 27);
        panel.add(lblMaterial_5);

        textField_6 = new JTextField();
        textField_6.setColumns(10);
        textField_6.setBounds(192, 272, 345, 27);
        panel.add(textField_6);

        JLabel lblMaterial_6 = new JLabel("Material 7 :");
        lblMaterial_6.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblMaterial_6.setBounds(105, 310, 86, 27);
        panel.add(lblMaterial_6);

        textField_7 = new JTextField();
        textField_7.setColumns(10);
        textField_7.setBounds(192, 310, 345, 27);
        panel.add(textField_7);

        JLabel lblMaterial_7 = new JLabel("Material 8 :");
        lblMaterial_7.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblMaterial_7.setBounds(105, 348, 86, 27);
        panel.add(lblMaterial_7);

        textField_8 = new JTextField();
        textField_8.setColumns(10);
        textField_8.setBounds(192, 348, 345, 27);
        panel.add(textField_8);

        JButton btnPrintBarcode = new JButton("Print Barcode");
        btnPrintBarcode.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String partNumber = textField.getText();
                String material1 = textField_1.getText();
                String material2 = textField_2.getText();
                String material3 = textField_3.getText();
                String material4 = textField_4.getText();
                String material5 = textField_5.getText();
                String material6 = textField_6.getText();
                String material7 = textField_7.getText();
                String material8 = textField_8.getText();
                System.out.println("-= Part Number : " + partNumber);
                System.out.println("-= Material 1 : " + material1);
                System.out.println("-= Material 2 : " + material2);
                System.out.println("-= Material 3 : " + material3);
                System.out.println("-= Material 4 : " + material4);
                System.out.println("-= Material 5 : " + material5);
                System.out.println("-= Material 6 : " + material6);
                System.out.println("-= Material 7 : " + material7);
                System.out.println("-= Material 8 : " + material8);
                System.out.println("-= ============================== =- ");
            }
        });
        btnPrintBarcode.setBounds(192, 405, 115, 31);
        panel.add(btnPrintBarcode);

        JButton btnNewButton = new JButton("Clear");
        btnNewButton.setBackground(Color.ORANGE);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                textField.setText("");
                textField_1.setText("");
                textField_2.setText("");
                textField_3.setText("");
                textField_4.setText("");
                textField_5.setText("");
                textField_6.setText("");
                textField_7.setText("");
                textField_8.setText("");
            }
        });
        btnNewButton.setBounds(425, 405, 112, 31);
        panel.add(btnNewButton);

        JMenuBar menuBar = new JMenuBar();
        frmBarcodeMaster.setJMenuBar(menuBar);

        JMenu mnFile = new JMenu("File");
        menuBar.add(mnFile);

        JMenuItem mntmClose = new JMenuItem("close");
        mntmClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (JOptionPane.showConfirmDialog(frmBarcodeMaster, "Are you sure to close this window?", "Really Closing?",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });
        mnFile.add(mntmClose);
    }
}
