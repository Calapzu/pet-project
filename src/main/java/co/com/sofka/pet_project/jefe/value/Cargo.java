package co.com.sofka.pet_project.jefe.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Cargo implements ValueObject<String> {

    private final String value;

    public Cargo(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("El cargo no puede estar vacio");
        }
        if (this.value.length() <= 4){
            throw new IllegalArgumentException("Debes de tener mayor a 4 caracteres");
        }
        if (this.value.length() >= 100){
            throw new IllegalArgumentException("Debes de tener menor a 100 caracteres");
        }
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cargo cargo = (Cargo) o;
        return Objects.equals(value, cargo.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
