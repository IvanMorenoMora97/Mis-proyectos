package Main;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;

import Core.Board;
import Core.Window;

/**
 * <h2>Space Invaders</h2>
 * <p>
 * Este juego trata sobre disparar a marcianos que se iran moviendo de izquierda
 * a derecha.
 * </p>
 * <p>
 * Una vez que derrotes a todos los marcianos aparecera el jefe final que se
 * movera más rápido.
 * </p>
 * <p>
 * Controles: "A" para moverse hacia la izquierda, "D" para moverse hacia la
 * derecha, "Barra espaciadora" para disparar.
 * </p>
 * 
 * @version 0.0.1
 * @author Iván Moreno Mora
 * @since 05-03-2019
 * 
 */

public class Main {

	static Board t = new Board();
	static Window f = new Window(t);
	static Scanner sc = new Scanner(System.in);

	// Booleanos

	static boolean izquierda = false; // Booleano con el cual se cambiara el movimiento de los marcianos de izquierda
										// a derecha.
	static boolean izquierdaBoss = false; // Booleano con el cual se cambiara el movimiento del jefe final de izquierda
											// a derecha.
	static boolean bossSeteado = false; // Booleano que introducirá el jefe final en la matriz.

	static boolean finalboss = false; // Booleano que nos permitirá acceder al nivel del jefe final.

	// Listas

	static ArrayList<String> Ranking = new ArrayList<String>(10); // Arraylist de String que almacenara los nombres de
																	// los jugadores.
	static ArrayList<Integer> Pjugadores = new ArrayList<Integer>(10); // Arraylist de Integers que almacenara la
																		// puntuación de cada jugador.

	// Matriz

	static int[][] matriu3 = { { 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2 }, // Matriz donde se muestran los marcianos y la
																			// nave del jugador.
			{ 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2 }, { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 },
			{ 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 }, { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 },
			{ 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 }, { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 },
			{ 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 }, { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 },
			{ 2, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 2 } };

	// Fila y columna donde esta situado el jefe final .
	static int filBoss = 0;
	static int colBoss = 6; // Posición del jefe final.

	/**
	 * 
	 * @param izquierda
	 *            Booleano con el cual se cambiara el movimiento de los marcianos de
	 *            izquierda a derecha.
	 * 
	 * @param izquierdaBoss
	 *            Booleano con el cual se cambiara el movimiento del jefe final de
	 *            izquierda a derecha.
	 * 
	 * @param filPersonaje
	 *            Posición del jugador.
	 * 
	 * @param colPersonaje
	 *            Posición del jugador.
	 * 
	 * @param filBoss
	 *            Posición del jefe final.
	 * 
	 * @param colBoss
	 *            Posición del jefe final.
	 * 
	 * @param finalboss
	 *            Booleano que nos permitirá acceder al nivel del jefe final.
	 * 
	 * @param bossSeteado
	 *            Booleano que introducirá el jefe final en la matriz.
	 * 
	 * @param Ranking
	 *            Arraylist de String que almacenara los nombres de los jugadores.
	 * 
	 * @param Pjugadores
	 *            Arraylist de Integers que almacenara la puntuación de cada
	 *            jugador.
	 * 
	 * @param matriu3
	 *            Matriz donde se muestran los marcianos y la nave del jugador.
	 * 
	 * @param t
	 *            Tablero del juego.
	 * 
	 * @param f
	 *            Ventana del juego.
	 * 
	 * @param sc
	 *            Reader de variables.
	 * 
	 */

	/**
	 * 
	 * En este procedimiento inicio el procedimiento bucle i el f.playMusic.
	 * 
	 */
	public static void main(String[] args) {

		//f.playMusic("mainmenuspaceinvaders.wav"); // Reproduce en bucle la música especificada dentro del parentesis.
		Menu();

	}

