package o1_intelliJ_shortcuts;

import com.github.javafaker.Faker;

public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Nazife");
        Faker faker=new Faker();
        System.out.println(faker.name().fullName());
        System.out.println(faker.chuckNorris().fact());
    }
}
