/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UasPrakPBO.View;

import UasPrakPBO.Controller.UserController;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 *
 * @author acer
 */
public class MenuLogin {
    private JButton kembali, login;
    public MenuLogin() throws MalformedURLException, IOException{
        JFrame view = new JFrame();
        view.setSize(510, 600);
        view.setLocationRelativeTo(null);
        view.getContentPane().setLayout(null);
        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        BufferedImage logo = ImageIO.read(new URL("https://cdn-brilio-net.akamaized.net/community/community-news/2019/10/31/9982a59466a17f3b5609ca8f45303dc1/29-image_1572360452_5db851045dea0.jpg"));
        JLabel gambar = new JLabel(new ImageIcon(logo));
        gambar.setSize(80, 80);
        gambar.setBounds(50, 50, 80, 80);
        
        JLabel title = new JLabel("Login PT Sepi");
        title.setFont(new Font("Serif", Font.PLAIN, 34));
        title.setBounds(150, 70, 200, 40);
        
        JLabel username = new JLabel("Username : ");
        username.setBounds(50, 150, 100, 40);
        JTextField txtUsername = new JTextField();
        txtUsername.setBounds(190, 150, 120, 40);
        
        JLabel password = new JLabel("Password:");
        password.setBounds(50, 230, 100, 40);
        JTextField txtPassword = new JTextField();
        txtPassword.setBounds(190, 230, 120, 40);
        
        kembali = new JButton("Kembali");
        kembali.setEnabled(true);
        kembali.setBounds(50, 300, 100, 40);
        
        login = new JButton("Login");
        login.setBounds(190, 300, 120, 40);
        login.setEnabled(true);
        
//        kembali.getActionListeners(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                new MainMenu();
//            }
//        });

//        login.getActionListeners(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                UserController uc = new UserController();
//                uc.mencariUser(txtUsername.getText(), txtPassword.getText());
//                System.exit(0);
//            }
//        });
        
        view.add(gambar);
        view.add(title);
        view.add(username);
        view.add(txtUsername);
        view.add(password);
        view.add(txtPassword);
        view.add(kembali);
        view.add(login);
        view.setVisible(true);
    }
    public static void main(String[] args) throws IOException {
        new MenuLogin();
    }
}
