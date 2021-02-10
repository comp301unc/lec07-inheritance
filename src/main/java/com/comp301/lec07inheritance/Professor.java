package com.comp301.lec07inheritance;

class Professor extends Person {
  private int status;

  public Professor(String name) {
    super(name);
    status = 0;
  }

  public void promote() {
    if (status == 2) {
      throw new RuntimeException("Can't promote");
    }
    status++; // Adds 1 to the value of status
  }

  public String getStatus() {
    if (status == 0) {
      return "Assistant";
    } else if (status == 1) {
      return "Associate";
    } else {
      return "Full";
    }
  }

  // Override method
  @Override
  public String getName() {
    return "Professor " + super.getName();
  }

  // Overload method
  public void promote(int status) {
    if (status < 0 || status > 2) {
      throw new IllegalArgumentException("Invalid status");
    }
    this.status = status;
  }

  // Overload constructor
  public Professor(String name, int status) {
    super(name);
    this.status = status;
  }

  // Chain to another constructor
  public Professor() {
    this("Aaron");
  }
}
