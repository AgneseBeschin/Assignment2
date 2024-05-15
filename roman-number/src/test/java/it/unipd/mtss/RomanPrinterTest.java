////////////////////////////////////////////////////////////////////
// [Agnese] [Beschin] [2077995]
// [Ivana Rose] [Setche] [2090030]
////////////////////////////////////////////////////////////////////


package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RomanPrinterTest {

    @Test
    public void TestClasse_NewObject() {
        RomanPrinter object = new RomanPrinter();
        assertEquals(object.getClass(), RomanPrinter.class);
    }

    @Test
    public void TestStampa_zero() {
        assertEquals(RomanPrinter.print(0), "\n\n\n\n\n\n");
    }

    @Test
    public void TestStampa_Carattere() {
        assertEquals(RomanPrinter.print(1), "  _____ \n |_   _|\n   | |  \n   | |  \n  _| |_ \n |_____|\n");
        assertEquals(RomanPrinter.print(5), " __      __\n \\ \\    / /\n  \\ \\  / / \n   \\ \\/ /  \n    \\  /   \n     \\/    \n");
        assertEquals(RomanPrinter.print(10), " __   __\n \\ \\ / /\n  \\ V / \n   > <  \n  / . \\ \n /_/ \\_\\\n");
        assertEquals(RomanPrinter.print(50), "  _      \n | |     \n | |     \n | |     \n | |____ \n |______|\n");
        assertEquals(RomanPrinter.print(100), "   _____ \n  / ____|\n | |     \n | |     \n | |____ \n  \\_____|\n");
        assertEquals(RomanPrinter.print(500), "  _____  \n |  __ \\ \n | |  | |\n | |  | |\n | |__| |\n |_____/ \n");
        assertEquals(RomanPrinter.print(1000), "  __  __ \n |  \\/  |\n | \\  / |\n | |\\/| |\n | |  | |\n |_|  |_|\n");
    }

    @Test
    public void TestStampa_Caratteri(){
        assertEquals(RomanPrinter.print(89), "  _       __   __ __   __ __   __  _____  __   __\n | |      \\ \\ / / \\ \\ / / \\ \\ / / |_   _| \\ \\ / /\n | |       \\ V /   \\ V /   \\ V /    | |    \\ V / \n | |        > <     > <     > <     | |     > <  \n | |____   / . \\   / . \\   / . \\   _| |_   / . \\ \n |______| /_/ \\_\\ /_/ \\_\\ /_/ \\_\\ |_____| /_/ \\_\\\n");
        assertEquals(RomanPrinter.print(425), "   _____   _____   __   __ __   __ __      __\n  / ____| |  __ \\  \\ \\ / / \\ \\ / / \\ \\    / /\n | |      | |  | |  \\ V /   \\ V /   \\ \\  / / \n | |      | |  | |   > <     > <     \\ \\/ /  \n | |____  | |__| |  / . \\   / . \\     \\  /   \n  \\_____| |_____/  /_/ \\_\\ /_/ \\_\\     \\/\n");
        assertEquals(RomanPrinter.print(780), "  _____     _____    _____  _       __   __ __   __ __   __\n |  __ \\   / ____|  / ____| | |      \\ \\ / / \\ \\ / / \\ \\ / /\n | |  | | | |      | |      | |       \\ V /   \\ V /   \\ V / \n | |  | | | |      | |      | |        > <     > <     > <  \n | |__| | | |____  | |____  | |____   / . \\   / . \\   / . \\ \n |_____/   \\_____|  \\_____| |______| /_/ \\_\\ /_/ \\_\\ /_/ \\_\\\n");
    }
    
}
