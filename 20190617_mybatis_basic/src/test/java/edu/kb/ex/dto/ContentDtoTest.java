package edu.kb.ex.dto;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class ContentDtoTest {

	@Test
	public void testGetMid() {
		ContentDto dto = new ContentDto(0, "�׽�Ʈ�Դϴ�", "�׽�Ʈ�Դϴ�");
		int result = dto.getMid();
	
		assertEquals(0, result);
	}
}
