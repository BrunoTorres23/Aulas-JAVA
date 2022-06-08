package calendario;

public class Aplicacao {

	public static void main(String[] args) {
		
		//d1 vai receber data, que recebram esses parametros:
		Data d1 = new Data(10, 03, 2000, 0, 30, 10);
		d1.imprimir(Data.FORMATO_12H);
		d1.imprimir(Data.FORMATO_24H);
		
		//d2 vai receber data, que recebram esses parametros:
		Data d2 = new Data(15, 06, 2000, 23, 15, 20);
		d2.imprimir(Data.FORMATO_12H);
		d2.imprimir(Data.FORMATO_24H);
		
		//d3 vai receber data, que recebram esses parametros:
		Data d3 = new Data(5, 10, 2005);
		d3.imprimir(Data.FORMATO_12H);
		d3.imprimir(Data.FORMATO_24H);
	}

}
