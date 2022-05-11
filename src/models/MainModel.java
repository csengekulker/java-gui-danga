/*
* File: MainModel.java
* Author: Balogh Csenge
* Copyright: 2022, Balogh Csenge
* Group: Szoft_I_N
* Date: 2022-05-11
* Github: https://github.com/csengekulker/
* Licenc: GNU GPL
*/

package models;

import java.util.Arrays;
import java.util.Vector;

public class MainModel {
  Rank[] rankArray = {
    new Rank(1, "Director"),
    new Rank(2, "Manager"),
    new Rank(3, "Developer"),
    new Rank(4, "Security"),
    new Rank(5, "Janitor")
  };

  // convert array to vector

  public Vector<Rank> rankVector = new Vector<>(Arrays.asList(rankArray));

}