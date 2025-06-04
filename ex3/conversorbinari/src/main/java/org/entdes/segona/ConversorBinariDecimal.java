package org.entdes.segona;

public class ConversorBinariDecimal {

    // Converteix un número hexadecimal (com a String) a decimal
    public static Integer aDecimal(String hex) {
        return Integer.parseInt(hex, 16);
    }

    public static void main(String[] args) {

        String hex = "19";
        System.out.println("Hexadecimal " + hex + " -> Decimal: " + aDecimal(hex));

    }
}
