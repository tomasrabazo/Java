package assembler.list.test1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.inspiresoftware.lib.dto.geda.assembler.Assembler;
import com.inspiresoftware.lib.dto.geda.assembler.DTOAssembler;

public class Example1 {

	@Test
	public void example1() {
		// TODO Auto-generated method stub
		final List<Object> list = new ArrayList<Object>();
		list.add("name");
		list.add("My name is ArrayList");
		final TestDto2Class dtoFromList = new TestDto2Class();
		final Assembler assembler =	DTOAssembler.newCustomAssembler(TestDto2Class.class, Map.class);
		// assemble DTO from List
		assembler.assembleDto(dtoFromList, list, null, null);
		final List<Object> listCopy = new ArrayList<Object>();
		// assemble List from Dto
		assembler.assembleEntity(dtoFromList, listCopy, null, null);
		
	}

}
