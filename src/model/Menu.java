package model;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
	
	static int valor = 0;
	static List<Produto> produtos = new ArrayList<Produto>();
	static Scanner ler = new Scanner(System.in);
	
	public static void painel(){
		System.out.println("MENU \n"+"1 Cadastrar Produto \n"+"2 Imprimir \n"+"3 Sair");
		valor = ler.nextInt();
	}
	
	public static void cadastro(){
		String nome = JOptionPane.showInputDialog("Informe nome do Produto");
		try{
		Integer quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade"));
		Float valorP = Float.parseFloat(JOptionPane.showInputDialog("Preço"));
		float multiplicar = quantidade*valorP;
		
		Produto produto = new Produto();

		produto.setPrecoF(multiplicar);
		produto.setQuant(quantidade);
		produto.setNome(nome);
		produto.setTotal(valorP);
		
		produtos.add(produto);
		}catch(java.lang.NumberFormatException erro){
			JOptionPane.showMessageDialog(null,"Valor no campo Inválido");
			painel();
		}
	}
	public static void imprimir(){
		for (Produto p : produtos){
			System.out.println("Nome: "+p.getNome()+", Quant.: "+p.getQuant()+", Valor: "+p.getTotal()+" R$: "+p.getPrecoF());
		}
	} 

	
	public static void main(String[]args){
	
		while(true){
			if(valor==0){
				painel();
			}else if(valor==1){
				cadastro();
				painel();
			}else if(valor==2){
				imprimir();
				painel();
			}else if(valor==3){
				break;
			}else if(valor>=4){
				JOptionPane.showMessageDialog(null,"Numero inválido ");
				painel();
			}
		}
	}
}