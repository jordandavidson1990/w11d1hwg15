import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void setUp() throws Exception {
        printer = new Printer(100, 100);
    }

    @Test
    public void printPaperReduction() {
        printer.print(5, 10);
        assertEquals(50, printer.getSheetsLeft());
    }

    @Test
    public void getTonerLeft() {
        printer.print(5, 10);
        assertEquals(50, printer.getTonerVolume());
        assertEquals(50, printer.getSheetsLeft());
    }
}
