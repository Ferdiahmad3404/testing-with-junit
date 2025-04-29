import static org.junit.jupiter.api.Assertions.*;

import com.kalkulator.kalkulatorMain;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void testPenjumlahan() {
        assertEquals(5.0, kalkulatorMain.hitung(2.0, 3.0, '+'));
    }

    @Test
    public void testPengurangan() {
        assertEquals(-1.0, kalkulatorMain.hitung(2.0, 3.0, '-'));
    }

    @Test
    public void testPerkalian() {
        assertEquals(6.0, kalkulatorMain.hitung(2.0, 3.0, '*'));
    }

    @Test
    public void testPembagian() {
        assertEquals(2.0, kalkulatorMain.hitung(6.0, 3.0, '/'));
    }

//    @Test
//    public void testPembagianDenganNol() {
//        Exception exception = assertThrows(ArithmeticException.class, () -> {
//            kalkulatorMain.hitung(5.0, 0.0, '/');
//        });
//        assertEquals("Tidak bisa membagi dengan nol.", exception.getMessage());
//    }
}
