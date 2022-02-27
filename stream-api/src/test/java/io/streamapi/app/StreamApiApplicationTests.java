package io.streamapi.app;

import java.time.LocalDateTime;
import java.util.UUID;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

import io.streamapi.app.model.MutableLiveStream;

@SpringBootTest
class StreamApiApplicationTests extends Object{

	@Test
	void contextLoads() {
		MutableLiveStream stream = new MutableLiveStream(
				UUID.randomUUID().toString(),
				"REST Point On Stream",
				"Unit test this before production",
				"https://www.youtube.com",
				null, 
				LocalDateTime.of(2022, 2, 11, 0, 0),
				LocalDateTime.of(2022, 2, 12, 0, 0)
				
				);
		
		assertNotNull(stream) ;
		Assertions.assertEquals("REST Point On Stream", stream);
		assertTrue(stream.getClass().isInstance(stream));
		Assertions.assertEquals(6, stream.getClass().getComponentType());
		
	}

}
