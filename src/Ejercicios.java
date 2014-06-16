
public class Ejercicios
{	
	//Examen en Grupo
		//Junior Zelaya
		//Adalid Solis
		//Kevin Lanza
		//Maynor Morales
	
	
	//devuelve true si numero es multiplo de 3, de lo contrario devuelve false
	//2 puntos
	static boolean esMultiploDeTres(int num)
	//Evaluamos con % para saber si es divisible entre 3 luego lo igualamos a 0 para saber
	//si tiene residuo, por lo tanto si es divible y el resultado 
	{
		if ((num % 3)==0)
		return true;
		{			
		return false;
		}
	}
	
	//devuelve el numero menor entre a, b o c
	//Primero creamos la variable resultado para almacenar el resultado
	static int getMenor(int a, int b, int c){
		int resultado=0;
	//Evaluamos las condiciones para averiguar que variable es menor
	//comparando el valor entre ellas.
	{
		 if ((a < b) && (a < c)) 
		 { 
	      return a;
		 }
		        
	     if ((b < a) && (b < c)) 
	     {
	    	 return b;
	     }
	              
	      if ((c < a) && (c < b))
	      { 
	       return c;
	      }
	}     
	//Para cada evaluacion activamos la funcion y la almacenamos en nuestra variable
	//resultado listo para mostrar en pantalla
	 return resultado;          
}       
	  
	//devuelve el promedio los elementos de un arreglo
	
	
	static int getPromedio(int arreglo[])
	{ 
	//Primero creamos una variable llamada resultado para almacenar los calculos
	int resultado = 0; 
	int cantidad_numeros = 0; 
	//Usamos FOR para que recorra el arreglo y acumula dentro de la variable(cantidad_numeros) el 
	//valor de todos los elementos del arreglo.
	for(int i=0; i<arreglo.length; i++) 
	{ 
	resultado += arreglo[i]; 
	cantidad_numeros ++; 
	} 
	// Una vez que termino con todo el arreglo, 
	//divide la suma total de todos los valores por la cantidad de 
	//elementos que tiene el arreglo. 
	resultado = (resultado / cantidad_numeros); 
	return resultado; 
	} 
	 

	
	//Realizar una funcion con las siguientes indicaciones:
	//Si el parametro recibido es "Honduras" devolvera "Tegucigalpa"
	//Si el parametro recibido es "Francia" devolvera "Paris"
	//Si el parametro recibido es "Inglaterra" devolvera "Londres"
	static String getCapital(String pais)
	{
		return "";
	}
	
	//realizarla siguiente funcion recurisva:
	
	/* Pseudocodigo*/
	//funcionRecursiva(num)
	//  si num == 0
	//    devolver 0
	//  fin si
	//  devolver num + funcionRecursiva(num-1)
	
	/*Notacion matematica*/
	//funcionRecusriva(num) = num + funcionRecursiva(num-1)
	//Donde funcionRecursiva(0) = 0
	
	//1 punto oro extra
	static int funcionRecursiva(int num)
	{
		//Creamos nuestra variable resultado para retornarla con el resultado
		int resultado;
		//Establecemos un IF para evaluar si el numero es igual a 0 y si no que reste -1 al numero
		if (num == 0)
		{
			resultado = 0;
		}else
		{ resultado = num + funcionRecursiva(num -1);
		}
		return resultado;
		}
	
	
	public static void main(String args[])
	{
	}
}
