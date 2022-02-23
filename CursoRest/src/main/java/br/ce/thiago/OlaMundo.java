package br.ce.thiago;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class OlaMundo {

	public static void main(String[] args) { //metodo resquisicao GET imprimindo body
		Response response = RestAssured.request(Method.GET, "http://restapi.wcaquino.me/ola"); //faz o chamado e instancia o resultado numa variavel
		System.out.println(response.getBody().asString().equals("Ola Mundo!")); //imprime no console o resultado da requisição e compara
		System.out.println(response.statusCode() == 200); //restorna o status code e compara
		
		ValidatableResponse validacao = response.then(); //validar status code
		validacao.statusCode(200); //validacao status code
		
	}
}
