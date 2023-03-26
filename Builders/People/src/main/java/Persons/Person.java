package Persons;

public class Person {
    protected String firstName;
    protected String lastName;
    protected int age;
    protected String factAddress;

    private Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    private Person(String firstName, String lastName, int age, String factAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.factAddress = factAddress;
    }

    public boolean hasAge() {
        return age == 0;
    }

    public boolean hasFactAddress() {
        return factAddress.equals(null);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getFactAddress() {
        return factAddress;
    }

    @Override
    public String toString() {
        return "Имя " + firstName +
                " Фамилия " + lastName +
                " Возраст " + age +
                " Адрес " + factAddress;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static class PersonBuilder {
        protected String firstName;
        protected String lastName;
        protected int age;
        protected String factAddress;

        public PersonBuilder setName(String name) {
            this.firstName = name;
            return this;
        }

        public PersonBuilder setLastname(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder setAddress(String factAddress) {
            this.factAddress = factAddress;
            return this;
        }

        public Person build() throws IllegalStateException, IllegalArgumentException {
            if (firstName == null && lastName == null) {
                throw new IllegalStateException("Для создания объекта не хватает данных");
            } else {
                if (age == 0 && factAddress == null) {
                    return new Person(firstName, lastName);
                } else if (age != 0) {
                    if (age <= 0 || age > 130) {
                        throw new IllegalArgumentException("Введен недопустимый возраст");
                    }
                    if (factAddress == null) {
                        return new Person(firstName, lastName, age);
                    } else {
                        return new Person(firstName, lastName, age, factAddress);
                    }
                }
            }
            return null;
        }

        public PersonBuilder newChildBuilder() {
            return new PersonBuilder();
        }

    }

    public static class IllegalStateException extends Exception {

        public IllegalStateException(String msg) {
            super(msg);
        }
    }

    public static class IllegalArgumentException extends Exception {

        public IllegalArgumentException(String msg) {
            super(msg);
        }
    }

}
