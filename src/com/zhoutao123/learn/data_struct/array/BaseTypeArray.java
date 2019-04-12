package com.zhoutao123.learn.data_struct.array;

/**
 * Base type's array example
 *
 * <p>This is an example of int，and other base type is sample
 */
public class BaseTypeArray {

  public static void main(String[] args) {
    int[] intArray = new int[3];
    // put some data to this array
    for (int i = 0; i < intArray.length; ++i) {
      intArray[i] = i * 9;
    }
    // get data by index from this array container and print it.
    for (int i = 0; i < intArray.length; i++) {
      int element = intArray[i];
      System.out.println(element);
    }
  }
}
