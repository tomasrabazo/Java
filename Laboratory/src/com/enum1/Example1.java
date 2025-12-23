package com.enum1;

import org.junit.Assert;
import org.junit.Test;

public class Example1 {
	
	public enum Currency {

        UNDEFINED(-1, "..."),
        NONE(-1, "NOC"),
        IGNORE(-1, "NOC"),
        EURO(2, "EUR"),
        CHF(8, "CHF"),
        CLP(7312, "CLP"),
        USD(9885, "USD"),
        AUD(922723, "AUD"),
        CAD(922707, "CAD"),
        HKD(922633, "HKD"),
        NZD(925376, "NZD"),
        JPY(2691, "JPY"),
        ZAR(925209, "ZAR"),
        GBX(1477635, "GBX"),
        GBP(2685, "GBP"),
        NLG(922693, "NLG"),
        BEF(916496, "BEF"),
        DEM(35070, "DEM"),
        LUF(922727, "LUF"),
        ITL(925171, "ITL"),
        DKK(472062, "DKK"),
        PTE(925111, "PTE"),
        NOK(472063, "NOK"),
        SEK(271454, "SEK"),
        PLN(925530, "PLN"),
        HUF(1457776, "HUF"),
        MXN(1477662, "MXN"),
        TRY(1828261, "TRY"),
        CZK(3890074, "CZK"),
        ISK(3890076, "ISK"),
        RON(3890077, "RON"),
        SKK(3890078, "SKK"),
        BGN(4788388, "BGN"),
        INR(4790709, "INR"),
        LTL(4790916, "LTL"),
        LVL(4790965, "LVL"),
        MTL(4791005, "MTL"),
        SIT(4791941, "SIT"),
        RUB(1331814, "RUB"),
        ZWD(4792029, "ZWD"),
        MYR(6618117, "MYR"),
        SGD(999999, "SGD"),
        BRL(148416, "BRL");

        private final int contractId;
        private final String abbr;

        public boolean isValid()	{
        	return contractId > 0;
        }
        
         // use getAlphabeticCode
        public String getSymbol() {
            return abbr;
        }

        
        public String getAlphabeticCode()	{
        	return abbr;
        }
        
         // use getAlphabeticCode
        public String getAbbriviation() {
            return abbr;
        }

        public int getContractID() {
            return contractId;
        }

        Currency(int _contractId, String _abbr) {
            contractId = _contractId;
            abbr = _abbr;

        }
    }

	@Test
	public void p1() {
		// TODO Auto-generated method stub
		Assert.assertEquals(2, Currency.EURO.getContractID());
		Assert.assertEquals("EUR", Currency.EURO.getAbbriviation());
	}

}
