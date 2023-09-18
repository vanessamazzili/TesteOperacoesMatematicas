package operacoes;

public class Calculadora {

	public static void main(String[] args) {
		
		// nomeei o ponteiro da classe de OperaçõesMatemáticas como "op.", onde o mesmo chamará todos os métodos associados ao “public void”
		
		OperacoesMatematicas op = new OperacoesMatematicas();
		op.divisao(10,2);
		op.multiplicacao(10,30);
		op.soma(5,30);
		op.subtracao(5,40);
		
	}

}
