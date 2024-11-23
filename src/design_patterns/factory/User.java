package design_patterns.factory;

/**
 * Özellikleri:
 * Statik bir yöntemdir, yani sınıfın bir örneği olmadan çağrılabilir.
 * Genellikle createInstance, getInstance, of, valueOf veya benzeri adlarla adlandırılır.
 * Constructor'lara alternatif olarak kullanılır, ancak constructor'ların yerine geçmez (bir sınıfta hem constructor hem de static factory method bulunabilir).
 */
public class User {
    private String userName;
    private String role;

    // Not accesible directly
    private User(String userName, String role) {
        this.userName = userName;
        this.role = role;
    }

    public static User createStandartUser(String userName) {
       return new User(userName, "Standart");
    }

    public static User createAdminUser(String userName) {
        return new User(userName, "Admin");
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
