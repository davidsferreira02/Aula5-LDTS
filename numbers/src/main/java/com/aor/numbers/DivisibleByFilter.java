package com.aor.numbers;

public class DivisibleByFilter implements GenericListFilter {
    private Integer divisor;
    public DivisibleByFilter(Integer divisor){
        this.divisor=divisor;
    }

    @Override
    public boolean accept(Integer number) {
        return number % divisor == 0;
    }
}
