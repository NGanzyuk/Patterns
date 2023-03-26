import Persons.Person;

public class Main {
    public static void main(String[] args) throws Person.IllegalStateException, Person.IllegalArgumentException {
        Person mom = new Person.PersonBuilder()
                .setName("Анна")
                .setLastname("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();
        Person son = new Person.PersonBuilder().newChildBuilder()
                .setName("Антошка")
                .setLastname("Вольф")
                .build();
        System.out.println("У " + mom + " есть сын, " + son);

        try {
            // Не хватает обязательных полей
            new Person.PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            // Возраст недопустимый
            new Person.PersonBuilder()
                    .setName("Анна")
                    .setLastname("Вольф")
                    .setAge(-100)
                    .build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
