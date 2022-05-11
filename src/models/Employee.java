package models;

public class Employee {
  int id;
  public String name;
  String city;
  int salary;
  public int rankId;

  public Employee(int id, String name, String city, int salary, int rankId) {
    this.id = id;
    this.name = name;
    this.city = city;
    this.salary = salary;
    this.rankId = rankId;
  }
}
