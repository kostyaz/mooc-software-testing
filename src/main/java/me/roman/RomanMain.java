package me.roman;

public class RomanMain {

    public static void main (String[] args) {

        Roman rmn = new Roman();

        System.out.println(rmn.convert("MMXVIII"));
        System.out.println(rmn.convert("I"));
        System.out.println(rmn.convert("MI"));
        System.out.println(rmn.convert("X"));
        System.out.println(rmn.convert("IV"));
        System.out.println(rmn.convert("MDCCLXXVI"));
    }
}
