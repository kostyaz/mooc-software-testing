package me.roman;

public class Roman {

    public int convert(String s) {

        int num = 0;

        s = s.toUpperCase();

        while (!s.isEmpty()) {

            if (s.startsWith("CM")) {
                num += 900;
                s = s.substring(2);
            } else if (s.startsWith("M")) {
                num += 1000;
                s = s.substring(1);
            } else if (s.startsWith("CD")) {
                num += 400;
                s = s.substring(2);
            } else if (s.startsWith("D")) {
                num += 500;
                s = s.substring(1);
            } else if (s.startsWith("XC")) {
                num += 90;
                s = s.substring(2);
            } else if (s.startsWith("C")) {
                num += 100;
                s = s.substring(1);
            } else if (s.startsWith("XL")) {
                num += 40;
                s = s.substring(2);
            } else if (s.startsWith("L")) {
                num += 50;
                s = s.substring(1);
            } else if (s.startsWith("IX")) {
                num += 9;
                s = s.substring(2);
            } else if (s.startsWith("X")) {
                num += 10;
                s = s.substring(1);
            } else if (s.startsWith("IV")) {
                num += 4;
                s = s.substring(2);
            } else if (s.startsWith("V")) {
                num += 5;
                s = s.substring(1);
            } else if (s.startsWith("I")) {
                num += 1;
                s = s.substring(1);
            }
        }

        return num;
    }
}
