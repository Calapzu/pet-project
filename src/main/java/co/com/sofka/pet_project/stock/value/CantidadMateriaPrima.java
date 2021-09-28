package co.com.sofka.pet_project.stock.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CantidadMateriaPrima implements ValueObject<Integer> {

    private final Integer value;

    public CantidadMateriaPrima(Integer value) {
        this.value = Objects.requireNonNull(value);
        if (this.value <= 1) {
            throw new IllegalArgumentException("No se puede agregar unja cantidad menor o igual 0");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CantidadMateriaPrima that = (CantidadMateriaPrima) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public Integer value() {
        return value;
    }
}
