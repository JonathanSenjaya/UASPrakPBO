/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UasPrakPBO.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author acer
 */
public class MainMenu {

    public MainMenu() {
        JFrame view = new JFrame();
        view.setSize(510, 600);
        view.setLocationRelativeTo(null);
        view.getContentPane().setLayout(null);
        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton login = new JButton("LOGIN");
        login.setBounds(100, 200, 300, 80);
        JButton registrasi = new JButton("REGISTRASI");
        registrasi.setBounds(100, 330, 300, 80);
        JButton lihatData = new JButton("LIHAT DATA USER");
        lihatData.setBounds(100, 460, 300, 80);
        
        login.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new MenuLogin();
                    view.setVisible(false);
                } catch (IOException ex) {
                    Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        registrasi.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                new MenuRegistrasi();
            }
            
        });

        view.add(login);
        view.add(registrasi);
        view.add(lihatData);

        view.setVisible(true);

    }

//    public static void main(String[] args) {
//        new MainMenu();
//    }
}
