package design_patterns.factory;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Ne Zaman Tercih Edilmeli?
 * Basit bir nesne yaratımıyla sınırlı kalınmayacaksa.
 * Singleton veya Immutable sınıflar için.
 * Nesne yönetiminin kontrol edilmesi gerekiyorsa (ör. cache).
 * Alt türlerin dinamik olarak döndürülmesi gerekiyorsa.
 * Static Factory Method, esnekliği ve kontrol mekanizmalarıyla güçlü bir tasarım deseni olsa da, kullanım yeri ve amacını iyi belirlemek önemlidir.
 */
public class Main {
    public static void main(String[] args) {
        User standartUser = User.createStandartUser("standart_user");
        User adminUser = User.createAdminUser("admin_user");

        System.out.println(standartUser);
        System.out.println(adminUser);

        //Alt türlerin dinamik olarak döndürülmesi gerekiyorsa.

        Shape shape = Shape.getShape("circle");
        shape.draw(); // Output: Drawing a circle.



    }
}
