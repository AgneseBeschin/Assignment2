////////////////////////////////////////////////////////////////////
// [Agnese] [Beschin] [2077995]
// [Ivana Rose] [Setche] [2090030]
////////////////////////////////////////////////////////////////////


package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void TestClasse_NewObject() {
        IntegerToRoman object = new IntegerToRoman();
        assertEquals(object.getClass(), IntegerToRoman.class);
    }

    @Test
    public void TestConvert_primi3Num() {
        assertEquals(IntegerToRoman.convert(0),"");
        assertEquals(IntegerToRoman.convert(-12),"");
        assertEquals(IntegerToRoman.convert(1),"I");
        assertEquals(IntegerToRoman.convert(2),"II");
        assertEquals(IntegerToRoman.convert(3),"III");
    }

    @Test
    public void TestConvert_primi6Num() {
        assertEquals(IntegerToRoman.convert(4),"IV");
        assertEquals(IntegerToRoman.convert(5),"V");
        assertEquals(IntegerToRoman.convert(6),"VI");
    }

    @Test
    public void TestConvert_primi10Num() {
        assertEquals(IntegerToRoman.convert(7),"VII");
        assertEquals(IntegerToRoman.convert(8),"VIII");
        assertEquals(IntegerToRoman.convert(9),"IX");
        assertEquals(IntegerToRoman.convert(10),"X");
    }

    @Test
    public void TestConvert_primi20Num() {
        assertEquals(IntegerToRoman.convert(12),"XII");
        assertEquals(IntegerToRoman.convert(13),"XIII");
        assertEquals(IntegerToRoman.convert(15),"XV");
        assertEquals(IntegerToRoman.convert(18),"XVIII");
        assertEquals(IntegerToRoman.convert(19),"XIX");
        assertEquals(IntegerToRoman.convert(20),"XX");
    }

    @Test
    public void TestConvert_primi50Num() {
        assertEquals(IntegerToRoman.convert(29),"XXIX");
        assertEquals(IntegerToRoman.convert(35),"XXXV");
        assertEquals(IntegerToRoman.convert(48),"XLVIII");
        assertEquals(IntegerToRoman.convert(50),"L");
    }

    @Test
    public void TestConvert_primi100Num() {
        assertEquals(IntegerToRoman.convert(52),"LII");
        assertEquals(IntegerToRoman.convert(77),"LXXVII");
        assertEquals(IntegerToRoman.convert(85),"LXXXV");
        assertEquals(IntegerToRoman.convert(93),"XCIII");
        assertEquals(IntegerToRoman.convert(100),"C");
    }

    @Test
    public void TestConvert_primi500Num(){
        assertEquals(IntegerToRoman.convert(128),"CXXVIII");
        assertEquals(IntegerToRoman.convert(200),"CC");
        assertEquals(IntegerToRoman.convert(290),"CCXC");
        assertEquals(IntegerToRoman.convert(318),"CCCXVIII");
        assertEquals(IntegerToRoman.convert(420),"CDXX");
        assertEquals(IntegerToRoman.convert(500),"D");
    }

    @Test
    public void TestConvert_primi1000Num(){
        assertEquals(IntegerToRoman.convert(628),"DCXXVIII");
        assertEquals(IntegerToRoman.convert(795),"DCCXCV");
        assertEquals(IntegerToRoman.convert(810),"DCCCX");
        assertEquals(IntegerToRoman.convert(985),"CMLXXXV");
        assertEquals(IntegerToRoman.convert(1000),"M");
    }
}