	/**
	 * 
	 * En este procedimiento iniciamos y añadimos el background, las imagenes i el
	 * menu.
	 * 
	 * @param imatges
	 *            Contenedor donde se almacenan las imagenes que se usaran en el
	 *            menu.
	 * 
	 * @param menu
	 *            Matriz donde se colocaran las imagenes y background a utilizar.
	 * 
	 * @param nombre
	 *            Variable que leera el nombre del jugador.
	 * 
	 * @param opcion
	 *            Variable que nos permitira seleccionar la opción del menú.
	 */
	public static void Menu() {
		int opcion = 0;
		String nombre = null; // Variable que leera el nombre del jugador.
		do {

			t.setActimgbackground(true); // Hacemos que el background se muestre.
			t.setImgbackground("espacio.gif"); // Ponemos un background para la matriz.
			t.setActborder(false); // Quitamos los bordes de cada casilla de la matriz.
			String[] imatges = { "spaceinvaderstitulo.png", "play.png", "rank.png", "exit.png", "", "", "", "", "", // Imagenes
																													// que
																													// se
																													// usan
																													// para
																													// el
																													// menú.
					"" };
			t.setSprites(imatges);
			f.setActLabels(false);
			int[][] menu = { { 5, 5, 5, 0, 5, 5, 5 }, { 5, 5, 5, 5, 5, 5, 5 }, { 5, 5, 5, 5, 5, 5, 5 }, // Matriz donde
																										// se muestra el
																										// menú del
																										// juego.
					{ 5, 5, 5, 5, 5, 5, 5 }, { 5, 5, 5, 1, 5, 5, 5 }, { 5, 5, 5, 2, 5, 5, 5 },
					{ 5, 5, 5, 3, 5, 5, 5 } };

			t.draw(menu); // Dibujamos el menú.

			f.setTitle("Space Invaders");

			opcion = sc.nextInt(); // MENU QUE MOSTRARA 3 OPCIONES: INICIAR EL JUEGO, MOSTRAR EL RANKING Y CERRAR
									// EL JUEGO.

			if (opcion >= 1 && opcion <= 3) {

				switch (opcion) {

				case 1:
					System.out.println("Ingresa tu nombre: ");
					nombre = sc.next();
					Ranking.add(nombre); // Añadimos el nombre del jugador en el arraylist Ranking.
					IniciarJuego(); // INICIAR EL JUEGO O NIVEL
					break;

				case 2:
					Ranking(); // MOSTRARA LOS 10 PRIMEROS RANKINGS DE LOS JUGADORES
					break;

				case 3:
					System.exit(0); // CERRAR VENTANA DEL VIDEOJUEGO
					break;
				}

			}

		} while (opcion != 3);
		System.out.println("Has salido del juego"); // Mensaje que mostraremos en la consola al usuario cuando salga del
													// jeugo.

	}

	/**
	 * 
	 * Procedimiento donde se mostrara el ranking y puntuación de los jugadores.
	 * 
	 */
	public static void Ranking() {

		System.out.print(Ranking); // Mostramos el nombre del jugador.
		System.out.println();
		System.out.print(Pjugadores); // Mostramos la puntación del jugador.

	}

	/**
	 * 
	 * Procedimiento donde se reiniciara la matriz cuando se vuelva a seleccionar
	 * jugar en el menú.
	 * 
	 */
	static void ReiniciarMatriz() {

		// Añadimos los marcianos a sus posiciones predeterminadas.
		matriu3[0][2] = 0;
		matriu3[0][3] = 0;
		matriu3[0][4] = 0;
		matriu3[0][5] = 0;
		matriu3[0][6] = 0;
		matriu3[0][7] = 0;
		matriu3[0][8] = 0;
		matriu3[0][9] = 0;
		matriu3[0][10] = 0;
		matriu3[1][3] = 0;
		matriu3[1][4] = 0;
		matriu3[1][5] = 0;
		matriu3[1][6] = 0;
		matriu3[1][7] = 0;
		matriu3[1][8] = 0;
		matriu3[1][9] = 0;

		// Añadimos la nave del protagonista a su posición predetermianda.
		matriu3[9][0] = 3;
		matriu3[9][1] = 3;
		matriu3[9][2] = 3;
		matriu3[9][3] = 3;
		matriu3[9][4] = 3;
		matriu3[9][5] = 3;
		matriu3[9][6] = 1;
		matriu3[9][7] = 3;
		matriu3[9][8] = 3;
		matriu3[9][9] = 3;
		matriu3[9][10] = 3;
		matriu3[9][11] = 3;
		matriu3[9][12] = 3;

	}

