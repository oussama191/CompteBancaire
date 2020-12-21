import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyInterface extends Remote {

     double crediter(double solde,double x)throws RemoteException;
    double debiter(double solde,double x)throws RemoteException;
    double lireSolde (double solde)throws RemoteException;
}