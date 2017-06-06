package com.greenfox.spring.Model;

/**
 * Created by georgezsiga on 6/6/17.
 */
public class ProjectList {

  Iterable<Project> projectList;

  public ProjectList() {
  }

  public ProjectList(Iterable<Project> projectList) {
    this.projectList = projectList;
  }

  public Iterable<Project> getProjectList() {
    return projectList;
  }

  public void setProjectList(Iterable<Project> projectList) {
    this.projectList = projectList;
  }
}
