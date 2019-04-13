package com.zhoutao123.learn.data_struct.array;

/** Array's Advance knowledge */
public class ArrayAdvanceKnowledge {

  public static void main(String[] args) {
    int[] intArray = {1, 2, 3};
    // base type's array is object,and not's base type data.
    Class<? extends int[]> aClass = intArray.getClass();
    System.out.println(aClass.getName());
    // TODO: your can test other base type's array in here, for example char , float etc, then see result
  }
}
