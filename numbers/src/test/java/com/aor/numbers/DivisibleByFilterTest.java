package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class DivisibleByFilterTest {
    @Test
    void Divisible2(){
        DivisibleByFilter filter=new DivisibleByFilter(2);
        List<Integer>lista= Arrays.asList(2,4,6,8,10,12,14,16,18,20);
        List<Integer>lista2=Arrays.asList(1,3,5,7,9,11,13,15,17,19);
        for(int i:lista){
            Assertions.assertTrue(filter.accept(i));
        }
        for(int i:lista2){
            Assertions.assertFalse(filter.accept(i));
        }
    }
    @Test
    void Divisible3(){
        DivisibleByFilter filter = new DivisibleByFilter(3);
        List<Integer> lista = Arrays.asList(0, 3, 6, 9,12,15);
        List<Integer> lista2= Arrays.asList(1, 2, 4, 5, 7,8);

        for (int n : lista)
            Assertions.assertTrue(filter.accept(n));

        for (int n :lista2)
            Assertions.assertFalse(filter.accept(n));

    }

}
