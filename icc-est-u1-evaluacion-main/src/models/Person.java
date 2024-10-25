package models;

public class Person {

    private String name;
    private int age;
    private int height;
    
    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Nombre inválido. No se ha modificado.");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Edad inválida. No se ha modificado.");
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Altura inválida. No se ha modificado.");
        }
    }

    @Override
    public String toString() {
        return "Person [Nombre: " + name + ", Edad: " + age + " años, Altura: " + height + " cm]";
    }
}
