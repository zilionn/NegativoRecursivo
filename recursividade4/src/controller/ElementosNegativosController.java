package controller;

public class ElementosNegativosController {

	public ElementosNegativosController() {
		super();
	}
	
	public int elementosNegativos(int[] vet, int posicoes) {
		// condição de parada - quando tamanho for <=a 0;
		// o valor presente na variável já será o do menor valor do vetor.
		if (posicoes <= 0) {
			return 0;
		}
		// relação de chamada dos passos: o número de posições irá ser subtraído sequencialmente por 1, 2, 3, 4... 0. 
		return (vet[posicoes - 1] < 0 ? 1 : 0) + elementosNegativos(vet, (posicoes - 1));
	}

}