package ProjetoArvoreBusca;

public class Main {

	public static void main(String[] args) {
		
		
		   NoBB arvore = new NoBB (7);
		    NoBB.montaArvore(arvore, null);

		    NoBB n5 = new NoBB (5);
		    NoBB.montaArvore (n5, arvore);

		    NoBB n12 = new NoBB (12);
		    NoBB.montaArvore (n12, arvore);

		    NoBB n1 = new NoBB (1);
		    NoBB.montaArvore (n1, arvore);

		    NoBB n6 = new NoBB (6);
		    NoBB.montaArvore (n6, arvore);

		    NoBB n10 = new NoBB (10);
		    NoBB.montaArvore (n10, arvore);

		    NoBB n3 = new NoBB (3);
		    NoBB.montaArvore (n3, arvore);

		    NoBB n9 = new NoBB (9);
		    NoBB.montaArvore (n9, arvore);

		    NoBB n11 = new NoBB (11);
		    NoBB.montaArvore (n11, arvore);

		    System.out.println ("Pre-ordem: ");
		    NoBB.imprimirPreOrdem(arvore);
		    System.out.println(" ");

		    System.out.println ("Pos-ordem: ");
		    NoBB.imprimirPosOrdem(arvore);
		    System.out.println(" ");

		    System.out.println ("Em-ordem: ");
		    NoBB.imprimirEmOrdem(arvore);
		    System.out.println(" ");

		    System.out.println("Selecione o valor que deseja remover: ");

		   
		    NoBB.removerNo (arvore, 11);

		    System.out.println("----- Depois da remoção -----");

		    System.out.println ("Pre-ordem: ");
		    NoBB.imprimirPreOrdem(arvore);
		    System.out.println(" ");

		    System.out.println ("Pos-ordem: ");
		    NoBB.imprimirPosOrdem(arvore);
		    System.out.println(" ");

		    System.out.println ("Em-ordem: ");
		    NoBB.imprimirEmOrdem(arvore);
		    System.out.println(" ");

	}

}
