/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package executable;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import server.Server;
import user.User;
import util.Validator;

/**
 *
 * @author David
 */
public class WatchEye extends JFrame {
    
    /**
     * Creates new form Fakebook
     */
    public WatchEye() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        homeScreen = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        btLogoff = new javax.swing.JButton();
        btGroups = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btBuddies = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        profileIcon = new javax.swing.JLabel();
        btProfile = new javax.swing.JButton();
        loginScreen = new javax.swing.JPanel();
        welcomeLogo = new javax.swing.JLabel();
        loginPanel = new javax.swing.JPanel();
        loginMailLabel = new javax.swing.JLabel();
        loginMailField = new javax.swing.JTextField();
        loginPasslLabel = new javax.swing.JLabel();
        loginPasswordField = new javax.swing.JPasswordField();
        btEnter = new javax.swing.JButton();
        btResetPassword = new javax.swing.JButton();
        btLoginRegister = new javax.swing.JButton();
        loginHeader = new javax.swing.JLabel();
        loginFootnote = new javax.swing.JLabel();
        registerPanel = new javax.swing.JPanel();
        regNameLabel = new javax.swing.JLabel();
        regNameField = new javax.swing.JTextField();
        regMailLabel = new javax.swing.JLabel();
        regMailField = new javax.swing.JTextField();
        regPassLabel = new javax.swing.JLabel();
        regPasswordField = new javax.swing.JPasswordField();
        regGenderLabel = new javax.swing.JLabel();
        regGenderBox = new javax.swing.JComboBox<>();
        regDobLabel = new javax.swing.JLabel();
        ddBox = new javax.swing.JComboBox<>();
        mmBox = new javax.swing.JComboBox<>();
        yyyyBox = new javax.swing.JComboBox<>();
        tosCheckBox = new javax.swing.JCheckBox();
        btRegister = new javax.swing.JButton();
        regHeader = new javax.swing.JLabel();
        regFootnote = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Fakebook");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        homeScreen.setVisible(false);
        homeScreen.setEnabled(true);
        homeScreen.setBackground(new java.awt.Color(153, 153, 153));

        headerPanel.setBackground(new java.awt.Color(0, 153, 51));

