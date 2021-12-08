package com.aor.numbers;

public class PositiveFilter implements GenericListFilter {

    public boolean accept(Integer number){
        boolean verificar;
        if(number<0){
            verificar=false;
        }
        else{
            verificar=true;
        }
        return verificar;
    }

}
