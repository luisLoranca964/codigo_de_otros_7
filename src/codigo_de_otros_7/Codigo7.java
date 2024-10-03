/*El programa consiste en que el usuario ingresa un pais y si esta dentro de una lista te devuelve su capital,
 * si no, te preguntará cual es la capital y estos seran agregados a la lista  
 * */
package codigo_de_otros_7;

import java.util.HashMap;
import java.util.Scanner;

//se quita el acento de la o
public class Codigo7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//se agrega Byte, Double y se acompleta la variable ca 
	    HashMap<String, String> capitales = new HashMap<String, String>();

	    capitales.put("Canadá", "Otawwa");
	    capitales.put("Estados Unidos", "Washington DC");
	    capitales.put("México", "México DF");
	    capitales.put("Belice", "Belmopán");
	    capitales.put("Costa rica", "San José");
	    //Se agrega string de la pital del salvador: "San Salvador"
	    capitales.put("El Salvador","San Salvador");
	    capitales.put("Guatemala", "Ciudad de Guatemala");
	    capitales.put("Honduras", "Tegucigalpa");
	    capitales.put("Nicaragua", "Managua");
	    capitales.put("Panamá", "Panamá");
	    
	    //Se cambia Sting a String
	    String c = "";
	    do {
	    	//se cambia in por out
	      System.out.print("Escribe el nombre de un país y te diré su capital: ");
	      //Se cambia nextDouble()
	      c = s.nextLine();
	      //Se cambia equal por equals
	      if (!c.equals("salir")) {
	    	  //Se cambia containsValue por containsKey
	        if (capitales.containsKey(c)) {
	        	//Se agrega out.
	          System.out.print("La capital de " + c);
	          //Se cambia put por get
	          System.out.println(" es " + capitales.get(c));
	        } else {
	          System.out.print("No conozco la respuesta ");
	          System.out.print("¿cuál es la capital de " + c + "?: ");
	          String ca = s.nextLine();
	          //Se cambia ca por capitales ya que ahi se agrega el nuevo pais con su capital 
	          capitales.put(c, ca);
	          System.out.println("Gracias por enseñarme nuevas capitales");
	        }
	      }
	    } while (!c.equals("salir"));//Se agrega un parentesis
	    //Se cierra scanner
	    s.close();
	}
}
