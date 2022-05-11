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
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

public class MainFrame extends JFrame {
  JPanel mainPanel;

  public DefaultComboBoxModel<String> defaultComboBoxModel;
  public JComboBox<String> chooseRankComboBox;


  public DefaultListModel<String> defaultListModel;
  public JList<String> employeeList;
  JScrollPane listScrollPane;

  public MainFrame() {

    setFrame();
    setMainPanel();
    setComponents();
  }

  private void setComponents() {
    this.defaultComboBoxModel = new DefaultComboBoxModel<>();
    this.chooseRankComboBox = new JComboBox<>(defaultComboBoxModel);

    this.chooseRankComboBox.addItem("Select rank...");

    this.defaultListModel = new DefaultListModel<>();
    this.employeeList = new JList<>(defaultListModel);
    this.listScrollPane = new JScrollPane(employeeList);
    this.listScrollPane.setPreferredSize(
      new Dimension(200, 200)
    );

    this.mainPanel.add(chooseRankComboBox, BorderLayout.NORTH);
    this.mainPanel.add(listScrollPane, BorderLayout.CENTER);
    
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