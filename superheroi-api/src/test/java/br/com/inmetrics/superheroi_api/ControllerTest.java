package br.com.inmetrics.superheroi_api;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.inmetrics.superheroi_api.modelo.SuperHeroi;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=SuperHeroiApplication.class, webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ControllerTest {

	@Autowired
	private TestRestTemplate testRestTemplate;
	
	@Test
	public void deveSalvarSuperHeroi() {
		
		String url = "/superheroi/cadastrar";
		SuperHeroi sh = new SuperHeroi("Batman", "PRETO", "força");
		ResponseEntity<SuperHeroi> response = testRestTemplate.postForEntity(url, sh, SuperHeroi.class);
		assertEquals(response.getBody().getNome(), "Batman");
	}
}
