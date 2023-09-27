package Fechas;

public class TestFecha {
    public static void main(String[] args) {
        TodaysDate hoy = new TodaysDate();
        hoy.printDateAndTime();
        testearOcultamiento();

    }
    public static void testearOcultamiento(){
        TodaysDate prueba = new TodaysDate();
        prueba.time = "juan";
        prueba.day = 2345;
        prueba.year= 1998;
        System.out.println(prueba.time + prueba.day + prueba.year);
        prueba.printDateAndTime();
    }
}
