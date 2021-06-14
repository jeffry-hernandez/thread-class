// Definiendo un hilo
class Mihilo extends Thread {
    public void run() {
        // acciones que se ejecutan dentro del hilo
        System.out.println("Dentro de mi hilo");
    }
}

class Main {
    public static void main(String[] args) {
        // Creando un nuevo hilo e iniciandolo
        Mihilo t = new Mihilo();
        t.start();
        // Cambio en la prioridad del hilo
        t.setPriority(Thread.MAX_PRIORITY);
        // t.setPriority(Thread.MIN_PRIORITY);
        try {
            // Causamos que el hilo detenga su ejecucion
            t.sleep(1000); // 1000 milliseconds
        } catch (InterruptedException e) {
            e.getMessage();
        }
        System.out.println("Dentro del metodo main");
    }
}
