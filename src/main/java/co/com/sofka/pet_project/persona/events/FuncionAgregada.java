package co.com.sofka.pet_project.persona.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.pet_project.persona.value.CaracteristicaFuncion;
import co.com.sofka.pet_project.persona.value.DescripcionFuncion;
import co.com.sofka.pet_project.persona.value.FuncionId;

public class FuncionAgregada extends DomainEvent {

    private final FuncionId entityId;
    private final CaracteristicaFuncion caracteristica;
    private final DescripcionFuncion descripcion;

    public FuncionAgregada(FuncionId entityId, CaracteristicaFuncion caracteristica, DescripcionFuncion descripcion) {
        super("sofka.persona.funcionAgregada");
        this.entityId = entityId;
        this.caracteristica = caracteristica;
        this.descripcion = descripcion;
    }

    public FuncionId getFuncionId() {
        return entityId;
    }

    public CaracteristicaFuncion getCaracteristica() {
        return caracteristica;
    }

    public DescripcionFuncion getDescripcion() {
        return descripcion;
    }
}
