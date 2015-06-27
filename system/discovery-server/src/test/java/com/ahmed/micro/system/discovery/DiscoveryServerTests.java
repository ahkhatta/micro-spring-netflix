package com.ahmed.micro.system.discovery;

import static org.hamcrest.Matchers.equalTo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Author: Ahmed Khattab (https://github.com/ahkhatta)
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DiscoveryServer.class)
@WebAppConfiguration
public class DiscoveryServerTests {


	@Test
	public void contextLoads() {
	}

}
