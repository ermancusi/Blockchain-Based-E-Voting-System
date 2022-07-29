package src.BlockChainPackage;

import java.io.Serializable;

/**
 *
 * @author Speranza
 */

public class Block<T> implements Serializable{
    
    // attualmente il blocco è fatto da una sola transazione    
    private T data; 

    public Block(T data) {
        this.data = data;
    }
    
    
    /*
    Se decidessimo in futuro di avere blocchi con più transazioni
    
    List<Transaction> listTransactions;
    
    // costruttore
    public Block() {
        listTransactions = new ArrayList<>();
    }
    
    void addTransaction(Transaction t) {
        listTransactions.add(t);
    }
    */

    @Override
    public String toString() {
        return "\n==== Block ====\n" + data + "\n=============\n";
    }
    
}
