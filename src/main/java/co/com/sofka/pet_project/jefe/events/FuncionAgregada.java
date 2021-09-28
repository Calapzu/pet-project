package co.com.sofka.pet_project.jefe.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.pet_project.jefe.value.Caracteristica;
import co.com.sofka.pet_project.jefe.value.Descripcion;
import co.com.sofka.pet_project.jefe.value.FuncionId;

public class FuncionAgregada extends DomainEvent {

    private final FuncionId entityId;
    private final Caracteristica caracteristica;
    private final Descripcion descripcion;

    public FuncionAgregada(FuncionId entityId, Caracteristica caracteristica, Descripcion descripcion) {
        super("sofka.jefe.funcionagregada");
        this.entityId = entityId;
        this.caracteristica = caracteristica;
        this.descripcion = descripcion;
    }

    public FuncionId getEntityId() {
        return entityId;
    }

    public Caracteristica getCaracteristica() {
        return caracteristica;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
