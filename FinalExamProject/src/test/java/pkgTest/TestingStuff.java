package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.Retirement;

public class TestingStuff {

        @Test
        public void TestPV() {
                double dExpectedPV = -1454485.55;
                Retirement retiredvalue = new Retirement(40, 0.07, 20, 0.02, 10000, 2642);
                assertEquals(dExpectedPV,retiredvalue.TotalAmountSaved(),0.05);
        }

        @Test
        public void TestPMT() {
                double ExpectedPMT = 554.13;
                Retirement val = new Retirement(40, 0.07, 20, 0.02, 10000, 2642);
                assertEquals(ExpectedPMT, val.AmountToSave(), 0.05);
        }
}