////////////////////////////////////////////////////////////////////
// [Agnese] [Beschin] [2077995]
// [Ivana Rose] [Setche] [2090030]
////////////////////////////////////////////////////////////////////


package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        if (number <= 0) {
            return "";
        }
        String roman = "";
        int migliaia = number / 1000;
        int centinaia = (number % 1000) / 100;
        int decine = ((number % 1000) % 100) / 10;
        int unita = ((number % 1000) % 100) % 10;

        // calcolo migliaia
        roman += "M".repeat(migliaia);
        // calcolo centinaia
        int sub_cent = centinaia / 5;
        if (centinaia - sub_cent * 5 <= 3) {
            roman += ("D".repeat(sub_cent)) + ("C".repeat(centinaia - 5 * sub_cent));
        } else {
            roman += "C" + (sub_cent == 0 ? "D" : "M");
        }

        // calcolo decine
        int sub_dec = decine / 5;
        if (decine - sub_dec * 5 <= 3) {
            roman += ("L".repeat(sub_dec)) + ("X".repeat(decine - 5 * sub_dec));
        } else {
            roman += "X" + (sub_dec == 0 ? "L" : "C");
        }

        // calcolo unità
        int sub_unit = unita / 5;
        if (unita - sub_unit * 5 <= 3) {
            roman += ("V".repeat(sub_unit)) + ("I".repeat(unita - 5 * sub_unit));
        } else {
            roman += "I" + (sub_unit == 0 ? "V" : "X");
        }
        return roman;
    }
}
