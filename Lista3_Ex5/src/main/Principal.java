package main;
import javax.swing.JOptionPane;

import controller.FibonacciController;

public class Principal {

	public static void main(String[] args) {
		FibonacciController fib = new FibonacciController();
		int num = Integer.parseInt(JOptionPane.showInputDialog("insira um número"));
		while(num > 20) {
			num = Integer.parseInt(JOptionPane.showInputDialog("insira um número"));
		}
		int resultado = fib.Fibo(num);
		 System.out.println(resultado);
	}
	}

