package org.example;

import variables.VariblesExample;

public class Main {
    public static void main(String[] args) {
        VariblesExample vars_test = new VariblesExample();
        System.out.println("name is "+ vars_test.getName());
        vars_test.setName("Vaid");
        System.out.println("new name is "+ vars_test.getName());
        System.out.printf("number is %s", vars_test.getNumb());
        vars_test.setBool(false);
        System.out.printf(", bool is %s", vars_test.isBool());
    }
}