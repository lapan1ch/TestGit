package Homework;
import java.security.*;
public class Key {

    public static void main(String[] args) {

        try {
            // Генерация ключей
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048);
            KeyPair keyPair = keyPairGenerator.generateKeyPair();

            // Получение публичного и приватного ключей
            PublicKey publicKey = keyPair.getPublic();
            PrivateKey privateKey = keyPair.getPrivate();

            // Вывод публичного ключа
            System.out.println("Публичный ключ RSA:");
            System.out.println(publicKey);
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Ошибка: Невозможно создать ключ RSA.");
            e.printStackTrace();
        }
    }
}




