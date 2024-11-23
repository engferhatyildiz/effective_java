package design_patterns.builder;

/**
 * Builder Deseni Kullanımı
 * Karmaşık Nesnelerin Oluşturulması: Çok fazla parametreye sahip nesneler oluşturuluyorsa.
 * Nesnelerin Değişik Versiyonlarının Oluşturulması: Farklı kombinasyonlarda nesneler oluşturmak gerekliyse.
 * Kodun Okunabilirliğini Artırmak: Constructor (yapıcı metod) kullanımı karmaşıksa veya parametrelerin sırasını takip etmek zorlaşmışsa.
 * zorunlu alanlar dışında opsiyonel alanlar da varsa
 */
public class Computer {
    private String processor;
    private int ram;
    private int storage;
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    public Computer(Builder builder) {
        this.processor = builder.processor;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", isGraphicsCardEnabled=" + isGraphicsCardEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }

    public static class Builder {
        private String processor;
        private int ram;
        private int storage;
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public Builder(String processor, int ram) {
            this.processor = processor;
            this.ram = ram;
        }

        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public Builder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "processor='" + processor + '\'' +
                    ", ram=" + ram +
                    ", storage=" + storage +
                    ", isGraphicsCardEnabled=" + isGraphicsCardEnabled +
                    ", isBluetoothEnabled=" + isBluetoothEnabled +
                    '}';
        }
    }
}

/**
 * Ne Zaman Kullanılmalı?
 * Birden fazla parametre ile bir nesne oluşturuluyorsa.
 * Parametrelerin kombinasyonu karmaşıksa (örn. isteğe bağlı bazı özellikler).
 * Kodun ileride genişletilmesi gerekiyorsa (yeni parametreler kolayca eklenebilir).
 */
class Main {
    public static void main(String[] args) {

        Computer gamingPc = new Computer.Builder("Intel i7",16)
                .setStorage(512).setGraphicsCardEnabled(true).setBluetoothEnabled(true).build();

        Computer officePc = new Computer.Builder("Ryzen 7 ",8)
                .setStorage(256).build();


        System.out.println(gamingPc);
        System.out.println(officePc);

    }
}
