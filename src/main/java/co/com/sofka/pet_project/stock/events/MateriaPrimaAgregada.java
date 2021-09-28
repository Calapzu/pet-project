package co.com.sofka.pet_project.stock.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.pet_project.stock.value.CantidadMateriaPrima;
import co.com.sofka.pet_project.stock.value.MateriaPrimaId;
import co.com.sofka.pet_project.stock.value.NombreMateriaPrima;

public class MateriaPrimaAgregada extends DomainEvent {

    private final MateriaPrimaId entityId;
    private final NombreMateriaPrima nombreMateriaPrima;
    private final CantidadMateriaPrima cantidadMateriaPrima;

    //MateriaPrimaId entityId, NombreMateriaPrima nombreMateriaPrima, CantidadMateriaPrima cantidadMateriaPrima
    public MateriaPrimaAgregada(MateriaPrimaId entityId, NombreMateriaPrima nombreMateriaPrima, CantidadMateriaPrima cantidadMateriaPrima) {
        super("sofka.stock.materiaprimaagregada");
        this.entityId = entityId;
        this.nombreMateriaPrima = nombreMateriaPrima;
        this.cantidadMateriaPrima = cantidadMateriaPrima;
    }

    public MateriaPrimaId getEntityId() {
        return entityId;
    }

    public NombreMateriaPrima getNombreMateriaPrima() {
        return nombreMateriaPrima;
    }

    public CantidadMateriaPrima getCantidadMateriaPrima() {
        return cantidadMateriaPrima;
    }
}
