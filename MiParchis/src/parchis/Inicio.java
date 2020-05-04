package parchis;

//import java.util.*;

//import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.io.IOException;


public class Inicio {

	private final static Logger LOG_RAIZ = Logger.getLogger("parchis");
	private final static Logger LOG = Logger.getLogger("parchis.Inicio");
	
	////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		
		
        
		try {
			// Con el manejador de archivo, indicamos el archivo donde se mandaran los logs
	        // El segundo argumento controla si se sobre escribe el archivo o se agregan los logs al final
	        // Para sobre escribir pase un true para agregar al final, false para sobre escribir
	        // todo el archivo
			Handler fileHandler = new FileHandler("./parchis.log", false);
			
			// El formateador indica como presentar los datos, en este caso usaremos el formaro sencillo
	        // el cual es mas facil de leer, si no usamos esto el log estara en formato xml por defecto
	        SimpleFormatter simpleFormatter = new SimpleFormatter();
	        
	     // Se especifica que formateador usara el manejador (handler) de archivo
	        fileHandler.setFormatter(simpleFormatter);
	        
	        LOG_RAIZ.addHandler(fileHandler);
	        
	        // Indicamos a partir de que nivel deseamos mostrar los logs, podemos especificar un nivel en especifico
	        // para ignorar informacion que no necesitemos
	        fileHandler.setLevel(Level.ALL);
		}
		catch (IOException ex) {
			LOG.log(Level.SEVERE, "Error de IO");
		}

		/*
		Handler consoleHandler = new ConsoleHandler();
        // Asignamos los handles previamente declarados al log *raiz* esto es muy importante ya que
        // permitira que los logs de todas y cada una de las clases del programa que esten en ese paquete
        // o sus subpaquetes se almacenen en el archivo y aparescan en consola
        LOG_RAIZ.addHandler(consoleHandler);
        consoleHandler.setLevel(Level.ALL);
        */
        


		
		LOG.log(Level.INFO, "empieza");
		
		//Partida miPartida= new Partida();
		javax.swing.SwingUtilities.invokeLater( () -> { @SuppressWarnings("unused") VisualizacionPartida visu= new VisualizacionPartida();});
	
				
		//miPartida.add_remove_jugador("Pepe",ColorFicha.AMARILLO);
		//miPartida.add_remove_jugador("Luis",ColorFicha.ROJO);
		/*
		miPartida.evento_jugar();

		Scanner sc= new Scanner(System.in);
		
		boolean finPartida=false;
		int opcion;
		while (!finPartida) {

			miPartida.dump_estado();

			System.out.print("\n1-Cambiar ficha");
			System.out.print(" 2-Avanzar");
			System.out.print(" 3-Confirmar");
			System.out.print(" 8-Pintar");
			System.out.print(" 9-salir\n");
			opcion=sc.nextInt();
			
			
			switch (opcion) {
			case 1: miPartida.evento_cambiar_ficha();break;
			case 2: miPartida.evento_avanzar_ficha();break;
			case 3: miPartida.evento_fin_jugada();break;
			case 8: miPartida.pintarTablero();break;
			case 9: finPartida= true;break;
			}
			
		}
		sc.close();		
*/	}

	////////////////////////////////////////////////////////////////////////////
	/*
	 * public static void pruebas() { // Lista con las fichas HashSet<Ficha> fichas
	 * = new HashSet<Ficha>();
	 * 
	 * Tablero miTablero = new Tablero(); miTablero.dump();
	 * 
	 * // miTablero.dump_color(ColorFicha.AZUL);
	 * 
	 * fichas.add(new Ficha(ColorFicha.AMARILLO,1)); fichas.add(new
	 * Ficha(ColorFicha.ROJO,1));
	 * 
	 * // Recorro las fichas con un iterador Iterator<Ficha> iterador=
	 * fichas.iterator(); while (iterador.hasNext()) {
	 * Movimientos.entrar_ficha(miTablero,iterador.next()); }
	 * 
	 * for (Ficha f: fichas) {
	 * System.out.printf(Movimientos.sacar5_ficha(miTablero,f).toString() + " "); }
	 * 
	 * 
	 * // Recorro las fichas con un bucle for each for (Ficha f: fichas) {
	 * System.out.printf(Movimientos.mover_ficha(miTablero, f, 12).toString() +
	 * " "); System.out.printf(Movimientos.mover_ficha(miTablero, f, 5).toString() +
	 * " "); System.out.printf(Movimientos.mover_ficha(miTablero, f, 5).toString() +
	 * " "); System.out.printf(Movimientos.mover_ficha(miTablero, f, 12).toString()
	 * + " "); //System.out.printf(Movimientos.mover_ficha(miTablero, f,
	 * 12).toString() + " "); //System.out.printf(Movimientos.mover_ficha(miTablero,
	 * f, 12).toString() + " ");
	 * //System.out.printf(Movimientos.mover_ficha(miTablero, f, 12).toString() +
	 * " "); //System.out.printf(Movimientos.mover_ficha(miTablero, f, 1).toString()
	 * + " "); break; }
	 * 
	 * Ficha fx=new Ficha(ColorFicha.ROJO,2);
	 * System.out.printf(Movimientos.entrar_ficha(miTablero,fx).toString() + " ");
	 * System.out.printf(Movimientos.sacar5_ficha(miTablero,fx).toString() + " ");
	 * 
	 * 
	 * miTablero.dump_fichas();
	 * 
	 * 
	 * }
	 */
}
