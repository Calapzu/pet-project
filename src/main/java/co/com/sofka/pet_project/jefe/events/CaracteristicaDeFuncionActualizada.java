package co.com.sofka.pet_project.jefe.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.pet_project.jefe.value.Caracteristica;
import co.com.sofka.pet_project.jefe.value.FuncionId;

public class CaracteristicaDeFuncionActualizada extends DomainEvent {

    private final FuncionId entityId;
    private final Caracteristica caracteristica;

    public CaracteristicaDeFuncionActualizada(FuncionId entityId, Caracteristica caracteristica) {
        super("sofka.jefe.caracteristicasdefuncionactualizada");
        this.entityId = entityId;
        this.caracteristica = caracteristica;
    }

    public FuncionId getEntityId() {
        return entityId;
    }

    public Caracteristica getCaracteristica() {
        return caracteristica;
    }
}
