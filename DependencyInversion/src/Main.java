public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        client.doJob();
    }
}

interface DAO {
    void execute();
}

class DataAccess implements DAO{
    public void execute() {
        System.out.print("1");
    }
}

class Client {
    DAO dataAccess = new DataAccess();

    void doJob() {
        dataAccess.execute();
    }
}