/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UasPrakPBO.View;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

/**
 *
 * @author acer
 */
public class MenuRegistrasi {
    public MenuRegistrasi(){
        JFrame view = new JFrame();
        view.setSize(510, 600);
        view.setLocationRelativeTo(null);
        view.getContentPane().setLayout(null);
        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setVisible(true);

        JLabel title = new JLabel("REGISTRASI");
        title.setFont(new Font("Serif", Font.PLAIN, 34));
        title.setBounds(50, 50, 200, 40);
        
        JLabel username = new JLabel("User Name:");
        JLabel password = new JLabel("Password:");
        JLabel email = new JLabel("Email:");
        JLabel gender = new JLabel("Gender:");
        JLabel category = new JLabel("User Category:");
        JLabel follower = new JLabel("Followers:");
        
        username.setBounds(50, 100, 100, 35);
        password.setBounds(50, 145, 100, 35);
        email.setBounds(50, 190, 100, 35);
        gender.setBounds(50, 235, 100, 35);
        category.setBounds(50, 280, 100, 35);
        follower.setBounds(50, 325, 100, 35);
        
        JTextField txtUsername = new JTextField();
        JTextField txtPassword = new JTextField();
        JTextField txtEmail = new JTextField();
        JRadioButton pria = new JRadioButton("Pria");
        JRadioButton wanita = new JRadioButton("Wanita");
        ButtonGroup buttonGender = new ButtonGroup();
        buttonGender.add(pria);
        buttonGender.add(wanita);
        JCheckBox privateAccount = new JCheckBox("Private Account");
        JCheckBox creatorAccount = new JCheckBox("Creator Account");
        JCheckBox businessAccount = new JCheckBox("Business Account");
        
        txtUsername.setBounds(155, 100, 100, 35);
        txtPassword.setBounds(155, 145, 100, 35);
        txtEmail.setBounds(155, 190, 100, 35);
        pria.setBounds(155, 235, 45, 35);
        wanita.setBounds(200, 235, 45, 35);
        privateAccount.setBounds(155, 280, 100, 35);
        creatorAccount.setBounds(255, 280, 100, 35);
        businessAccount.setBounds(355, 280, 100, 35);
        
        privateAccount.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(privateAccount.isSelected()){
                    creatorAccount.setEnabled(false);
                    businessAccount.setEnabled(false);
                }
            }
        });
        creatorAccount.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(creatorAccount.isSelected()){
                    privateAccount.setEnabled(false);
                    businessAccount.setEnabled(false);
                }
            }
        });
        businessAccount.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(businessAccount.isSelected()){
                    privateAccount.setEnabled(false);
                    creatorAccount.setEnabled(false);
                }
            }
        });
        
        JButton kembali = new JButton("Kembali");
        kembali.setBounds(50, 325, 100, 35);
        JButton register = new JButton("Register");
        register.setBounds(155, 325, 100, 35);
        
        kembali.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainMenu();
                System.exit(0);
            }
            
        });
        
        view.add(title);
        view.add(username);
        view.add(password);
        view.add(email);
        view.add(gender);
        view.add(category);
        view.add(follower);
        view.add(txtUsername);
        view.add(txtPassword);
        view.add(txtEmail);
        view.add(pria);
        view.add(wanita);
        view.add(privateAccount);
        view.add(creatorAccount);
        view.add(businessAccount);
        view.add(kembali);
        view.add(register);
    }
    public static void main(String[] args) {
        new MenuRegistrasi();
    }
}
