package com.project.donar;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.project.donar.model.Donar;
import com.project.donar.repository.DonarRepo;
import static org.assertj.core.api.Assertions.assertThat;
@RunWith(SpringRunner.class)
@SpringBootTest
class DonarApplicationTests {

	@Test
	void contextLoads() {
	}
	@Autowired
	private DonarRepo donarRepo;
	@Test
	public void testReadAll() {
		List list=donarRepo.findAll();
		assertThat(list).size().isGreaterThan(0);
	}
//	@Test
//	public void saveDonarTest() {
//		Donar donar = new Donar(10,"uday","male",24,"B+ve","uday@g.com","pune",98765432);
//		donarRepo.save(donar);
//		assertThat(donar.getAge()).isEqualTo(24);
//	}
	@Test
	public void findByAddAndBloodTest() {
		List<Donar> d=donarRepo.findByAddressAndBloodGroup("pune","B+ve");
		assertThat(d).isNotEmpty();
	}
	}


