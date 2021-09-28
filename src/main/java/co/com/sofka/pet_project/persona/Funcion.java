package co.com.sofka.pet_project.persona;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.pet_project.persona.value.CaracteristicaFuncion;
import co.com.sofka.pet_project.persona.value.DescripcionFuncion;
import co.com.sofka.pet_project.persona.value.FuncionId;

import java.util.Objects;

public class Funcion extends Entity<FuncionId> {

    private CaracteristicaFuncion caracteristicaFuncion;
    private DescripcionFuncion descripcionFuncion;

    public Funcion(FuncionId entityId, CaracteristicaFuncion caracteristicaFuncion, DescripcionFuncion descripcionFuncion) {
        super(entityId);
        this.caracteristicaFuncion = caracteristicaFuncion;
        this.descripcionFuncion = descripcionFuncion;
    }

    public void actualizaDescripcion(DescripcionFuncion descripcion){
        this.descripcionFuncion = Objects.requireNonNull(descripcion);
    }

    public void actualizarCaracteristica(CaracteristicaFuncion caracteristica){
        this.caracteristicaFuncion = Objects.requireNonNull(caracteristica);
    }

    public CaracteristicaFuncion caracteristicaFuncion() {
        return caracteristicaFuncion;
    }

    public DescripcionFuncion descripcionFuncion() {
        return descripcionFuncion;
    }
}
