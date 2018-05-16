package com.google.cloud.bigquery;

public class Project {

  String id;

  public Project(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "Project{" +
        "id='" + id + '\'' +
        '}';
  }
}
