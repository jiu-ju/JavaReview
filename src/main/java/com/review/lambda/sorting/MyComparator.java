package com.review.lambda.sorting;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2){

        return (o1>o2)?-1 : (o1<o2)?1 : 0;
    }

    /*
    @Override
    public int compare(Integer o1, Integer o2){
    if(o1 > o2){
        return -1; // obj1 comes before obj2
    }else if(o1 < o2){
        return 1; // obj1 comes after obj2
    }else{
        return 0; // obj1 and obj2 are equal
    }
  }

     */
}
