public class Main {

    public static void comparaNumero(int numeroIf) {
        if (numeroIf == 0){
            System.out.println("Es igual a 0");
        } else if (numeroIf > 0) {
            System.out.println("Es positivo");
        } else {
            System.out.println("Es negativo");
        }
    }
    public static void incrementaNumeroWhile(int numeroWhile){
        while (numeroWhile < 3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }
    }
    public static void incrementaNumeroDoWhile(int numeroWhile){
        do {
            numeroWhile++;
            System.out.println(numeroWhile);
        } while (numeroWhile < 3);
    }
    public static void incrementaNumeroFor(){
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }
    }

    public static void main(String[] args){
        comparaNumero(0);

        incrementaNumeroWhile(0);
        incrementaNumeroDoWhile(3);

        incrementaNumeroFor();



        String estacion = "primavera";
        switch (estacion){
            case "verano":
                System.out.println("Es verano");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "primavera":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("No es una estación");
        }





    }
}