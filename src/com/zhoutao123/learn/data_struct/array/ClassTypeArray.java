package com.zhoutao123.learn.data_struct.array;

import java.util.concurrent.Executors;

/** Class type's array Example */
public class ClassTypeArray {

  public static void main(String[] args) {
    ExampleClass[] classArray = new ExampleClass[3];
    // put an instance object of ExampleClass to array container
    classArray[0] = new ExampleClass("example-0");
    classArray[1] = new ExampleClass("example-1");
    classArray[2] = new ExampleClass("example-2");

    // get data form array by an integer index and print it's value attribute.
    System.out.println(classArray[1].getValue());
    System.out.println(classArray[2].getValue());
    System.out.println(classArray[3].getValue());
  }

  /** Create class 'ExampleClass',and it is used array. */
  static class ExampleClass {
    private String value;

    public ExampleClass(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }
  }
}
