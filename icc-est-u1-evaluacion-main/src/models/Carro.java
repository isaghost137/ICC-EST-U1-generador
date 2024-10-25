package models;

public class Carro {
    private String name;
    private String model;
    private int year;

    public Carro(String name, String model, int year) {
        this.name = name;
        this.model = model;
        this.year = year;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Nombre invalido.");
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 1885) {
            this.year = year;
        } else {
            System.out.println("Anio invalido.");
        }
    }

    @Override
    public String toString() {
        return "Carro [Nombre: " + name + ", Modelo: " + model + ", Año: " + year + "]";
    }
}
