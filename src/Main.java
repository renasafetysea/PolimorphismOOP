import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

import static Verification.Data.verification;
public class Main {

    public static void main(String[] args) {
        Bus sprinter = new Bus("Mersedes-BENZ", "Sprinter", 250, 3.0f, Capacity.SMALL);
        System.out.println(sprinter);
        sprinter.start();
        sprinter.stop();
        sprinter.maxSpeedIs();
        System.out.println();
        Bus kursor = new Bus("LIAZ", "Kursor", 220, 1.6f, Capacity.MEDIUM);
        System.out.println(kursor);
        kursor.start();
        kursor.stop();
        kursor.bestLapTime();
        System.out.println();
        Bus mezdogorodets = new Bus("MAZ", "Mezdugorodets", 210, 2.5f, Capacity.LARGE);
        System.out.println(mezdogorodets);
        mezdogorodets.start();
        mezdogorodets.stop();
        System.out.println();
        mezdogorodets.bestLapTime();
        Bus lionCity = new Bus("MAN", "Lion city", 198, 4.1f, Capacity.VERY_LARGE);
        lionCity.start();
        lionCity.stop();
        lionCity.pitStop();
        lionCity.bestLapTime();
        System.out.println();
        Lorry abc = new Lorry("AAA", "abc", 130, 4.1f, Weight.N_1);
        System.out.println(abc);
        abc.pitStop();
        abc.start();
        abc.stop();
        System.out.println();
        Lorry cba = new Lorry("BBB", "cba", 150, 2.1f, Weight.N_2);
        System.out.println(cba);
        cba.start();
        cba.stop();
        System.out.println();
        Lorry bca = new Lorry("CCC", "bca", 170, 3.1f, Weight.N_3);
        System.out.println(bca);
        bca.start();
        bca.stop();
        System.out.println();
        Lorry cab = new Lorry("DDD", "cab", 195, 4.1f, Weight.N_1);
        System.out.println(cab);
        cab.start();
        cab.stop();
        System.out.println();
        PassengerCar lada = new PassengerCar("Lada", "Niva", 202, 2.2f, Tipe.UNIVERSAL);
        System.out.println(lada);
        lada.start();
        lada.stop();
        System.out.println();
        PassengerCar bmw = new PassengerCar("BMW", "X5", 225, 2.5f, Tipe.CROSS_OVER);
        System.out.println(bmw);
        PassengerCar reno = new PassengerCar("Reno", "Duster", 201, 4.2f, Tipe.HATCH_BACK);
        System.out.println(reno);
        PassengerCar daewoo = new PassengerCar("Daewoo", "Nexia", 209, 4.2f, Tipe.UNIVERSAL);
        System.out.println(daewoo);
        daewoo.pitStop();
        System.out.println();

        Driver<Bus> roma = new Driver<>("Рома", 6, "D");
        roma.start(sprinter);
        roma.refuel(sprinter);
        roma.stop(sprinter);
        System.out.println(roma);
        Driver<Lorry> vania = new Driver<Lorry>("Ваня", 3, "C");
        vania.competition(cab);
        Driver<PassengerCar> ura = new Driver<>("Юра", 10, "B");
        ura.competition(reno);
        service(sprinter, kursor, mezdogorodets, lionCity, abc, bca, cab, cba, lada, daewoo, reno, bmw);

        sprinter.printInfo();
        daewoo.printInfo();
        cab.printInfo();
        System.out.println(verification("ivan", "123qwe", "123qwe"));
        System.out.println(verification("Ivan", "L0256dfg", "L0256dfh"));

        List<Transport> transports = List.of(lada,bmw,reno,daewoo,sprinter,kursor,mezdogorodets,lionCity,bca,cab,cba,abc);

        Sponsor lukoil =  new Sponsor("Lukoil",50000);
        lada.addSponsor(lukoil);
        Driver<Car> ivan = new Driver<Car>("Иван Н.", 5, "B");
        lada.addDriver(ivan);

        Mechanik<Car> vova = new Mechanik<Car>("Вова", " Коваль", "Абетка");
        lada.addMechanik(vova);

        for(Transport transport : transports){
            printInfo(transport);
        }
    }

    public static void printInfo(Transport transport){
        System.out.println("Информация по автомобилю " + transport.getModel() + transport.getBrand());
        System.out.println("Водители :");
        for(Driver<?> driver : transport.getDrivers()){
            System.out.println(driver.getName());
        }
        System.out.println("Спонсоры:");
        for (Sponsor sponsor : transport.getSponsors()){
            System.out.println(sponsor.getNameCompany());
        }
        System.out.println("Механики ");
        for (Mechanik<?> mechanik: transport.getMechaniks()){
            System.out.println(mechanik.surname + mechanik.name);
        }
    }

    private static void service(Transport... transports) {
        for (Transport transport : transports) {
            serviceTransport(transport);
        }
    }

    private static void serviceTransport(Transport transport) {
        try {
            if (!transport.diagnostics()) {
                throw new RuntimeException("Автомобиль" + transport.getBrand() + transport.getModel() + " прошел диагностику.");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
