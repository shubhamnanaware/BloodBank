package com.login;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.login.repository.RegistrationRepository;
import static org.assertj.core.api.Assertions.assertThat;
@SpringBootTest
class LoginApplicationTests {

	@Test
	void contextLoads() {
	}
	
//	 @Autowired
//	    private RemitterRegistrationRepository repository;
//
//	    @Test
//	    public void getAllRemitterTest() {
//	        List l = repository.findAll();
//	        assertThat(l).size().isGreaterThan(0);
//	    }
//
//	    @Test
//	    public void findByIdTest() {
//	        RemitterRegistration u = repository.findByaccountNumber(4536);
//	        assertEquals("Shubham", u.getFirstName());
//	    }

//	    @Test
//	    public void saveRemitterTest() {
//	        RemitterRegistration r = new RemitterRegistration(11, "uday", "jadhav", 2233, 70000.0, "pune", "uday@g.com");
//	         repository.save(r);
//	         assertThat(r.getAccountNumber()).isEqualTo(2233);
//	    }
	@Autowired
	private RegistrationRepository registrationRepository;
	@Test
	public void getAllTest() {
		List l =registrationRepository.findAll();
		assertThat(l).size().isGreaterThan(0);
	}
}
