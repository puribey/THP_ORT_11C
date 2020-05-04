package modelosParcial;

//import java.util.Scanner;

//El casino “Nunca Pierdo” ha implementado un programa para asistir a sus jugadores con su juego. Cada jugador
//contará con un programa, que funcionará en forma personalizada.

//Al iniciarse, registra el nombre del jugador y la cantidad de plata inicial con que jugará (mínimo $500)
//El programa le permite jugar hasta que se cumpla alguna de las siguientes:
//● El dinero restante del jugador esté por debajo del 20% del monto inicial.
//● El dinero restante no sea suficiente para jugar a ningún juego de los disponibles.
//● El jugador haya acumulado $5000 o más.
//El jugador puede jugar muchas rondas a diferentes juegos (un juego por ronda) pudiendo ser los mismos:
//● Ruleta
//● Black Jack
//● Poker
//Cada uno de ellos tiene un costo ($100 Ruleta, $200 Black Jack, $500 Poker).
//El programa debe preguntar a qué juego desea jugar (RUL, BJK o PKR)
//Luego debe mostrar el costo del juego (utilizar una función para obtener el costo)
//Si el dinero le alcanza para el juego elegido:
//1. Resta el costo del juego al dinero del jugador
//2. Utilizando la función obtenerResultado que devuelve 0, 1, o 2 (provista en el proyecto), se realizará lo
//siguiente
//○ Si devuelve 2, se debe sumar al disponible el doble del costo del juego.
//○ Si devuelve 1, se debe sumar al disponible el costo del juego.
//○ Si devuelve 0, no se debe sumar nada al disponible, ya que perdió la apuesta
//En cambio, si el dinero no le alcanza, muestra el mensaje “No le alcanza el dinero para este juego”, y vuelve a
//dar a elegir el juego.
//Al finalizar la ronda de juegos (por que se ha complido alguna de las condiciones de fin) se muestran las
//estadísticas de la sesión de juegos. Está debe incluir:
//● el dinero restante
//● la cantidad de veces que jugó cada juego,
//● qué porcentaje representa eso sobre el total de juegos jugados
//Cuando termines exportá el proyecto quitándole los binarios y subilos como entrega del examen.

public class Parcial_1 {
//	private static Scanner input = new Scanner(System.in);
//	public static final int MONTO_MINIMO_INICIAL = 500;
//	public static final int MONTO_MAXIMO = 5000;

	public static void main(String[] args) {
//		String nombreJugador;
//		int montoInicial;
//		double dineroRestante;
//		double porcentajeMinimoMontoInicial;
//		String juegoSeleccionado;
//
//		System.out.println("Ingrese el nombre del chofer:");
//		nombreJugador = input.next();
//		input.nextLine();
//
//		montoInicial = validarMontoInicial();

	}

//	private static int validarMontoInicial() {
//		int monto;
//
//		System.out.println("Ingrese la cantidad de dinero con la cual quiere iniciar:");
//		monto = input.nextInt();
//		input.nextLine();
//
//		while (monto < MONTO_MINIMO_INICIAL) {
//			System.out.println("El monto debe ser superior a los $500, ingrese el monto nuevamente");
//			monto = input.nextInt();
//			input.nextLine();
//		}
//
//		return monto;
//	};

}
