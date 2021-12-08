package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.List;

public class PositiveFilterTest {
    @Test
      void PositiveFilter(){
       PositiveFilter filter=new PositiveFilter();
        List<Integer>lista= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer>lista2=Arrays.asList(-1,-2,-3,-4,-5,-6,-7,-8,-9-10);
        for(int i:lista){
            Assertions.assertTrue(filter.accept(i));
        }
        for(int i:lista2){
            Assertions.assertFalse(filter.accept(i));
        }


    }
}
