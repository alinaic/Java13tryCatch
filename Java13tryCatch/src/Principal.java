public class Principal {

	public static void main(String[] args) {

		// cuando queramos controlar una excepcion debemos usar el bloque
		// try-catch

		System.out.println("voy a intentar transformar un String"
				+ "en tipo int");
		String introducido = "hola";

		try {

			int numero = Integer.parseInt(introducido);
			// si alguna instruccion del try da error
			// el try no continua y se ejecuta el codigo del catch
			System.out.println("numero convertido a int correctamente");

			// quiere decir intentar
			// instrucciones que pueden dar error-exepcion

		} catch (Exception e) {
			// codigo a ejecutar si en el try una instrucion
			// dio error o excepcion

			System.out.println("no puedo transformar a int");
			System.out.println("numero introducido no valido");

		}
		System.out.println("despues de try-catch");
	}

}
