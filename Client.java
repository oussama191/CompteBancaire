import java.rmi.Naming;


public class Client {

    public static void main(String[] args) {
        try {
            MyInterface service1 = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
            System.out.println(service1.lireSolde(1000));
            System.out.println(service1.crediter(1000,200));
            System.out.println(service1.debiter(1000,300));

        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(e.toString());
        }
    }

}