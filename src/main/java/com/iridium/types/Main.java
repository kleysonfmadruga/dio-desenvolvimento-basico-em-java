package com.iridium.types;

public class Main {
    public static void main(String[] args){
        byte byteMax = 127;
        byte byteMin = -128;

        // The digits of the numbers can be separated by one '_' (underscore) to organize the decimal
        short shortMax = 32_767;
        short shortMin = -32_768;

        int intMax = 2_147_483_647;
        int intMin = -2_147_483_648;

        long longMax = 9_223_372_036_854_775_807L;
        long longMin = -9_223_372_036_854_775_808L;

        // Float-type numbers must have an 'f' after the last digit of right
        float floatNumber = 1.2423234225f;
        double doubleNumber = 1.348923484324;

        // Char-type variables can store letters...
        char charC = 'c';
        char charD = 'D';

        // ... number digits...
        char charNine = '9';

        // ... symbols...
        char charCypher = '$';

        // ... and even scape characters
        char charSkipLine = '\n';

        // But they can't store more than one character per variable
        //char notAllowed = 'abc';

        // Boolean variables can only store two kind of values:
        boolean theTruth = true;
        boolean theLie = false;

        // Yeah, boolean variables can't be bananas
        //boolean theBanana = banana;

        /* IMPORTANT! */
        // void isn't a type, it's and reserved word that means that the 'void' method don't return any value
        // therefore the code below won't work
        //void darkVoid;

        // All of these values can also be stored in their respective classes
        // in what is called 'auto-boxing'
        Byte byteObj = 0;
        Short shortObj = 1;
        Integer intObj = 2;
        Long longObj = 3L;
        Float floatObj = 4.5f;
        Double doubleObj = 6.7;
        Character charObj = 'e';
        Boolean theTruthObj = true;

        // The inverse is possible too
        // This is called 'unboxing'
        boolean otherLie = Boolean.FALSE;
        int i = intObj;

        // Strings are basic data types too, despite not being primitive
        String salut = "Hello, my name is Kleyson Fernandes Madruga :D";
    }
}
