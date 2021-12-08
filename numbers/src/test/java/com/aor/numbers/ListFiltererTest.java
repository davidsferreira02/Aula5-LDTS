package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class ListFiltererTest{
    @Test
    void filter(){
        GenericListFilter filter= Mockito.mock(GenericListFilter.class);
        Mockito.when(filter.accept(1)).thenReturn(true);
        Mockito.when(filter.accept(2)).thenReturn(true);
        Mockito.when(filter.accept(3)).thenReturn(false);
        Mockito.when(filter.accept(4)).thenReturn(true);
        Mockito.when(filter.accept(5)).thenReturn(false);
        Mockito.when(filter.accept(6)).thenReturn(true);
        ListFilterer filtro=new ListFilterer(filter);
        List<Integer> lista=Arrays.asList(1,2,4,6);
        Assertions.assertEquals(lista,filtro.filter(Arrays.asList(1,2,3,4,5,6,7,8,9,10)));

    }

    }

