package br.ce.thiago;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class OlaMundoTest {
	
	@Test
	public void testOlaMundo() {
		
		Response response = RestAssured.request(Method.GET, "http://restapi.wcaquino.me/ola"); //faz o chamado e instancia o resultado numa variavel
		Assert.assertTrue(response.getBody().asString().equals("Ola Mundo!")); //imprime no console o resultado da requisição e compara
		Assert.assertTrue(response.statusCode() == 200); //restorna o status code e compara
		Assert.assertTrue("O status code deveria ser 200", response.statusCode() == 200); //assert de conferencia
		Assert.assertEquals(200, response.statusCode()); //assert de conferencia
		
		
//		ValidatableResponse validacao = response.then(); //validar status code
//		validacao.statusCode(200); //validacao status code
		
	}

}
