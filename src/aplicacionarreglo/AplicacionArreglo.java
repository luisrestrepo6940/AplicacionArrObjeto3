package aplicacionarreglo;
/**
 *
 * @author lfrestrepo
 */
import java.io.*;

public class AplicacionArreglo {
    
    public static void main(String[] args) throws IOException{
    	
    	Arreglo2("Dabale arroz a la zorra el abad");
    	Arreglo("atenidas");
    	}
    	
    //Arreglo con un vector tipo char
    public static void Arreglo(String palabra){
    	boolean switcher=false;
    	int auxiliar=palabra.length();
    	char arreglo[]=new char[palabra.length()];
    	for(int i=0; i<palabra.length(); i++){
    		arreglo[i]=palabra.charAt(i);
    		System.out.println(arreglo[i]);
    		auxiliar--;
    		if(arreglo[auxiliar]==arreglo[i])
    			switcher = true;
    		}
    		if(switcher)
    			System.out.println("Es un Palindromo");
    				else
    			System.out.println("No es un Palindromo"); 
    		System.out.println("");
    		}
    		
        //Arreglo con dos vectores tipo char
        public static void Arreglo1(String palabra1, String palabra2){
    	boolean switcher=false;
    	char arreglo1[]=new char[palabra1.length()];
    	char arreglo2[]=new char[palabra2.length()];
    	int auxiliar=palabra1.length(); 
    	for(int i=0; i<palabra1.length(); i++){
    		arreglo1[i]=palabra1.charAt(i);
    		System.out.println(arreglo1[i]);
    		auxiliar--;
    		if(arreglo1[auxiliar]==arreglo1[i])
    			switcher = true;
    		}
    		if(switcher){
    			System.out.println("Es un Palindromo");
    			switcher=false;
    		}
    				else
    			System.out.println("No es un Palindromo"); 
    		System.out.println("");
    	auxiliar=palabra2.length();
    	for(int j=0; j<palabra2.length(); j++){
    		arreglo2[j]=palabra2.charAt(j);
    		System.out.println(arreglo2[j]);
    		auxiliar--;
    		if(arreglo2[auxiliar]==arreglo2[j])
    			switcher = true;
    		}
    		if(switcher)
    			System.out.println("Es un Palindromo");
    				else
    			System.out.println("No es un Palindromo"); 
    		System.out.println("");
    		}
    		
    	//Método arreglo sin vector tipo char	
        public static void Arreglo2(String palabra){
    	boolean switcher=false;
    	int aux=palabra.length();
    	for(int i=0; i<palabra.length(); i++){
    		System.out.println(palabra.charAt(i));
    		aux--;
    		if(palabra.charAt(aux)==palabra.charAt(i))
    			switcher = true;
    		}
    		if(switcher)
    			System.out.println("Es un Palindromo");
    				else
    			System.out.println("No es un Palindromo"); 
    		System.out.println("");
    		}
    }