package co.com.sofka.pet_project.persona.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class DescripcionFuncion implements ValueObject<String> {
    private final String value;

    public DescripcionFuncion(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("La descripcion no puede estar vacia");
        }

        if (this.value.length() <= 5){
            throw new IllegalArgumentException("Debes de tener mayor a 5 caracteres");
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DescripcionFuncion that = (DescripcionFuncion) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String value() {
        return value;
    }
}
