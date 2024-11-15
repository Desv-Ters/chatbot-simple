import java.util.Scanner;
public class Chats {

final static Scanner scanner = new Scanner(System.in);
public static void main(String[] args){
 System.out.println("Bienvenido a la tienda virtual de Tecnot. Elige una de las opciones");
 ConversacionOpciones();
 
}
static void ConversacionOpciones (){
     while (true) {
      String converResp = scanner.nextLine();
      if (converResp.equals("Telefonos disponibles")) {
      System.out.println("Claro, aquí tienes una lista: Galaxy S2 y Redmin 2Q");
       
      } else if (converResp.equals("Ofertas de Telefonos")) {
      System.out.println("Actualmente, tenemos las siguientes ofertas:Redmin 2Q ¡10% de descuento!.");
       
      } else if (converResp.equals("Comparacion de modelos")) {
      
      System.out.println("Claro aquí los detalles: Galaxy S2 4GB RAM, y Redmin 2Q 3GB RAM.");
      
      } else if (converResp.equals("Precio de Telefonos")) {
      
        System.out.println("Claro el preio de Galaxy S2 esta disponible en 280$ y Redmin 2Q 180$.");
      
      } else if (converResp.equals("Mas informacion")) {
      System.out.println("Puedes comunicarte con nuestro equipo. al Correo electrónico: soporte@tecnot.com.");
         
      }else if (converResp.equals("Finalizar chat")) {
          System.out.println("¡Entendido! Gracias por preferir a Tecnot. Feliz día!");
      
      System.out.println("Finalizado chat.");
      System.exit(0);
       
      }
    }
   }
  }  

  
  
