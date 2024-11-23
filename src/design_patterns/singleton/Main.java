package design_patterns.singleton;

/**
 * Singleton Tasarım Deseni, bir sınıfın yalnızca bir örneğinin olmasını garanti eder ve bu örneğe küresel bir erişim noktası sağlar. Özellikle küresel durum veya kaynak yönetimi gereken durumlarda kullanılır (örneğin: konfigürasyon dosyaları, loglama, thread pool, cache).
 * Lazy basic hali thred safe değildir!
 */


public class Main {
    public static void main(String[] args) {

        new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Hashcode of Lazy: " + Lazy.getInstance().hashCode());
                System.out.println("Hashcode of Eager: " + Eager.getInstance().hashCode());
                System.out.println("Hashcode of Enum: " + Enum.INSTANCE.hashCode());
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Hashcode of Lazy: " + Lazy.getInstance().hashCode());
                System.out.println("Hashcode of Eager: " + Eager.getInstance().hashCode());
                System.out.println("Hashcode of Enum: " + Enum.INSTANCE.hashCode());
            }
        }).start();

    }
}
