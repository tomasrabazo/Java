package assembler.assembleEntities;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.inspiresoftware.lib.dto.geda.assembler.Assembler;
import com.inspiresoftware.lib.dto.geda.assembler.DTOAssembler;

public class Example1 {

	@Test
	public void example1() {
		//Example use List
		final Assembler asm = DTOAssembler.newAssembler(MyDto.class);

		final List<List<Object>> entities = new ArrayList<List<Object>>();
		final List<MyDto> dtos = new ArrayList<MyDto>();
		final MyDto dto = new MyDto();
		dto.setField1("value");
		dtos.add(dto);

		asm.assembleDtos(dtos, entities, null, null);
	}
}