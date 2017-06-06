package com.greenfox.spring.Model;

import java.util.ArrayList;


/**
 * Created by georgezsiga on 6/6/17.
 */
public class ProjectList {

  ArrayList<Project> projectList;

  public ProjectList() {
    this.projectList = new ArrayList<Project>();
  }

  public ProjectList(ArrayList<Project> projectList) {
    this.projectList = projectList;
  }

  public ArrayList<Project> getProjectList() {
    return projectList;
  }

  public void setProjectList(ArrayList<Project> projectList) {
    this.projectList = projectList;
  }
}