        btLogoff.setText("Sair");
        btLogoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogoffActionPerformed(evt);
            }
        });

        btGroups.setText("Grupos");

        jLabel2.setText("gpIcon");

        btBuddies.setText("Amigos");

        jLabel3.setText("bdIcon");

        btProfile.setText("btPerfil");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(profileIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 479, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btBuddies, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btGroups, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btLogoff)
                .addContainerGap())
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btGroups, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuddies, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profileIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLogoff, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        profileIcon.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/default_profile.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));

        javax.swing.GroupLayout homeScreenLayout = new javax.swing.GroupLayout(homeScreen);
        homeScreen.setLayout(homeScreenLayout);
        homeScreenLayout.setHorizontalGroup(
            homeScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        homeScreenLayout.setVerticalGroup(
            homeScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeScreenLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 637, Short.MAX_VALUE))
        );

        registerPanel.setVisible(false);
        registerPanel.setEnabled(false);
        loginScreen.setLayout(null);

        welcomeLogo.setBackground(new java.awt.Color(204, 204, 0));
        welcomeLogo.setText("logo");
        welcomeLogo.setOpaque(true);
        loginScreen.add(welcomeLogo);
        welcomeLogo.setBounds(0, 0, 1280, 220);

        loginPanel.setBackground(new java.awt.Color(0, 153, 153));

        loginMailLabel.setText("E-mail");

        loginMailField.setToolTipText("Seu e-mail cadastrado");

        loginPasslLabel.setText("Senha");

        loginPasswordField.setToolTipText("Sua senha cadastrada");

        btEnter.setText("Entrar");
        btEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnterActionPerformed(evt);
            }
        });

        btResetPassword.setText("Esqueci minha senha");

        btLoginRegister.setText("Registrar-se");
        btLoginRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginRegisterActionPerformed(evt);
            }
        });

        loginHeader.setText("cabe�alho");

        loginFootnote.setText("rodap�");

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap(286, Short.MAX_VALUE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addComponent(loginPasslLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(loginPasswordField))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addComponent(loginMailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(loginMailField, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btEnter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btResetPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btLoginRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(319, 319, 319))
            .addComponent(loginFootnote, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addComponent(loginHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loginMailField, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(loginMailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginPasslLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(loginPasswordField))
                .addGap(18, 18, 18)
                .addComponent(btEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btResetPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btLoginRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginFootnote, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        loginScreen.add(loginPanel);
        loginPanel.setBounds(0, 218, 1280, 500);

        registerPanel.setBackground(new java.awt.Color(0, 153, 153));

        regNameLabel.setLabelFor(regNameField);
        regNameLabel.setText("Nome");

        regNameField.setToolTipText("Seu Nome");

        regMailLabel.setText("E-mail");

        regMailField.setToolTipText("Seu Email");

        regPassLabel.setText("Senha");

        regPasswordField.setToolTipText("Sua senha, ela deve conter no m�nimo 6 caracteres.");

        regGenderLabel.setText("G�nero");
        regGenderLabel.setToolTipText("");

        regGenderBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "N�o sei" }));

        regDobLabel.setText("Data de Nascimento");

        ddBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        ddBox.setToolTipText("");

        mmBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        yyyyBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905", "1904", "1903", "1902", "1901", "1900" }));

        tosCheckBox.setText("Li e concordo com os Termos de Uso e Pol�tica de Privacidade. ");

        btRegister.setText("Registrar-se");
        btRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegisterActionPerformed(evt);
            }
        });

        regHeader.setText("cabe�alho");

        regFootnote.setText("rodap�");

        javax.swing.GroupLayout registerPanelLayout = new javax.swing.GroupLayout(registerPanel);
        registerPanel.setLayout(registerPanelLayout);
        registerPanelLayout.setHorizontalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGap(655, 655, 655)
                        .addComponent(regGenderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(regGenderBox, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(registerPanelLayout.createSequentialGroup()
                                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(regPassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(regMailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(regNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(regNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(regMailField, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                                        .addComponent(regPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)))
                                .addGap(30, 30, 30)
                                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(registerPanelLayout.createSequentialGroup()
                                        .addComponent(regDobLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ddBox, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(mmBox, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(yyyyBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(tosCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(96, 96, 96))
            .addComponent(regHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(regFootnote, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        registerPanelLayout.setVerticalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addComponent(regHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regGenderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regGenderBox, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ddBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(regMailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(regMailField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(regDobLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mmBox, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(yyyyBox, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(regPassLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(regPasswordField)
                    .addComponent(tosCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regFootnote, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
        );

        loginScreen.add(registerPanel);
        registerPanel.setBounds(0, 218, 1280, 502);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(homeScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(homeScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLoginRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginRegisterActionPerformed
        loginPanel.setVisible(false);
        loginPanel.setEnabled(false);
        if(!loginMailField.getText().trim().equals("")){
            regMailField.setText(loginMailField.getText());
        }
        registerPanel.setVisible(true);
        registerPanel.setEnabled(true);
    }//GEN-LAST:event_btLoginRegisterActionPerformed

    private void btRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegisterActionPerformed
        if(regNameField.getText().trim().equals("")){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(loginScreen, "O nome est� vazio!", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else if(!Validator.validateName(regNameField.getText())){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(loginScreen, "O nome n�o � v�lido", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else if(regMailField.getText().trim().equals("")){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(loginScreen, "O e-mail est� vazio!", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else if(!Validator.validateEmail(regMailField.getText())){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(loginScreen, "O e-mail n�o � v�lido!", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else if(Server.getInstance().emailInUse(regMailField.getText())){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(loginScreen, "O e-mail j� est� em uso!", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else if(regPasswordField.getPassword().length < 6){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(loginScreen, "A senha deve conter pelo menos 6 caracteres!", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else if(!tosCheckBox.isSelected()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(loginScreen, "Voc� deve concordar com os Termos de Servi�o e Pol�tica de Privacidade para Criar um Conta!", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else if(!Validator.validateDate(ddBox.getSelectedItem() +"-"+ mmBox.getSelectedItem() +"-" + yyyyBox.getSelectedItem())){
             Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(loginScreen, "A data de nascimento n�o � v�lida!", "Aviso", JOptionPane.WARNING_MESSAGE);  
        } else {
            Server.getInstance().login(new User(regNameField.getText(), regMailField.getText(), new String(regPasswordField.getPassword()), regGenderBox.getSelectedIndex(), ddBox.getSelectedItem() +"-"+ mmBox.getSelectedItem() +"-" + yyyyBox.getSelectedItem()));
            Server.getInstance().addUser(Server.getInstance().getCurrentUser());
            Server.getInstance().login(Server.getInstance().getCurrentUser());
        }
    }//GEN-LAST:event_btRegisterActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Toolkit.getDefaultToolkit().beep();
        int confirm = JOptionPane.showConfirmDialog(loginScreen.isVisible()? loginScreen : homeScreen, "Voc� deseja mesmo Sair?", "Aviso", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (confirm == 0) {
            Server.getInstance().shutdown();
            dispose();
        }
    }//GEN-LAST:event_formWindowClosing

    private void btEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnterActionPerformed
        Server.getInstance().enter(loginMailField.getText(), new String(loginPasswordField.getPassword()));
    }//GEN-LAST:event_btEnterActionPerformed

    private void btLogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogoffActionPerformed
        Toolkit.getDefaultToolkit().beep();
        int confirm = JOptionPane.showConfirmDialog(homeScreen, "Voc� deseja mesmo Sair?", "Aviso", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (confirm == 0) {
            loginScreen.setVisible(true);
            loginScreen.setEnabled(true);
            if(homeScreen.isVisible()){
                homeScreen.setVisible(false);
                homeScreen.setEnabled(false);
                if(!loginPanel.isVisible()){
                    loginPanel.setVisible(true);
                    loginPanel.setEnabled(true);
                }
            }
        }
    }//GEN-LAST:event_btLogoffActionPerformed

    public void welcome(User user){
        btProfile.setText(user.getName());
        homeScreen.setVisible(true);
        homeScreen.setEnabled(true);
        if(loginScreen.isVisible()){
            loginScreen.setVisible(false);
            loginScreen.setEnabled(false);
            if(registerPanel.isVisible()){
                registerPanel.setVisible(false);
                registerPanel.setEnabled(false);
            }
            loginPanel.setVisible(false);
            loginPanel.setEnabled(false);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WatchEye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WatchEye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WatchEye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WatchEye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            WatchEye client = new WatchEye();
            Server.getInstance().setClient(client);
            client.setVisible(true);
        });
    }

    public JPanel getLoginScreen(){
        return loginScreen;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuddies;
    private javax.swing.JButton btEnter;
    private javax.swing.JButton btGroups;
    private javax.swing.JButton btLoginRegister;
    private javax.swing.JButton btLogoff;
    private javax.swing.JButton btProfile;
    private javax.swing.JButton btRegister;
    private javax.swing.JButton btResetPassword;
    private javax.swing.JComboBox<String> ddBox;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JPanel homeScreen;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel loginFootnote;
    private javax.swing.JLabel loginHeader;
    private javax.swing.JTextField loginMailField;
    private javax.swing.JLabel loginMailLabel;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel loginPasslLabel;
    private javax.swing.JPasswordField loginPasswordField;
    private javax.swing.JPanel loginScreen;
    private javax.swing.JComboBox<String> mmBox;
    private javax.swing.JLabel profileIcon;
    private javax.swing.JLabel regDobLabel;
    private javax.swing.JLabel regFootnote;
    private javax.swing.JComboBox<String> regGenderBox;
    private javax.swing.JLabel regGenderLabel;
    private javax.swing.JLabel regHeader;
    private javax.swing.JTextField regMailField;
    private javax.swing.JLabel regMailLabel;
    private javax.swing.JTextField regNameField;
    private javax.swing.JLabel regNameLabel;
    private javax.swing.JLabel regPassLabel;
    private javax.swing.JPasswordField regPasswordField;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JCheckBox tosCheckBox;
    private javax.swing.JLabel welcomeLogo;
    private javax.swing.JComboBox<String> yyyyBox;
    // End of variables declaration//GEN-END:variables
}
