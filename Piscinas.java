public class Main {
    public static void main(String[] args) {

        
        // Establecimiento de las medidas de las piscinas
            // He supuesto que al ser piscinas inflables las medidas son en centímetros.
            // También uso el tipo float para poder calcular los decimales a posteriori
        
        float piscina1Largo = 300;
        float piscina1Ancho = 150;
        float piscina1Profundidad = 20;

        float piscina2Largo = 300;
        float piscina2Ancho = 80;
        float piscina2Profundidad = 35;



        //Cálculos de area, volumen, medidas, etc.
            // Divido entre 10000 para pasar el area de cm2 a m2 y el volumen de cm3 a L.

        float areaPiscina1 = (piscina1Largo * piscina1Ancho)/10000;
        float areaPiscina2 = (piscina2Largo * piscina2Ancho)/10000;

        float volumenPiscina1 = (piscina1Largo * piscina1Ancho * piscina1Profundidad)/10000;
        float volumenPiscina2 = (piscina2Largo * piscina2Ancho * piscina2Profundidad)/10000;

        float anchoJuntas = piscina1Ancho + piscina2Ancho;

        float areaJuntas = areaPiscina1 + areaPiscina2;

        float volumenJuntas = volumenPiscina1 + volumenPiscina2;



        //Ahora solo queda imprimir los datos por pantalla con muchos "println()"

        //Area de las piscinas
        System.out.println("AREAS DE LAS PISCINAS");
        System.out.println("------------------------");
        System.out.println("El area de la piscina 1 es: "
                + areaPiscina1 + "m2.");
        System.out.println("El area de la piscina 2 es: "
                + areaPiscina2 + "m2.");


        //Volumen de las piscinas
        System.out.println("\n\nVOLUMEN DE LAS PISCINAS");
        System.out.println("------------------------");
        System.out.println("El volumen de la piscina 1 es: "
                + volumenPiscina1 + "L.");
        System.out.println("El volumen de la piscina 2 es: "
                + volumenPiscina2 + "L.");

        //Medidas de las piscinas juntas
        System.out.println("\n\nMEDIDAS, AREA Y VOLUMEN DE LAS PISCINAS JUNTAS");
        System.out.println("------------------------");
        System.out.println("Las medidas de las dos piscinas juntas serían: "
                + piscina1Largo + "cm x " + anchoJuntas + "cm." );
        System.out.println("El area de las dos piscinas conjuntas son: " + areaJuntas + "m2.");
        System.out.println("El volumen conjunto es de " + volumenJuntas + "L.");

        // Intercambio de profundidades
        System.out.println("\n\nVOLUMEN NUEVO INTERCAMBIANDO LAS PROFUNDIDADES");
        System.out.println("------------------------");
        System.out.println("El nuevo volumen de la piscina 1 es: "
                + (piscina1Largo * piscina1Ancho * piscina2Profundidad)/10000 + "L.");
        System.out.println("El nuevo volumen de la piscina 2 es: "
                + (piscina2Largo * piscina2Ancho * piscina1Profundidad)/10000 + "L.");


    }
}
