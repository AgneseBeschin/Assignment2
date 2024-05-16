////////////////////////////////////////////////////////////////////
// [Agnese] [Beschin] [2077995]
// [Ivana Rose] [Setche] [2090030]
////////////////////////////////////////////////////////////////////


package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RomanPrinterTest {

    @Test
    public void testClasse_NewObject() {
        RomanPrinter object = new RomanPrinter();
        assertEquals(object.getClass(), RomanPrinter.class);
    }

    @Test
    public void testStampa_zero() {
        assertEquals(RomanPrinter.print(0), "\n\n\n\n\n\n");
    }

    @Test
    public void testStampa_Carattere() {
        assertEquals(RomanPrinter.print(1), "  _____ \n |_   _|\n   | |  \n   | |  \n  _| |_ \n |_____|\n");
        assertEquals(RomanPrinter.print(5), " __      __\n \\ \\    / /\n  \\ \\  / / \n   \\ \\/ /  \n    \\  /   \n     \\/    \n");
        assertEquals(RomanPrinter.print(10), " __   __\n \\ \\ / /\n  \\ V / \n   > <  \n  / . \\ \n /_/ \\_\\\n");
        assertEquals(RomanPrinter.print(50), "  _      \n | |     \n | |     \n | |     \n | |____ \n |______|\n");
        assertEquals(RomanPrinter.print(100), "   _____ \n  / ____|\n | |     \n | |     \n | |____ \n  \\_____|\n");
        assertEquals(RomanPrinter.print(500), "  _____  \n |  __ \\ \n | |  | |\n | |  | |\n | |__| |\n |_____/ \n");
        assertEquals(RomanPrinter.print(1000), "  __  __ \n |  \\/  |\n | \\  / |\n | |\\/| |\n | |  | |\n |_|  |_|\n");
    }

    @Test
    public void testStampa_Caratteri(){
        assertEquals(RomanPrinter.print(16), " __   __ __      __  _____ \n \\ \\ / / \\ \\    / / |_   _|\n  \\ V /   \\ \\  / /    | |  \n   > <     \\ \\/ /     | |  \n  / . \\     \\  /     _| |_ \n /_/ \\_\\     \\/     |_____|\n");

        assertEquals(RomanPrinter.print(150), "   _____   _      \n  / ____| | |     \n | |      | |     \n | |      | |     \n | |____  | |____ \n  \\_____| |______|\n");

        assertEquals(RomanPrinter.print(501), "  _____    _____ \n |  __ \\  |_   _|\n | |  | |   | |  \n | |  | |   | |  \n | |__| |  _| |_ \n |_____/  |_____|\n");
    }
    
}
