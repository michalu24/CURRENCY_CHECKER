package com.api;

import com.api.currencies.Fiats;

import java.lang.reflect.Field;

public class AllCurrenciesReflection {
    public static void main(String[] args) {
        boolean validate = validate("USD");
        if(validate){
            System.out.println("znaleziono walutę");
        }else {
            System.out.println("nie znaleziono waluty");
        }


    }
    public static boolean validate(String currencyCode){
        Class<Fiats> aClass = Fiats.class;
        Field[] declaredFields = aClass.getDeclaredFields();

        for(Field f: declaredFields){
            if(currencyCode.equalsIgnoreCase(f.getName())){
                return true;
            }
        }

        return false;
    }
}
