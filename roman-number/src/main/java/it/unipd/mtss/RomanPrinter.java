////////////////////////////////////////////////////////////////////
// [Agnese] [Beschin] [2077995]
// [Ivana Rose] [Setche] [2090030]
////////////////////////////////////////////////////////////////////


package it.unipd.mtss;

public class RomanPrinter {
    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        String riga1 = "";
        String riga2 = "";
        String riga3 = "";
        String riga4 = "";
        String riga5 = "";
        String riga6 = "";

        for (char c : romanNumber.toCharArray()) {
            switch (c) {
                case 'I':
                    riga1 += "  _____ ";
                    riga2 += " |_   _|";
                    riga3 += "   | |  ";
                    riga4 += "   | |  ";
                    riga5 += "  _| |_ ";
                    riga6 += " |_____|";
                    break;
                case 'V':
                    riga1 += " __      __";
                    riga2 += " \\ \\    / /";
                    riga3 += "  \\ \\  / / ";
                    riga4 += "   \\ \\/ /  ";
                    riga5 += "    \\  /   ";
                    riga6 += "     \\/    ";
                    break;
                case 'X':
                    riga1 += " __   __";
                    riga2 += " \\ \\ / /";
                    riga3 += "  \\ V / ";
                    riga4 += "   > <  ";
                    riga5 += "  / . \\ ";
                    riga6 += " /_/ \\_\\";
                    break;
                case 'L':
                    riga1 += "  _      ";
                    riga2 += " | |     ";
                    riga3 += " | |     ";
                    riga4 += " | |     ";
                    riga5 += " | |____ ";
                    riga6 += " |______|";
                    break;
                case 'C':
                    riga1 += "   _____ ";
                    riga2 += "  / ____|";
                    riga3 += " | |     ";
                    riga4 += " | |     ";
                    riga5 += " | |____ ";
                    riga6 += "  \\_____|";
                    break;
                case 'D':
                    riga1 += "  _____  ";
                    riga2 += " |  __ \\ ";
                    riga3 += " | |  | |";
                    riga4 += " | |  | |";
                    riga5 += " | |__| |";
                    riga6 += " |_____/ ";
                    break;
                case 'M':
                    riga1 += "  __  __ ";
                    riga2 += " |  \\/  |";
                    riga3 += " | \\  / |";
                    riga4 += " | |\\/| |";
                    riga5 += " | |  | |";
                    riga6 += " |_|  |_|";
                    break;
                default:
                    break;
            }
        }

        return riga1 + "\n" + riga2 + "\n" + riga3 + "\n" + riga4 + "\n" + riga5 + "\n" + riga6 + "\n";
    }


}
