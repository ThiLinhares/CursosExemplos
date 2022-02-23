
//Função do algoritmo: Calcular média de vendas de um vendedor
//Autor: Thiago Linhares

programa
{
	
	funcao inicio()
	{
//váriaveis
		real vendaJan,vendaFev,vendaMar,vendaAbr,media
		cadeia vendedor

		escreva("Digite o nome do vendedor:")
		leia(vendedor)
		escreva("Digite a vendaJan:")
		leia(vendaJan)
		escreva("Digite a vendaFev:")
		leia(vendaFev)
		escreva("Digite a vendaMar:")
		leia(vendaMar)
		escreva("Digite a vendaAbri:")
		leia(vendaAbr)
		
//calculo a média
		media = (vendaJan+vendaFev+vendaMar+vendaAbr)/4
		escreva("Sua média é:" + media + "!")
		
//verifica a média
		se(media>=35.000) {
			escreva("\n" + "Parabéns, você ganhou um bônus!")
		}

		senao {
			escreva("\n" + "infelizmente você não ganhou bônus")
		}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 489; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */