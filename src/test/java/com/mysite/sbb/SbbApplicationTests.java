package com.mysite.sbb;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test") // test 프로파일을 활성화합니다. application-test.properties 파일을 사용합니다.
@SpringBootTest
class SbbApplicationTests {

	@Test
	void contextLoads() {
	}

}
