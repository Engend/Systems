public class Main {
    public static void main(String[] args) {
        EmployeeFacade employeeFacade = new EmployeeFacade();
        employeeFacade.cleanFloor();
        employeeFacade.cook();
    }
}

//class Employee {
//    int getSalary(){return 10;}
//    void cook() {}
//    void cleanFloor() {}
//    void deliverFood() {}
//}

interface Employee {
    int getSalary();
}
class Cook implements Employee {

    void cook() {}

    public int getSalary () {
        return 0;
    }
}
class Janitor implements Employee {

    void cleanFloor() {}

    public int getSalary () {
        return 0;
    }
}

class EmployeeFacade {
    Cook cook = new Cook();
    Janitor janitor = new Janitor();
    void cook() {
        cook.cook();
    }
    void cleanFloor() {
        janitor.cleanFloor();
    }
}