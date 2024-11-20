//Desarrollo de Chatbot en Java. Por Teresa Baratta V26511450. AII UBA.  Actividad Sumativa IV //
// Demo del chatbot en Landbot : https://landbot.site/v3/H-2686237-YBJ4OEPE1OGWMCSL/index.html //
// Repositorio del código en Github: https://github.com/Desv-Ters/chatbot-simple/tree/main //

import java.util.Scanner; //Importa el scanner//
public class Chats { //La clase es publica //
  public static void main(String[] args){ //  public: Es el modificador de acceso del método. y static se utiliza principalmente para la gestión de la memoria.//
  // El método main() es el punto de partida que inicia la ejecución en Java.//
    Scanner scanner = new Scanner(System.in); //Entrada del escáner en java, se utiliza para obtener la entrada del usuario desde la consola.//
    System.out.println("Hola soy tú asistente virtual Ben, de Tecnot.\n" + "En que puedo ayudarte hoy?"); //Entrada de la consola//
    
    while(true){  //  while (true) en Java, ejecuta indicaciones hasta que se produzca una condición de terminación.//
      String input = scanner.nextLine();  // Aqui se genera el input que es la entrada escrita esta se escanea con nextLine //
      String resp = obtResp(input); // Declara la funcion obtener respuesta//
      System.out.println(resp); // Se imprime la respuesta //
     
    }
  }
    public static String obtResp(String input){
     //Lógica simple para generar respuestas basadas en la entrada del usuario/cliente.//
     if(input.contains("Hola")){ //La funcion contains es para encontrar cualquier secuencia de caracteres o en este caso una cadena en la conversación.//
      return "Hola soy BEN en que puedo ayudarte?"; // El input es para la entrada de datos en este caso la conversación //
     } else if(input.contains("Tengo fallas en mi internet")){ 
         return "Entiendo. Propocionarme tú nombre y apellido para\n" + "revisar.."; // \n es para salto de linea en java//
     } else if (input.contains("Mi nombre es Carl Josh")){
        return "Revisando en el sistema encuentro\n" + "Que en tú zona hay mantenimiento entre\n." + "una hora se restablece, tienes otra preguntas o dudas?";
      } else if(input.contains("No, Gracias")){
        return "Bien. Gracias por tú panciencia. Feliz día";
      } else if(input.contains("Costo del servicio")){
              return "Claro el costo de la instación es de 30$ \n" + "y de banda acha 50$ y fibra optica 80$."; 
    } else if(input.contains("Donde se encuentra ubicados")){
      return "Los ubucamos en la calle Félix en la esquina de la plaza. Te puedes comunicar al teléfono: 902139.";  

    }else if (input.contains("Finalizar chat")) {
      return"¡Entendido! Gracias por preferir a Tecnot. Feliz día!"; 
  }else {
      return "Lo siento, no te entiendo por favor comunicarte con servicio técnico\n" + "0902139"; 
      //Esto se lo agrege como una función nueva que cuando no se encuntre las opciones previamente programadas, imprima este mensaje//
     }
    }
  } 



  

  
