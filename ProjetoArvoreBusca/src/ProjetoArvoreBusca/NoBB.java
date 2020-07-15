package ProjetoArvoreBusca;
import java.util.Scanner;;
public class NoBB {
	public int valor;
	private NoBB esquerda;
	private NoBB direita;



	public NoBB (int valor){
	  this.valor=valor;
	  this.esquerda=null;
	  this.direita=null;
	}



	public static void montaArvore(NoBB novo, NoBB arvore){
	  if( arvore == null){
	    arvore = novo;
	  } else {
	    if( novo.valor < arvore.valor){
	      if(arvore.esquerda == null ){
	        arvore.esquerda = novo;
	      } else {
	        montaArvore(novo , arvore.esquerda);
	      }

	    } else {
	      if(arvore.direita == null){
	        arvore.direita = novo;
	      } else{
	        montaArvore (novo, arvore.direita);
	      }
	    }
	  }
	}

	public static boolean buscaNo(NoBB arvore, int valor ){
	  boolean ret = false;

	  if(arvore == null){
	    ret = false;
	  } else if (arvore.valor == valor){
	    ret = true;

	  } else {
	     if (arvore.valor > valor) {
	       ret = buscaNo (arvore.esquerda, valor);

	     } else {
	       ret = buscaNo(arvore.direita, valor);
	     }
	  }
	  return ret;
	}

	public static void removerNo (NoBB arvore, int valor){
	    if(arvore.valor == valor){
	      arvore = null;
	    } else if (arvore.valor > valor){
	      if ((arvore.esquerda.valor == valor)) {
	        MetodoParaRemoverNoEsquerda (arvore);
	      } else {
	        removerNo (arvore.esquerda, valor);
	      }
	} else {
	        if((arvore.direita.valor == valor)){
	          MetodoParaRemoverNoDireita(arvore);
	        } else {
	          removerNo(arvore.direita, valor);
	        }
	  }
	}

	public static void imprimirPreOrdem (NoBB n) {
	  System.out.print(n.valor + " ");
	  if (n.esquerda != null){
	    imprimirPreOrdem(n.esquerda);
	  }
	  if(n.direita != null){
	    imprimirPreOrdem(n.direita);
	  }
	}

	public static void imprimirEmOrdem (NoBB n) {
	  if(n.esquerda != null) {
	    imprimirEmOrdem(n.esquerda);
	  }
	  System.out.print(n.valor + " ");

	  if( n.direita != null ){
	    imprimirEmOrdem (n.direita);
	  }

	}

	public static void imprimirPosOrdem(NoBB n){
	  if(n.esquerda != null ){
	    imprimirPosOrdem(n.esquerda);
	  }
	  if(n.direita != null ) {
	    imprimirPosOrdem (n.direita);
	  }
	  System.out.print(n.valor + " ");
	}

	public static void removerUmFilhoEsquerda(NoBB noPai, String subArvore) {
	  if(subArvore.equals ("E")) {
	    noPai.esquerda = noPai.esquerda.esquerda;
	  } else {
	    noPai.esquerda = noPai.esquerda.direita;
	  }
	}
	public static void removerUmFilhoDireita(NoBB noPai, String subArvore){
	  if(subArvore.equals ("E")){
	    noPai.direita = noPai.direita.esquerda;
	  } else {
	    noPai.direita = noPai.direita.direita;
	  }
	}

	public static int totalFilhos (NoBB no) {
	  int total =0;

	  if (no.esquerda != null){
	    total += 1;
	  }
	  if(no.direita != null){
	    total +=2;
	  }
	  return total;

	}
	public static void MetodoParaRemoverNoDireita (NoBB noPai){
	  int filhos =0;
	  NoBB noRemover = null;
	  noRemover = noPai.direita;
	  filhos = totalFilhos(noRemover);
	  if(filhos == 0){
	    removerSemFilhos(noPai, "D");
	  } else if (filhos ==  1 ) {
	    removerUmFilhoDireita (noPai, "E");
	  } else if (filhos == 2) {
	    removerUmFilhoDireita (noPai, "D");
	  } else if (filhos == 3) {
	    //removerFilhosDirEsq
	  }
	}

	public static void MetodoParaRemoverNoEsquerda(NoBB noPai){
	  int filhos =0;
	  NoBB noRemover = null;
	  noRemover = noPai.esquerda;
	  filhos = totalFilhos(noRemover);
	  if(filhos == 0){
	    removerSemFilhos(noPai, "D");
	  } else if (filhos ==  1 ) {
	    removerUmFilhoEsquerda (noPai, "E");
	  } else if (filhos == 2) {
	    removerUmFilhoEsquerda (noPai, "D");
	  } else if (filhos == 3) {
	    //removerFilhosDirEsq
	  }
	}

	public static void removerSemFilhos (NoBB noPai, String subArvore) {
	  if(subArvore.equals ("E")) {
	    noPai.esquerda = null;
	  } else {
	    noPai.direita = null;
	  }
	}
}