	/**
	 * 
	 * Procedimiento donde se iniciara la posición del jefe final una vez derrotado
	 * a todos los marcianos.
	 * 
	 */
	static void PonerBoss() {

		if (!bossSeteado) {

			matriu3[0][6] = 7;

			bossSeteado = true;
		}

	}

	/**
	 * 
	 * Procedimiento donde añadimos las imagenes que utilizaremos para jugar el
	 * nivel.
	 * 
	 * @param t.setActimgbackground
	 *            Hacemos que el background se muestre.
	 * 
	 * @param t.setImgbackground
	 *            Añade la imagen espacio.gif como background.
	 * 
	 * @param t.setActborder
	 *            Quitamos los bordes de cada casilla de la matriz.
	 * 
	 * @param f.setTitle
	 *            Titulo del juego que mostraremos en la consola.
	 * 
	 * @param t.draw
	 *            Nos permite dibujar la matriz.
	 */
	public static void IniciarJuego() {

		System.out.println("JUEGO INICIADO");

		t.setActimgbackground(true); // Hacemos que el background se muestre.
		t.setImgbackground("espacio.gif"); // Añade la imagen espacio.gif como background.
		t.setActborder(false); // Quitamos los bordes de cada casilla de la matriz.
		String[] imatges = { "marcianos.gif", "nave.png", "espacio.png", "", "", "disparo.png", "explosion.gif",
				"finalboss1.png" }; // Imagenes que usaremos para la matriz del juego.
		t.setSprites(imatges);
		f.setActLabels(false);
		f.setTitle("Space Invaders"); // Titulo del juego que mostraremos en la consola.

		t.draw(matriu3); // Dibujamos la matriz.

		MoverPersonaje();

	}

