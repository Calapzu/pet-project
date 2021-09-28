package co.com.sofka.pet_project.stock.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombreMateriaPrima implements ValueObject<String> {

    private final String value;

    public NombreMateriaPrima(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("El nombre no puede estar vacio ");
        }
        if (this.value.length() <= 4){
            throw new IllegalArgumentException("Debes de tener mayor a 4 caracteres");
        }
        if (this.value.length() >= 100){
            throw new IllegalArgumentException("Debes de tener menor a 100 caracteres");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NombreMateriaPrima that = (NombreMateriaPrima) o;
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
