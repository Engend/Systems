public class Main {
    public static void main(String[] args) {
     //   Toyota toyota = new Toyota();
        Celika celika = new Celika();
        Toyota toyota = new Toyota();
        workInTaxi(celika);
        workInTaxi(toyota);
    }
    static void workInTaxi(Car car) {
        car.workInTaxi();
    }
}

interface Car {
    void workInTaxi();
}

class Toyota implements Car {
    void getPassangers() {
        System.out.println("get passangers");
    }
    public void workInTaxi () {
        getPassangers();
    }
}

class Celika extends Toyota {
    public void workInTaxi () {
        getPassanger();
    }
    void getPassanger() {
        System.out.println("get passanger");
    }
}