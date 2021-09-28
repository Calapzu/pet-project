package co.com.sofka.pet_project.jefe.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.pet_project.jefe.value.Descripcion;
import co.com.sofka.pet_project.jefe.value.FuncionId;

public class DescripcionDeFuncionActualizada extends DomainEvent {

    private final FuncionId entityId;
    private final Descripcion descripcion;

    public DescripcionDeFuncionActualizada(FuncionId entityId, Descripcion descripcion) {
        super("sofka.jefe.descripciondefuncionactualizada");
        this.entityId = entityId;
        this.descripcion = descripcion;
    }

    public FuncionId getEntityId() {
        return entityId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
