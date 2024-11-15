/* Modelo de Chatbot de Servicio al Cliente de la Tienda Tecnot de Ventas de Teléfonos móviles en Java. 
Por Teresa Baratta V26511450 AII UBA */
/*Repositorio en Github https://github.com/Desv-Ters/chatbot-simple*/
import java.util.Scanner; /* Esto permite obtener la entrada de datos primitivos.
Para capturar los datos de tipo int, double, string y etc*/
public class Chats {  /*Clase pública Chats*/
final static Scanner scanner = new Scanner(System.in); /*Se crea el objeto Scanner, 
se usa la nueva palabra clave seguida de una llamada al constructor de la clase Scanner. 
new es la instancia de Scanner*/
public static void main(String[] args){ /*Función principal en la aplicación en Java*/
 System.out.println("Bienvenido a la tienda virtual de Tecnot. Elige una de las opciones"); /*Le da la bienvenida al cliente cuando le da al input. */
 ConversacionOpciones(); /*Llama a la función de Conversación y Opciones. */
}
static void ConversacionOpciones (){
while (true) {  /*Bucle que ejecutará indefinidamente las convesaciones y opciones depende de lo que elige el cliente.*/
String converResp = scanner.nextLine(); /*El método nextLine() de java.util.Scanner es la clase de escáner de la línea actual y 
devuelve la entrada que se omitió. En este caso las conversaciones y respuestas.*/

if (converResp.equals("Telefonos disponibles")) { /*El método equals() compara dos cadenas y devuelve verdadero si las cadenas son iguales.*/
System.out.println("Claro, aquí tienes una lista: Galaxy S2 y Redmin 2Q");
       
} else if (converResp.equals("Ofertas de Telefonos")) { /*else if es la condición basada en ese valor preexistente. 
Si esa condición es verdadera. En este caso las conversaciones y opciones ya previamente programadas.*/
System.out.println("Actualmente, tenemos las siguientes ofertas:Redmin 2Q ¡10% de descuento!.");
       
}else if (converResp.equals("Comparacion de modelos")) {
System.out.println("Claro aquí los detalles: Galaxy S2 4GB RAM, y Redmin 2Q 3GB RAM.");
} else if (converResp.equals("Precio de Telefonos")) {
System.out.println("Claro el preio de Galaxy S2 esta disponible en 280$ y Redmin 2Q 180$.");
      
} else if (converResp.equals("Mas informacion")) {
System.out.println("Puedes comunicarte con nuestro equipo. al Correo electrónico: soporte@tecnot.com.");
}else if (converResp.equals("Finalizar chat")) {
System.out.println("¡Entendido! Gracias por preferir a Tecnot. Feliz día!");
System.out.println("Finalizado chat."); /*Finaliza el chat por parte del Cliente */
System.exit(0); /*Finaliza la aplicación, en este caso la conversación. */
       
    }
  }
 }
}  

  
