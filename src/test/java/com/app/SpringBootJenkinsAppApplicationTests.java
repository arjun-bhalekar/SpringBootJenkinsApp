package com.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootJenkinsAppApplicationTests {
	
	private static Logger logger = LoggerFactory.getLogger(SpringBootJenkinsAppApplicationTests.class);
	
	@Test
	void testMethod1() {
		
		logger.info("=== executing testMethod1... ");
		assertEquals(true, true);
	}
	
	@Test
	void testMethod2() {
		
		logger.info("=== executing testMethod2... ");
		assertEquals(true, false);
	}

}
