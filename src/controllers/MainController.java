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

import models.MainModel;
import views.MainFrame;

public class MainController {
  MainFrame mainFrame;
  MainModel mainModel;
  
  public MainController() {
    this.mainFrame = new MainFrame();
    this.mainModel = new MainModel();
  }
}