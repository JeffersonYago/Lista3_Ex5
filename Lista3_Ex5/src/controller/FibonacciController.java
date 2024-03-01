package controller;

public class FibonacciController {

	public FibonacciController() {
		super();
	}
	public int Fibo(int num) { 
		if (num < 2) { 
			return num; 
//enquanto o termo "num" for menor que 2, o próprio termo será retornado
			} else { 
				return Fibo(num - 1) + Fibo(num - 2); 
//será somado o termo anterior pelo seu antecessor e ele será exibido na classe principal
				} 
		} 
	}