	/**
	 * 
	 * Procedimiento el cual nos permitirá disparar, mover la nave del personaje
	 * hacía los lados, mostrar el nivel del jefe final si se han eliminado todos
	 * los marcianos y acceder al menu una vez que se haya eliminado el jefe final.
	 * 
	 * @param vidaboss
	 *            Almacenara la vida del jefe final.
	 * 
	 * @param letra
	 *            Nos permitirá leer la letra que usaremos para movernos.
	 * 
	 * @param f.getKeyPressed
	 *            Nos permitirá almacenar la tecla presionada.
	 * 
	 * @param salir
	 *            La función de este booleano nos permitirá salir del bucle del
	 *            disparo si ha detectado un marciano, jefe final o si no ha
	 *            detectado nada.
	 *
	 * @param puntuacion
	 *            Puntuación del jugador.
	 * 
	 * @param bichos
	 *            Cantidad de marcianos que hay en el juego.
	 *
	 */
	public static void MoverPersonaje() {
		ReiniciarMatriz(); // Procedimiento que pondra los marcianos en sus posiciones correspondientes.

		int puntuacion = 0; // Variable con la puntuación del jugador.
		int vidaboss = 1; // Variable con la vida del jefe final.
		int bichos = 16;
		int filPersonaje = 9; // Posición del jugador.
		int colPersonaje = 6; // Variable con la posición de la nave del jugador.
		while (vidaboss != 0) {
			MoverMarcianos();
			// FUNCIONALIDAD DEL JUGADOR

			filPersonaje = 9; // Variable con la columna del personaje.

			char letra = 0; // Variable que leera la letra que pulsemos para poder movernos o disparar.

			letra = f.getKeyPressed();

			switch (letra) {

			case 'a':
			case 'A':
				if (colPersonaje != 0) {

					matriu3[filPersonaje][colPersonaje] = 2; // Añade un espacio en blanco en la posición del personaje.
					matriu3[filPersonaje][colPersonaje - 1] = 1; // Añade la imagen de la nave.png (la nave del
																	// protagonista) en la casilla de la izquierda.
					colPersonaje = colPersonaje - 1; // Sobrescribimos la variable de la posición del personaje.

				}
				break;

			case 'd':
			case 'D':
				if (colPersonaje != 12) {

					matriu3[filPersonaje][colPersonaje + 1] = 1; // Añade un espacio en blanco en la posición del
																	// personaje.
					matriu3[filPersonaje][colPersonaje] = 2; // Añade la imagen de la nave.png (la nave del
																// protagonista) en la casilla de la derecha.
					colPersonaje = colPersonaje + 1; // Sobrescribimos la variable de la posición del personaje.

				}
				break;

			case ' ':
				boolean salir = false;

				filPersonaje = 8; // Variable donde empezara el movimiento del disparo de la nave.

				while (!salir) { // Bucle que hará el recorrido del disparo.

					if (filPersonaje != 1) {

						matriu3[filPersonaje - 1][colPersonaje] = 5; // Retrocede una fila y muestra la imagen del
																		// disparo.

						matriu3[filPersonaje][colPersonaje] = 3; // En la misma fila en la que muestra el disparo le
																	// cambia la imagen por un espacio en blanco.

						filPersonaje = filPersonaje - 1; // Sobrescribimos la variable.

						if (matriu3[filPersonaje - 1][colPersonaje] == 0
								|| matriu3[filPersonaje - 1][colPersonaje] == 7) { // Condición la qual si detecta la
																					// imagen del marciano o jefe final
																					// mostrará la imagen de una
																					// explosión.

							if (matriu3[filPersonaje - 1][colPersonaje] == 7) { // Condición la qual si la siguiente
																				// imagen al disparo es la del jefe
																				// final le restara una vida.

								vidaboss = vidaboss - 1; // Restar vida del jefe final.

								System.out.println();
								System.out.println("Vida del BOSS: " + vidaboss); // Mostrará la vida del jefe final.
								System.out.println();

							}

							matriu3[filPersonaje][colPersonaje] = 3; // Sustituye la imagen del marciano por un espacio
																		// transparente.

							matriu3[filPersonaje - 1][colPersonaje] = 6; // Muestra el gif de la explosión en la casilla
																			// del marciano o jefe final.

							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}

							matriu3[filPersonaje - 1][colPersonaje] = 3; // Quita el gif de la explosión.

							bichos--; // Resta un marciano al contador de marcianos si el disparo detecta un marciano.

							puntuacion = puntuacion + 10; // Sumamos los puntos que obtiene el jugador.

							System.out.println(" PUNTUACION: " + puntuacion); // Mostramos la puntuación que tiene el
																				// jugador mientras va jugando.
							salir = true;

						}

						t.draw(matriu3); // Dibujamos la matriz.

						try {
							Thread.sleep(40);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}

					else {

						matriu3[filPersonaje][colPersonaje] = 5; // Muestra la imagen del disparo.

						matriu3[filPersonaje - 1][colPersonaje] = 5; // Retrocede una fila y muestra la imagen del
																		// disparo.

						matriu3[filPersonaje][colPersonaje] = 3; // En la misma fila en la que muestra el disparo le
																	// cambia la imagen por un espacio en blanco.

						matriu3[filPersonaje - 1][colPersonaje] = 5; // Retrocede una fila y muestra la imagen del
																		// disparo.

						try {
							Thread.sleep(150);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						matriu3[filPersonaje - 1][colPersonaje] = 3; // En la misma fila en la que muestra el disparo le
																		// cambia la imagen por un espacio en blanco.
						salir = true;

					}

				}
				break;

			}

			if (bichos == 0) { // Condicion la qual hará que si no hay marcianos nos llevara al nivel del jefe
								// final.

				FinalBoss();

			}

			t.draw(matriu3); // Dibujamos la matriz.

			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		if (vidaboss == 0) { // Condición la qual si el jefe final no tiene vidas se cumpliran lo siguiente:

			Pjugadores.add(puntuacion); // Añadimos la puntuación del jugador en el arraylist Pjugadores.

			Menu(); // Vamos al procedimiento del menú.

		}

	}

	/**
	 * 
	 * Procedimiento el qual nos permitira mover los marcianos hacia los lados.
	 * 
	 */
	public static void MoverMarcianos() {

		// MOVIMIENTO HACIA LA IZQUIERDA SI LOS MARCIANOS ESTAN EN EL LIMITE DERECHO
		if (!izquierda) {

			for (int f = 0; f <= 1; f++) {

				for (int c = 0; c < 13; c++) {

					if (f == 0 && c == 0 || c == 1) { // Condición que si se cumple nos llevara a otra condición.

						if (matriu3[f][c] == 0) { // Si se cumple esta condición pondra el booleano izquierda en true.

							izquierda = true; // Nos permitira hacer que los marcianos vayan hacia la derecha.

						}

					}

					if (matriu3[f][c] == 0 && c != 0) { // Mientras que la columna no sea 0 se cumplira lo siguiente.

						matriu3[f][c] = 3; // Pondra un espacio en blanco en la misma posicion.
						matriu3[f][c - 1] = 0; // Retrocedera una columna y añadira la imagen del marciano.

					}

				}

			}
		}

		// MOVIMIENTO HACIA LA DERECHA SI LOS MARCIANOS ESTAN EN EL LIMITE IZQUIERDO

		if (izquierda) {

			for (int f = 0; f <= 1; f++) {

				for (int c = 12; c >= 0; c--) {

					if (f == 0 && c == 11 || c == 10) { // Condición que si se cumple nos llevara a otra condición.

						if (matriu3[f][c] == 0) { // Si se cumple esta condición pondra el booleano izquierda en true.

							izquierda = false; // Nos permitira hacer que los marcianos vayan hacia la izquierda.

						}
					}

					if (matriu3[f][c] == 0 && c != 11) { // Mientras que la columna no sea 0 se cumplira lo siguiente.

						matriu3[f][c] = 3; // Pondra un espacio en blanco en la misma posicion.
						matriu3[f][c + 1] = 0; // Avanzara una columna y añadira la imagen del marciano.

					}

				}

			}

		}

		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * 
	 * Procedimiento con el cual iniciaremos los procedimientos PonerBoss y
	 * MoverBoss.
	 * 
	 */
	public static void FinalBoss() {

		// Utilizara los procedimientos PonerBoss y MoverBoss.

		PonerBoss();

		MoverBoss();

	}

	/**
	 * 
	 * Procedimiento el cual se usa para mover al jefe final de un extremo a otro
	 * sin pausas.
	 * 
	 */
	public static void MoverBoss() {

		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// MOVIMIENTO HACIA LA IZQUIERDA DEL FINAL BOSS

		if (!izquierdaBoss) {

			if (colBoss != 0) { // Mientras que el jefe final no este en la columna 0 se cumplira lo siguiente:
				matriu3[filBoss][colBoss] = 3; // Pondra un espacio en blanco en la misma posicion.
				matriu3[filBoss][colBoss - 1] = 7; // Se colocara una columna a la izquierda y añadira la imagen del
													// jefe final.
				colBoss = colBoss - 1; // Sobrescribimos la variable que almacena la posición del jefe final.
			}

			else { // Si el jefe final esta en la columna 0 se pondra el booleano en true.

				izquierdaBoss = true;

			}

		}

		if (izquierdaBoss) {

			if (colBoss != 12) { // Mientras que el jefe final no este en la columna 0 se cumplira lo siguiente:
				matriu3[filBoss][colBoss] = 3; // Pondra un espacio en blanco en la misma posicion.
				matriu3[filBoss][colBoss + 1] = 7; // Se colocara una columna a la derecha y añadira la imagen del jefe
													// final.
				colBoss = colBoss + 1; // Sobrescribimos la variable que almacena la posición del jefe final.
			}

			else { // Si el jefe final esta en la columna 12 se pondra el booleano en false.

				izquierdaBoss = false;

			}

		}

	}
}