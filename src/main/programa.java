package main;

public class programa {
	static  int sumaTotal = 0;
	public static void main(String[] args) {
		
			int [] arr = {-1,-1,-1};
			
		System.out.println(  sum(arr) );

		System.out.println(  "Hola Mundo" );
		

		
		entradaDatos.entrada();


		System.out.println(  "Prueba de ruta con un nuevo branch para Git" );
		
		clase2prueba.metodoprueba();
		
		

	}
	
	
	
	
	public static int sum(int[] arr) {
		int contador = 0;
		return sum2 (arr, contador);
		
	}
	
	public static int sum2 ( int []  arr, int con ) {
	

		
		if (arr.length == 0) {
			return 0;
		}
		
		if (con < arr.length ) {  
	
			sumaTotal += arr [con++];
		//	System.out.println(  sumaTotal );
			sum2(arr, con);
			
		
		}
		
		
		
		return sumaTotal;
	}
	

}
