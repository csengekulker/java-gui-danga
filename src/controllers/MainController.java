/*
* File: MainController.java
* Author: Balogh Csenge
* Copyright: 2022, Balogh Csenge
* Group: Szoft_I_N
* Date: 2022-05-11
* Github: https://github.com/csengekulker/
* Licenc: GNU GPL
*/

package controllers;

import java.util.Vector;
import models.Employee;
import models.MainModel;
import views.MainFrame;

public class MainController {
  MainFrame mainFrame;
  MainModel mainModel;
  
  public MainController() {
    this.mainFrame = new MainFrame();
    this.mainModel = new MainModel();

    controlComboBox();
    setEvents();
  }

  private void controlComboBox () {

    this.mainModel.rankVector.forEach(rank -> {
      this.mainFrame.defaultComboBoxModel.addElement(rank.name);
    });
  }

  private void comboBoxAcion() {
    int index = this.mainFrame.chooseRankComboBox.getSelectedIndex();

    Vector<Employee> employeeVector = this.mainModel.employeeVector;

    //delete content before new selection
    this.mainFrame.defaultListModel.clear();

    employeeVector.forEach(employee -> {
      if (employee.rankId == index) {
        this.mainFrame.defaultListModel.addElement(employee.name);
      }
    });

  }

  private void setEvents() {
    this.mainFrame.chooseRankComboBox.addActionListener(action -> comboBoxAcion());
  }
}