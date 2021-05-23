package ejercicios;

public class ejercicioBolean 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		//declarar variables a utilizar
		
		int x= 6;
		int y =9;
		int suma;
		
		String a ;
		String b;
		
		String azul = "azul";
		String blanco= "blanco";
		String verde = "verde";
		String rojo= "rojo";
		
		
		suma = x + y;
		System.out.println("el resultado de la suma es " + suma);
		System.out.println (suma==16);
		
		if (suma ==15) {
			System.out.println("la suma es correcta");
					}else
		{
			System.out.println("suma incorrecta");
		}
		
		System.out.println("comparacion de colores azul");
		System.out.println(azul==azul);
		
		if (azul==rojo) {
		System.out.println("obvio que estos colores son iguales");		
					}else{
     System.out.println("obvio que estos colores son diferentes");
						}
	}
}
	
