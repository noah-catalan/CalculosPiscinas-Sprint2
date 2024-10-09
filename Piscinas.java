public class Main {

    //Aquí creo una clase para cada una de las piscinas aprovechando lo que explicó bartomeu de los objetos
    // y le asigno los valores de largo, ancho y profundidad.

    // He supuesto que al ser piscinas inflables las medidas son en centímetros.
    // Establezco la clase y las variables públicas para poder acceder a ellas a traves de otras clases.
    // También uso el tipo float para poder calcular los decimales a posteriori
    public static class piscina1 {
        public static float largo = 300;
        public static float ancho = 150;
        public static float profundidad = 20;
    }

    public static class piscina2 {
        public static float largo = 300;
        public static float ancho = 80;
        public static float profundidad = 35;
    }


    public static void main(String[] args) {

        //Cálculos de area, volumen, medidas, etc.
        
        float areaPiscina1 = (piscina1.largo * piscina1.ancho)/10000;
        float areaPiscina2 = (piscina2.largo * piscina2.ancho)/10000;

        float volumenPiscina1 = (piscina1.largo * piscina1.ancho * piscina1.profundidad)/10000;
        float volumenPiscina2 = (piscina2.largo * piscina2.ancho * piscina2.profundidad)/10000;

        float anchoJuntas = piscina1.ancho + piscina2.ancho;

        float areaJuntas = areaPiscina1 + areaPiscina2;

        float volumenJuntas = volumenPiscina1 + volumenPiscina2;



        //Ahora solo queda imprimir los datos por pantalla con un porrón de "println()"

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
                + piscina1.largo + "cm x " + anchoJuntas + "cm." );
        System.out.println("El area de las dos piscinas conjuntas son: " + areaJuntas + "m2.");
        System.out.println("El volumen conjunto es de " + volumenJuntas + "L.");

        // Intercambio de profundidades
        System.out.println("\n\nVOLUMEN NUEVO INTERCAMBIANDO LAS PROFUNDIDADES");
        System.out.println("------------------------");
        System.out.println("El nuevo volumen de la piscina 1 es: "
                + (piscina1.largo * piscina1.ancho * piscina2.profundidad)/10000 + "L.");
        System.out.println("El nuevo volumen de la piscina 2 es: "
                + (piscina2.largo * piscina2.ancho * piscina1.profundidad)/10000 + "L.");


    }
}
