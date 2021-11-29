package packageOne;

import java.awt.*;

public class MyClass {
    public static void main (String[] args) {

        Person anna = new Person();
        anna.name = "Anna";
        anna.lastName = "Wilson";
        anna.year = 1990;

        System.out.println("Last name of person is "+anna.lastName);

        Person david = new Person();
        david.name = "David";
        david.lastName = "Goodman";
        david.year = 1945;
        david.year = 2313;

        System.out.println(david.year);

        Person fonger = new Person();
        fonger.name = "Forger";
        fonger.lastName = "Borer";
        fonger.year = 1234;

        System.out.println(fonger.lastName);

        david.printPersonInfo();

        Person barzhan = new Person();
        barzhan.name = "Barzhan";
        barzhan.lastName = "No one";
        barzhan.year = 1980;
        barzhan.printPersonInfo();

        Person champ = new Person();
        champ.name = "CHavachek";
        champ.lastName ="Pacan";
        champ.year = 1990;

        champ.printPersonInfo();

    }
}
