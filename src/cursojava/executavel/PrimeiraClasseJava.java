package cursojava.executavel;

public class PrimeiraClasseJava {
	/* Main é um metodo auto executavel em Java */
	public static void main(String[] args) {

		int nota1 = 1;
		int nota2 = 1;
		int nota3 = 1;
		int nota4 = 8;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 7) {
			System.out.println("Aluno aprovado: " + media);
		} else if (media >= 4 && media < 7) {
			System.out.println("Aluno em recuperação: " + media);

		} else {
			System.out.println("Aluno reprovado: " + media);
		}
	}

}
