package com.enum1;

import org.junit.Assert;
import org.junit.Test;

public class Example2 {
	
	public enum ModuleIdentifiers {

		DELAYED(1, "DELAYED"),
		ENDOFDAY(2, "END-OF-DAY"),
		REALTIME(3, "REALTIME"),
		AFTERMIDNIGHT(4, "AFTER-MIDNIGHT");

        private final int Id;
        private final String identifier;
        
        public int getId()	{
        	return Id;
        }
        
        public String getIdentifier() {
            return identifier;
        }

        ModuleIdentifiers(int _Id, String _identifier) {
            Id = _Id;
            identifier = _identifier;
        }
    }

	@Test
	public void p1() {
		// TODO Auto-generated method stub
		Assert.assertEquals(ModuleIdentifiers.ENDOFDAY, ModuleIdentifiers.ENDOFDAY);
		Assert.assertEquals(2, ModuleIdentifiers.ENDOFDAY.getId());
		Assert.assertEquals("END-OF-DAY", ModuleIdentifiers.ENDOFDAY.getIdentifier());
	}

}
