public class Main {
    public static void main(String[] args) {
        //Por último, para el Switch,
        // deberás crear la variable estacion,
        // y distintos case para las cuatro estaciones
        // del año. Dependiendo del valor de la variable
        // estacion se deberá mandar un mensaje por
        // consola informando de la estación en la que
        // está. También habrá que poner un default para
        // cuando el valor de la variable no sea una
        // estación.

        var estacion = "VERANO";

        switch (estacion){
            case "VERANO":
                System.out.println("Es Verano");
                break;

            case "INVIERNO":
                System.out.println("Es invierno");
                break;

            case "OTOÑO":
                System.out.println("Es Otoño");
                break;

            case "PRIMAVERA":
                System.out.println("Es primavera");
                break;

            default:
                System.out.println("Sin estación");
        }
    }
}