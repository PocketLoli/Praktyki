

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void dwaplusdwarownasiecztery(){
       main main = new main(2,2);
       assertEquals(4,main.suma());


    }
    @Test
    public void dwapluszerorownasiedwa(){
        main main = new main(2,0);
        assertEquals(2,main.suma());
    }
    @Test
    public void zeropluszerorownasiecztery(){
        main main = new main(0,0);
        assertEquals(4,main.suma());

    }
    @Test
    public void minuspiecplusminusjedenrownasiecztery(){
        main main = new main(-5,-1);
        assertEquals(-6,main.suma());
//SUMA-------------------------------------------------------
    }
    @Test
    public void czteryminusosiemrownasieminuscztery(){
        main main = new main(4,8);
        assertEquals(-4,main.roznica());


    }
    @Test
    public void szescminusosiemrownasieminusdwa(){
        main main = new main(6,8);
        assertEquals(-2,main.roznica());


    }
    @Test
    public void zerominusminus2(){
        main main = new main(0,-2);
        assertEquals(2,main.roznica());


    }
    @Test
    public void siedemminuszero(){
        main main = new main(7,0);
        assertEquals(-7,main.roznica());


    }
//ROZNICA------------------------------------------------
@Test
public void dwarazydwarownasiecztery(){
    main main = new main(2,2);
    assertEquals(4,main.iloczyn());


}
    @Test
    public void minustrzyrazyminusczteryrownasieminusdwanasscie(){
        main main = new main(-3,-4);
        assertEquals(-12,main.iloczyn());


    }
    @Test
    public void zerorazyzero(){
        main main = new main(0,0);
        assertEquals(0,main.iloczyn());

    }

    @Test
    public void jedenrazydwarownasiedwa(){
        main main = new main(1,2);
        assertEquals(2,main.iloczyn());


    }
//Iloczyn----------------------------------------------------------------------
@Test
public void dwapodzielicprzezdwarownasiejeden(){
    main main = new main(2,2);
    assertEquals(1,main.iloraz());


}
    @Test
    public void osiempodzielicprzezminusszesnascierownasieminuspol(){
        main main = new main(8,-16);
        assertEquals(-0.5,main.iloraz());


    }
    @Test
    public void piecpodzielicprzezdwarownasiedwaipol(){
        main main = new main(5,2);
        assertEquals(2.5,main.iloraz());

    }
//Iloraz---------------------------------------------------------------------
@Test
public void dwadopotegidrugiejrownasiecztery(){
    main main = new main(2,2);
    assertEquals(4,main.potega());
    }
    @Test
    public void siedemdopotegisiodmejrownasieosiemsetdwadziesciatrzytysiacepiecsetczterdziescitrzy(){
        main main = new main(7,7);
        assertEquals(823543,main.potega());

    }
    @Test
    public void minusdwadopotegi(){
        main main = new main(7,7);
        assertEquals(823543,main.potega());

    }

    @Test
    public void minusdwadopotegipiatejrownasie(){
        main main = new main(-2,5);
        assertEquals(-32,main.potega());

    }
}
//POTEGA----------------------------------------------------------------------
@Test
public void (){
    main main = new main(-2,5);
    assertEquals(-32,main.potega());

}