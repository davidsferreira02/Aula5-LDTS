package com.aor.numbers;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListFilterer {
    private GenericListFilter filter;
    public ListFilterer(GenericListFilter filter){
        this.filter=filter;
    }
    public List<Integer>filter(List<Integer> list){
        List<Integer>lista=new ArrayList<>();
        for(int i :list) {
            if (filter.accept(i)) {
                lista.add(i);
            }
        }
            return lista;
    }
}
