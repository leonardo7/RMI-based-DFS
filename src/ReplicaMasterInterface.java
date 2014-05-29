import java.io.IOException;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;


public interface ReplicaMasterInterface extends ReplicaInterface{
	
	/**
	 * creates the file at the replica server 
	 * @param fileName
	 * @throws IOException 
	 */
	void createFile(String fileName) throws RemoteException, IOException;
	
	/**
	 * makes the current replica the master of the passed file
	 * @param fileName 
	 * @param slaveReplicas another replicas having the files
	 * @throws NotBoundException 
	 */
	void takeCharge(String fileName, List<ReplicaLoc> slaveReplicas) throws RemoteException, NotBoundException ;
	
	/**
	 * @return true if the replica alive and received the call .. no return otherwise,
	 */
	boolean isAlive() throws RemoteException;
	
}
