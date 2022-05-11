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
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class MainFrame extends JFrame {
  JPanel mainPanel;

  public MainFrame() {

    setComponents();
    setMainPanel();
    setFrame();
  }

  private void setComponents() {

  }

  private void setMainPanel() {
    this.mainPanel = new JPanel();

    // layout for mainpanel
    this.mainPanel.setLayout(
      new BorderLayout()
    );
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