import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HoaDonTest {
    // Kiem thu voi bien: tuoi
    @Test
    void test1() {
        assertEquals(HoaDon.giamGia(10.5, 500000), -1);
    }

    @Test
    void test2() {
        assertEquals(HoaDon.giamGia(1, 500000), 0);
    }

    @Test
    void test3() {
        assertEquals(HoaDon.giamGia(5, 500000), 0);
    }

    @Test
    void test4() {
        assertEquals(HoaDon.giamGia(10, 200000), 200000);
    }

    // Kiem thu voi bien: hoaDon
    @Test
    void test5() {
        assertEquals(HoaDon.giamGia(-1, 300000), -1);
    }

    @Test
    void test6() {
        assertEquals(HoaDon.giamGia(1, 300000), 0);
    }

    @Test
    void test7() {
        assertEquals(HoaDon.giamGia(10, 7000000), 6300000);
    }

    @Test
    void test8() {
        assertEquals(HoaDon.giamGia(10, 100000), 100000);
    }

    @Test
    void test9() {
        assertEquals(HoaDon.giamGia(10, 6000000), 5400000);
    }

    @Test
    void test10() {
        assertEquals(HoaDon.giamGia(20, 1000000), 950000);
    }

    @Test
    void test11() {
        assertEquals(HoaDon.giamGia(10, 100000), 100000);
    }

    @Test
    void test12() {
        assertEquals(HoaDon.giamGia(20, 2500000), 2375000);
    }

    @Test
    void test13() {
        assertEquals(HoaDon.giamGia(10, 100000), 100000);
    }

    @Test
    void test14() {
        assertEquals(HoaDon.giamGia(-1, 200000), -1);
    }

    @Test
    void test15() {
        assertEquals(HoaDon.giamGia(3, 100000), 0);
    }

    @Test
    void test16() {
        assertEquals(HoaDon.giamGia(10, 8500000), 7650000);
    }

    @Test
    void test17() {
        assertEquals(HoaDon.giamGia(20, 4000000), 3800000);
    }
}