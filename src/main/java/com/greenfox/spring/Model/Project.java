package com.greenfox.spring.Model;

/**
 * Created by georgezsiga on 6/6/17.
 */
public class Project {

  int id;
  String nameOfProject;

  public Project() {
  }

  public Project(String nameOfProject) {
    this.nameOfProject = nameOfProject;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNameOfProject() {
    return nameOfProject;
  }

  public void setNameOfProject(String nameOfProject) {
    this.nameOfProject = nameOfProject;
  }
}
