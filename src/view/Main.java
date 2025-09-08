package view;

import dev.gsgs.Pilha;

public class Main {

	public static void main(String[] args) {
		Pilha p = new Pilha();
		
		boolean vazia = p.isEmpty();
		System.out.println("Vazia: "+vazia);
		System.out.println("");

		int totalNodes = (int) ((Math.random() * 10) + 1);
		//int totalNodes = 0;
		
		for(int i=0; i<totalNodes; i++) {
			int e = (int)((Math.random() * 100) + 1);
			System.out.print(" " + e);
			p.push(e);
		}
		
		System.out.println("\n");
		
		int top = 0;
		try {
			top = p.top();
			System.out.println("Topo: "+top);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		int tam = p.size();
		System.out.println("Tamanho da pilha: " + tam);
		System.out.println("");
		
		try {
			int max = p.max();
			System.out.println(max);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for(int i=0; i<totalNodes; i++) {
			try {
				int value = p.pop();
				System.out.println("Pop: " + value);
			} catch (Exception e) {
				e.printStackTrace();
			}
			vazia = p.isEmpty();
			System.out.println("Vazia: " + vazia);
		}
		
		// p.push(1);
		// p.push(2);
		// p.push(3);
	}

}