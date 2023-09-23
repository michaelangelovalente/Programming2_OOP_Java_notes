package library.ui;

import java.util.Scanner;

public class UserInterface {
  private Scanner scanner;

  public UserInterface(Scanner scanner){
    this.scanner = scanner;
  }

  public void start(){
    printTitle();
    // other functionality
  }

  //visible only inside the same package. --> classes in the package 'library.ui' can use printTitle()
  /*private */void printTitle(){
    System.out.println("***********");
    System.out.println("* LIBRARY *");
    System.out.println("***********");
  }
  
  
} 
