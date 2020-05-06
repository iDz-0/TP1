package fr.univ_amu.iut.exercice1;


public class HelloWorld {

    public static String hello(String s) {

            if(s == null || s.length() == 0) {
                return "Hello, World!";
            }
            else {
                return "Hello, "+ s + "!";
            }


    }


}
