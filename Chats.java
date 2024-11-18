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
 System.out.println("Hola soy tú asistente virtual BEN de Tecnot. Elige una de estas opcione"); /*Le da la bienvenida al cliente cuando le da al input. */
 ConversacionOpciones(); /*Llama a la función de Conversación y Opciones. */
}
static void ConversacionOpciones (){
while (true) {  /*Bucle que ejecutará indefinidamente las convesaciones y opciones depende de lo que elige el cliente.*/
String converResp = scanner.nextLine(); /*El método nextLine() de java.util.Scanner es la clase de escáner de la línea actual y 
devuelve la entrada que se omitió. En este caso las conversaciones y respuestas.*/

if (converResp.equals("Falla de internet")) { /*El método equals() compara dos cadenas y devuelve verdadero si las cadenas son iguales.*/
System.out.println("Si tiene problemas de conexión de internet por favor comunicarse al servicio técnico: 0902139.");
       
} else if (converResp.equals("Costo de instalación")) { /*else if es la condición basada en ese valor preexistente. 
Si esa condición es verdadera. En este caso las conversaciones y opciones ya previamente programadas.*/
System.out.println("Claro el costo de la instación es de 30$ y de banda acha 120$ y fibra optica 200$.");
       
}else if (converResp.equals("Ubicacion")) {
System.out.println("Los ubucamos en la calle Félix en la esquina de la plaza. Te puedes comunicar al teléfono: 902139.");
 
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

  
