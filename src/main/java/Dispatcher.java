import Clientes.Cliente;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class Dispatcher {

    private static final int MAX = 10;

    private ExecutorService executor = Executors.newFixedThreadPool(10);

    ReentrantLock lock = new ReentrantLock();

    public void dispatchCall(Cliente cliente) {
        lock.lock();
        try {
            //executor.submit();
        } finally {
            lock.unlock();
        }

    }

    Runnable readTask = () -> {

        try {
            System.out.println("fdi");
        } finally {

        }
    };
}
