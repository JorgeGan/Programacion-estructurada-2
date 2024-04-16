import java.util.Scanner;

public class main {
    public static void main (String [] args){
        int op=0, op2=0;
           Scanner entrada = new Scanner (System.in);
           while (true){
           System.out.println("Bienvenido al menu principal.");
           System.out.println("Digite 1 para ir al menu de listas.");
           System.out.println("Digite 2 para ir al menu de colas.");
           System.out.println("Digite 3 para ir al menu de pilas.");
           System.out.println("Digite 4 para ir al menu de arboles.");
           op=entrada.nextInt();
           menuprincipal:
           switch (op) {
               case 1: System.out.println("Usted esta en el menu de listas.");
               System.out.println("Digite 1 para insertar al inicio.");
               System.out.println("Digite 2 para insertar al final.");
               System.out.println("Digite 3 para insertar en posicion.");
               System.out.println("Digite 4 para eliminar al inicio.");
               System.out.println("Digite 5 para eliminar al al final.");
               System.out.println("Digite 6 para eliminar en posicion.");
               Listas lista = new Listas();
               op2=entrada.nextInt();
               switch(op2){
                   case 1: System.out.println("Digite un valor entero, digite ver para mostrar.");
                   while(entrada.hasNext()){
                   if(entrada.hasNextInt()){
                   int valor = entrada.nextInt();
                   lista.Insertaralinicio(valor);
                   System.out.println("Digite un valor entero, digite ver para mostrar.");
                   }else{
                       String input=entrada.next();
                       if(input.equalsIgnoreCase("ver")){
                           System.out.println("La lista es");
                           lista.mostrarNodos();
                           break menuprincipal;
                       }else{
                           System.out.println("Error, opcion no valida.");
                           System.out.println("Digite un valor entero, digite ver para mostrar.");
                       }
                   }
               }
               case 2: System.out.println("Digite un valor entero, digite ver para mostrar.");
                   while(entrada.hasNext()){
                   if(entrada.hasNextInt()){
                   int valor=entrada.nextInt();
                   lista.Insertaralfinal(valor);
                   System.out.println("Digite un valor entero, digite ver para mostrar.");
               }else{
                   String input = entrada.next();
                   if(input.equalsIgnoreCase("mostrar")){
                       System.out.println("La lista es: ");
                       lista.mostrarNodos();
                       break menuprincipal;
                   }
                   else{
                       System.out.println("Error, opcion no valida.");
                       System.out.println("Digite un valor entero, digite ver para mostrar.");
                   }
                }
              }
   
                case 3: System.out.println("Digite un valor entero, digite ver para mostrar.");
                while(entrada.hasNext()){
                   if(entrada.hasNextInt()){
                   int valor = entrada.nextInt();
                   lista.Insertaralfinal(valor);
                   System.out.println("Digite un valor entero, digite ver para mostrar.");
                   }
                   else{
                       String input = entrada.next();
                       if(input.equalsIgnoreCase("ver")){
                           System.out.println("Digite la posicion: ");
                           while(!entrada.hasNextInt()){
                               System.out.println("Error: La posición debe ser un número entero.");
                               System.out.println("Digite la posición: ");
                               entrada.next();  
                           }
                           int posicion = entrada.nextInt();
                           System.out.println("Digite el nuevo valor: ");
                                       while (!entrada.hasNextInt()) {
                                           System.out.println("Error: El valor debe ser un número entero.");
                                           System.out.println("Digite el nuevo valor: ");
                                           entrada.next(); 
                                       }
                                       int valor = entrada.nextInt();
                                       lista.Insertarenposicion(posicion, valor);
                                       lista.mostrarNodos();
                                       break;
                       }
                       else{
                           System.out.println("Error, opcion no valida.");
                           System.out.println("Digite un valor entero, digite ver para mostrar.");
                       }
                   }
                }
                case 4: System.out.println("Digite un valor entero, digite ver para mostrar.");
                while(entrada.hasNext()){
                   if(entrada.hasNextInt()){
                       int valor = entrada.nextInt();
                       lista.Insertaralfinal(valor);
                       System.out.println("Digite un valor entero, digite ver para mostrar.");
                   }else{
                       String input = entrada.next();
                       if(input.equalsIgnoreCase("ver")){
                           System.out.println("La lista es: ");
                           lista.Eliminaralinicio();
                           lista.mostrarNodos();
                           break menuprincipal;
                       }else{
                           System.out.println("Error, opcion no valida.");
                           System.out.println("Digite un valor entero, digite ver para mostrar.");
                       }
                   }
                }
   
                System.out.println("Digite un valor entero, digite ver para mostrar.");
                while(entrada.hasNext()){
                   if(entrada.hasNextInt()){
                       int valor = entrada.nextInt();
                       lista.Insertaralfinal(valor);
                       System.out.println("Digite un valor entero, digite ver para mostrar.");
                   }else{
                       String input = entrada.next();
                       if(input.equalsIgnoreCase("mostrar")){
                           System.out.println("La lista es: ");
                           lista.Eliminaralfinal();
                           lista.mostrarNodos();
                           break menuprincipal;
                       }else{
                           System.out.println("Error, opcion no valida.");
                           System.out.println("Digite un valor entero.");
                       }
                   }
                }
                case 6: System.out.println("Digite un valor entero.");
                while(entrada.hasNext()){
                   if(entrada.hasNextInt()){
                       int valor = entrada.nextInt();
                       lista.Insertaralfinal(valor);
                       System.out.println("Digite un valor entero.");
                   }else{
                       String input = entrada.next();
                       if(input.equalsIgnoreCase("ver")){
                           System.out.println("Ponaga la posicion para eliminar: ");
                           while (!entrada.hasNextInt()) {
                               System.out.println("Error: La posicion debe ser un número entero.");
                               System.out.println("Digite la posicion que desea eliminar: ");
                               entrada.next(); 
                           }
                           int posicion=entrada.nextInt();
                                       System.out.println("Digite el nuevo valor: ");
                                       while (!entrada.hasNextInt()) {
                                           System.out.println("Error: El valor debe ser un número entero.");
                                           System.out.println("Digite el nuevo valor: ");
                                           entrada.next(); 
                                       }
                                       int valor = entrada.nextInt();
                                       System.out.println("La lista es:" );
                                       lista.Eliminarenposicion(posicion, valor);
                                       lista.mostrarNodos();
                                       break menuprincipal;
                                   }else{
                                       System.out.println("Error, opcion no valida.");
                                       System.out.println("Digite un valor entero.");
                                   }
                               }
                
                           }            
                           case 7: System.out.println("Digite un numero entero: ");
                           while(entrada.hasNext()){
                               if(entrada.hasNextInt()){
                                   int valor = entrada.nextInt();
                                   lista.Insertaralfinal(valor);
                                   System.out.println("Digite un numero entero: ");
                               }else{
                                   String input = entrada.next();
                                   if(input.equalsIgnoreCase("ver")){
                                       System.out.println("Digite la posicion del nodo: " );
                                       while (!entrada.hasNextInt()) {
                                           System.out.println("Error: La posicion debe ser un número entero.");
                                           System.out.println("Digite la posicion del nodo: ");
                                           entrada.next(); 
                                       }
                                       int posicion = entrada.nextInt();
                                       lista.obtenerNodo(posicion);
                                       System.out.println("La lista es: ");
                                       lista.mostrarNodoEnPosicion(posicion);;
                                       break menuprincipal;  
                                   }else{
                                       System.out.println("Error, opcion no valida.");
                                       System.out.println("Digite un valor entero.");
                                   }
                               }
                           }
                           case 8: System.out.println("Digite un valor entero: ");
                           while(entrada.hasNext()){
                               if(entrada.hasNextInt()){
                                 int valor = entrada.nextInt();
                                 lista.Insertaralfinal(valor);
                                 System.out.println("Digite un valor entero: ");
                               }else{
                                   String input = entrada.next();
                                   if(input.equalsIgnoreCase("ver")){
                                   System.out.println("Digte la posicion");
                                   int posicion = entrada.nextInt();
                                   lista.eliminarNodo(posicion);
                                   System.out.println("La lista es: ");
                                   lista.mostrarNodos();
                                   break menuprincipal;
                                   }else{
                                       System.out.println("Error, opcion no valida.");
                                       System.out.println("Digite un valor entero.");
                                   }
                               }
                           }
                       }
   
                       case 2: System.out.println("Menú de colas.");
                       while(true){
                           System.out.println("Digite 1 para agregar cola");
                           System.out.println("Digite 2 para eliminar cola");
                           System.out.println("Digite 3 para sababer el siguiente pedido");
                           op=entrada.nextInt();
                           colas cola = new colas();
                           switch(op){
                               case 1: System.out.println("Digite un valor entero, digite ver para mostrar.");
                               while(entrada.hasNext()){
                                   if(entrada.hasNextInt() && entrada.hasNextLine()){
                                   int pedido = entrada.nextInt();
                                   entrada.nextLine();
                                   System.out.println("Digite el nombre del cliente");
                                   String cliente = entrada.nextLine();
                                   cola.agregarCola(pedido, cliente);
                                   System.out.println("Digite un valor entero, digite ver para mostrar.");
                                   }else{
                                       String input = entrada.next();
                                       if(input.equalsIgnoreCase("ver")){
                                           System.out.println("La lista es: ");
                                           cola.obtener();
                                           break menuprincipal;
                                       }else{
                                           System.out.println("Error, opcion no valida.");
                                           System.out.println("Digite un valor entero, digite ver para mostrar.");
                                       }
                                   }
                               }
   
                               case 2:System.out.println("Digite un valor entero, digite ver para mostrar.");
                               while(entrada.hasNext()){
                               if(entrada.hasNextInt() && entrada.hasNextLine()){
                               int pedido = entrada.nextInt();
                               entrada.nextLine();
                               System.out.println("Digite le nombre del cliente");
                               String cliente = entrada.nextLine();
                               System.out.println("Digite un valor entero, digite ver para mostrar.");
                               }else{
                                   String input = entrada.next();
                                   if(input.equalsIgnoreCase("ver")){
                                       System.out.println("La lista es: ");
                                       cola.eliminar();
                                       System.out.println("Se eliminó: ");
                                       cola.obtener();
                                       break menuprincipal;
                                   }else{
                                       System.out.println("Error, opcion no valida.");
                                       System.out.println("Digite un valor entero, digite ver para mostrar.");
                                   }
                               }
                           }
                               case 3: System.out.println("Digite un valor entero, digite ver para mostrar.");
                               while(entrada.hasNext()){
                                   if(entrada.hasNextInt() && (entrada.hasNextLine())){
                                   int pedido = entrada.nextInt();
                                   entrada.nextLine();
                                   System.out.println("Digite le nombre del cliente");
                                   String cliente = entrada.nextLine();
                                   System.out.println("Digite un valor entero, digite ver para mostrar.");
                                   }else{
                                       String input = entrada.next();
                                       if(input.equalsIgnoreCase("ver")){
                                           System.out.println("La lista es: ");
                                           cola.saberPedido();
                                           break menuprincipal;
                                       }else{
                                           System.out.println("Error, opcion no valida.");
                                           System.out.println("Digite un valor entero, digite ver para mostrar.");
                                       }
                                   }
                               }
                           }
                       }
                       case 3: System.out.println("Esta en el menu de pilas");
                       while(true){
                           System.out.println("Digite 1 para apilar las pilas");
                           System.out.println("Digite 2 para despilar N pila");
                           System.out.println("Digite 3 para destruir");
                           op=entrada.nextInt();
                           pilas pila = new pilas ();
                           switch (op){
                               case 1: System.out.println("Digite un numero entero");
                               while(entrada.hasNext()){
                                   if(entrada.hasNextInt() && entrada.hasNextLine()){
                                       int numero = entrada.nextInt();
                                       entrada.nextLine();
                                       System.out.println("Digite el nombre del autor");
                                       String autor = entrada.nextLine();
                                       System.out.println("Digite el nombre del libro: ");
                                       String libro = entrada.nextLine();
                                       pila.apilar(numero, autor, libro);
                                       System.out.println("Digite un numero entero");
                                   }else{
                                       String input = entrada.next();
                                       if(input.equalsIgnoreCase("ver")){
                                           System.out.println("La lista de pilas es: ");
                                           pila.obtenerTope();
                                           break menuprincipal;
                                       }else{
                                           System.out.println("Error, opcion no  valida");
                                           System.out.println("Digite un valor entero, digite ver para mostrar.");
                                       }
                                   }
                               }
   
                               case 2: System.out.println("Digite un valor entero, digite ver para mostrar.");
                               while(entrada.hasNext()){
                                   if(entrada.hasNextInt() && entrada.hasNextLine()){
                                       int numero = entrada.nextInt();
                                       System.out.println("Digite l;e nombre del autor");
                                       String autor = entrada.nextLine();
                                       System.out.println("Digite el nombre del libro");
                                       String libro = entrada.nextLine();
                                       pila.apilar(numero, autor, libro);
                                       System.out.println("Digite un numero entero");
                                   }else{
                                       String input = entrada.next();
                                       if(input.equalsIgnoreCase("ver")){
                                           System.out.println("Digite la cantidad a desapilar");
                                           int cantidad = entrada.nextInt();
                                           System.out.println("La lista de pilas es: ");
                                           pila.desapilarN(cantidad);
                                           System.out.println(pila.length());
                                           break menuprincipal;
                                       }
                                       else{
                                           System.out.println("Error, opcion no valida");
                                           System.out.println("Digite un valor entero, digite ver para mostrar.");
                                       }
                                   }
                               }
                               case 3:System.out.println("Digite un valor entero, digite ver para mostrar.");
                               while(entrada.hasNext()){
                                   if(entrada.hasNextInt() && entrada.hasNextLine()){
                                      int numero = entrada.nextInt();
                                      entrada.nextLine();
                                      System.out.println("Digite el nombre del autor");
                                      String autor = entrada.nextLine();
                                      System.out.println("Digite el nombre del libro");
                                      String libro = entrada.nextLine();
                                      pila.apilar(numero, autor, libro);
                                      System.out.println("Digite un valor entero, digite ver para mostrar.");
                                   }else{
                                       String input = entrada.next();
                                       if(input.equalsIgnoreCase("ver")){
                                           System.out.println("La lista de piilas es: ");
                                           pila.destructor();
                                           System.out.println(pila.length());
                                           break menuprincipal;
                                       }else{
                                           System.out.println("Error, opcion no valida");
                                           System.out.println("Digite un numero entero");
                                       }
                                   }
                               }
                           }
                       }
   
                       case 4: System.out.println("Esta en el menu de arboles");
                       while(true){
                           System.out.println("Digite 1 para ordenar en inorder");
                           System.out.println("Digite 2 para ordenar en preorder");
                           System.out.println("Digite 3 para ordenar en postorder");
                           System.out.println("Digite 4 para elimianr un nodo del arbol");
                           System.out.println("Digite 5 para buscar un nodo en el arbol");
                           System.out.println("Digite 6 para contar las hojas en el arbol");
                           System.out.println("Digite 7 para contar los nodos del arbol");
                           System.out.println("Digite 8 para ver la altura del arbol");
                           System.out.println("Digite 9 para saber el valor menor");
                           System.out.println("Digite 10 para saber el valor mayor");
                           op=entrada.nextInt();
                           arbolBinario arbol = new arbolBinario();
                           switch(op){
                               case 1: System.out.println("Digite un valor entero, digite ver para mostrar.");
                               while(entrada.hasNext()){
                                   if(entrada.hasNextInt()){
                                       int nodo = entrada.nextInt();
                                       arbol.insertar(nodo);
                                       System.out.println("Digite un valor entero, digite ver para mostrar.");
                                   }else{
                                       String input = entrada.next();
                                       if(input.equalsIgnoreCase("ver")){
                                           System.out.println("El arbol ordenado es: ");
                                           arbol.inorder(arbol.raiz);
                                           break menuprincipal;
                                       }
                                       else{
                                           System.out.println("Error, opcion no valida");
                                           System.out.println("Digite un valor entero, digite ver para mostrar.");
                                       }
                                   }
                               }
   
                               case 2: System.out.println("Digite un valor entero, digite ver para mostrar.");
                               while(entrada.hasNext()){
                                   if(entrada.hasNextInt()){
                                      int nodo = entrada.nextInt();
                                      arbol.insertar(nodo);
                                      System.out.println("Digite un valor entero, digite ver para mostrar.");
                                   }else{
                                       String input = entrada.next();
                                       if(input.equalsIgnoreCase("ver")){
                                           System.out.println("El arbol ordenado es: ");
                                           arbol.preorder(arbol.raiz);
                                           break menuprincipal;
                                       }else{
                                           System.out.println("Error, opcion no valida");
                                           System.out.println("Digite un valor entero, digite ver para mostrar.");
                                       }
                                   }
                               }
   
                               case 3: System.out.println("Digite un valor entero, digite ver para mostrar.");
                               while(entrada.hasNext()){
                                   if(entrada.hasNextInt()){
                                       int nodo = entrada.nextInt();
                                       arbol.insertar(nodo);
                                       System.out.println("Digite un valor entero, digite ver para mostrar.");
                                   }else{
                                       String input = entrada.next();
                                       if(input.equalsIgnoreCase("ver")){
                                           System.out.println("El arbol ordenado es: ");
                                           arbol.postOrder(arbol.raiz);
                                           break menuprincipal;
                                       }else{
                                           System.out.println("Error, opcion no valida");
                                           System.out.println("Digite un valor entero, digite ver para mostrar.");
                                       } 
                                   }
                               }
                               case 4: System.out.println("Digite un valor entero, digite ver para mostrar.");
                               while(entrada.hasNext()){
                                   if(entrada.hasNextInt()){
                                       int nodo = entrada.nextInt();
                                       arbol.insertar(nodo);
                                       System.out.println("Digite un valor entero, digite ver para mostrar.");
                                   }else{
                                       String input = entrada.next();
                                       if(input.equalsIgnoreCase("ver")){
                                          System.out.println("Ponga el valor que quiera eliminar");
                                          int input2 =entrada.nextInt();
                                          System.out.println("El valor que elimino es: "+input2);
                                          break menuprincipal;
                                       }else{
                                           System.out.println("Error, opcion no valida");
                                           System.out.println("Digite un valor entero, digite ver para mostrar.");
                                       }
                                   }
                               }
   
                               case 5: System.out.println("Digite un valor entero, digite ver para mostrar.");
                               while(entrada.hasNext()){
                                   if(entrada.hasNextInt()){
                                       int nodo = entrada.nextInt();
                                       arbol.insertar(nodo);
                                       System.out.println("Digite un valor entero, digite ver para mostrar.");
                                   }else{
                                       String input = entrada.next();
                                       if(input.equalsIgnoreCase("ver")){
                                           System.out.println("Ponga el valor que quiera buscar");
                                           int valor = entrada.nextInt();
                                           NodoBinario buscando = arbol.buscar(valor);
                                           System.out.println("El valor buscado ess: "+buscando.valor);
                                           break menuprincipal;
                                       }else{
                                           System.out.println("Error, opcion no valida");
                                           System.out.println("Digite un valor entero, digite ver para mostrar.");
                                       }
                                   }
                               }
   
                               case 6: System.out.println("Digite un valor entero, digite ver para mostrar.");
                               while(entrada.hasNext()){
                                   if(entrada.hasNextInt()){
                                       int nodo = entrada.nextInt();
                                       arbol.insertar(nodo);
                                       System.out.println("Digite un valor entero, digite ver para mostrar.");
                                   }else{
                                       String input = entrada.next();
                                       if(input.equalsIgnoreCase("ver")){
                                           System.out.println("El total de hojas es: "+arbol.contarHojas());
                                           break menuprincipal;
                                       }else{
                                           System.out.println("Error, opcion no valida");
                                           System.out.println("Digite un valor entero, digite ver para mostrar.");
                                       }
                                   }
                               }
                               case 7: System.out.println("Digite un valor entero, digite ver para mostrar.");
                               while(entrada.hasNext()){
                                   if(entrada.hasNextInt()){
                                       int nodo = entrada.nextInt();
                                       arbol.insertar(nodo);
                                       System.out.println("Digite un valor entero, digite ver para mostrar.");
                                   }else{
                                       String input=entrada.next();
                                       if(input.equalsIgnoreCase("ver")){
                                           System.out.println("El total de nodos es: "+arbol.contarNodos());
                                           break menuprincipal;
                                       }else{
                                           System.out.println("Error, opcion no valida");
                                           System.out.println("Digite un valor entero, digite ver para mostrar.");
                                       }
                                   }
                               }
                               case 8: System.out.println("Digite un valor entero, digite ver para mostrar.");
                               while(entrada.hasNext()){
                                   if(entrada.hasNextInt()){
                                      int nodo = entrada.nextInt();
                                      arbol.insertar(nodo);
                                      System.out.println("Digite un valor entero, digite ver para mostrar.");        
                                   }else{
                                       String input = entrada.next();
                                       if(input.equalsIgnoreCase("ver")){
                                           System.out.println("La altura del arbol es: "+arbol.alturaArbol());
                                           break menuprincipal;
                                       }else{
                                           System.out.println("Error, opcion no valida");
                                           System.out.println("Digite un valor entero, digite ver para mostrar.");
                                       }
                                   }
                               }
                               case 9: System.out.println("Digite un valor entero, digite ver para mostrar.");
                               while(entrada.hasNext()){
                                   if(entrada.hasNextInt()){
                                       int nodo = entrada.nextInt();
                                       arbol.insertar(nodo);
                                       System.out.println("Digite un valor entero, digite ver para mostrar.");
                                   }else{
                                       String input = entrada.next();
                                       if(input.equalsIgnoreCase("ver")){
                                           System.out.println("El valor menor es: "+arbol.valorMenor(arbol.raiz));
                                           break menuprincipal;
                                       }else{
                                           System.out.println("Error, opcion no valida");
                                           System.out.println("Digite un valor entero, digite ver para mostrar.");
                                       }
                                   }
                               }
   
                               case 10: System.out.println("Digite un valor entero, digite ver para mostrar.");
                               while(entrada.hasNext()){
                                   if(entrada.hasNextInt()){
                                       int nodo = entrada.nextInt();
                                       arbol.insertar(nodo);
                                       System.out.println("Digite un valor entero, digite ver para mostrar.");
                                   }else{
                                       String input = entrada.next();
                                       if(input.equalsIgnoreCase("ver")){
                                           System.out.println("El valor mayor es: "+arbol.valorMayor(arbol.raiz));
                                           break menuprincipal;
                                       }else{
                                           System.out.println("Error, opcion no valida");
                                           System.out.println("Digite un valor entero, digite ver para mostrar.");
                                       }
                                   }
                               }
                           }
                       }
                   }
               }
           }
}