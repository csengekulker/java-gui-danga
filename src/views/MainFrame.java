/*
* File: MainFrame.java
* Author: Balogh Csenge
* Copyright: 2022, Balogh Csenge
* Group: Szoft_I_N
* Date: 2022-05-11
* Github: https://github.com/csengekulker/
* Licenc: GNU GPL
*/

package views;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class MainFrame extends JFrame {
  JPanel mainPanel;

  public DefaultComboBoxModel<String> defaultComboBoxModel;
  JComboBox<String> chooseRankComboBox;

  public MainFrame() {


    setFrame();
    setMainPanel();
    setComponents();

  }

  private void setComponents() {
    this.defaultComboBoxModel = new DefaultComboBoxModel<>();
    this.chooseRankComboBox = new JComboBox<>(defaultComboBoxModel);

    this.mainPanel.add(chooseRankComboBox, BorderLayout.NORTH);
    
  }

  private void setMainPanel() {
    this.mainPanel = new JPanel();

    // layout for mainpanel
    this.mainPanel.setLayout(
      new BorderLayout()
    );

    this.add(mainPanel);
  }

  private void setFrame() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(400, 300);
    this.setTitle("Workers");
    this.setVisible(true);

    // layout for window
    this.setLayout(
      new FlowLayout()
    );
  }
}