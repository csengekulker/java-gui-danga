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

  Employee[] employeeArray = {
    new Employee(1, "Balogh Csenge", "Érd", 34234, 1),
    new Employee(2, "Lenti Béla", "Szeged", 2341, 3),
    new Employee(3, "Halas Ferenc", "Budapest", 7864, 4),
    new Employee(4, "John Doe", "Szeged", 23223, 3),
    new Employee(5, "Teknős Péter", "Érd", 11111, 2),
    new Employee(6, "Csete Jenő", "Budapest", 3454, 5),
  };

  // convert array to vector
  public Vector<Rank> rankVector = new Vector<>(Arrays.asList(rankArray));
  public Vector<Employee> employeeVector = new Vector<>(Arrays.asList(employeeArray));

}