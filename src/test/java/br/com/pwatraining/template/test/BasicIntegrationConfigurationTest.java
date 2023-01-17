package br.com.pwatraining.template.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
public class BasicIntegrationConfigurationTest {
	

    private static TestRestTemplate restTemplate;
    private static URL base;
    
   
    
	private final static int PORT = 8081;

    @BeforeAll
    public static void setUp() throws MalformedURLException {
        restTemplate = new TestRestTemplate("admin", "admin");
        try {
			base = new URL("http://localhost:" + PORT + "/api/v1/teste/getautor");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
    }

    @Test
    public void whenLoggedUserRequestsHomePage_ThenSuccess()
     throws IllegalStateException, IOException {
        ResponseEntity<String> response =
          restTemplate.getForEntity(base.toString(), String.class);
 
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertTrue(response.getBody().contains("Anderson Fabio da Silva"));
    }

    @Test
    public void whenUserWithWrongCredentials_thenUnauthorizedPage() 
      throws Exception {
 
        restTemplate = new TestRestTemplate("user", "wrongpassword");
        ResponseEntity<String> response =
          restTemplate.getForEntity(base.toString(), String.class);
 
        assertEquals(HttpStatus.UNAUTHORIZED, response.getStatusCode());
        assertTrue(response.getBody() == null);
    }
}