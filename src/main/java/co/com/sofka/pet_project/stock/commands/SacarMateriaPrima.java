package co.com.sofka.pet_project.stock.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.pet_project.stock.value.CantidadMateriaPrima;
import co.com.sofka.pet_project.stock.value.MateriaPrimaId;

public class SacarMateriaPrima extends Command {

    private final MateriaPrimaId entityId;
    private final CantidadMateriaPrima cantidadMateriaPrima;

    public SacarMateriaPrima(MateriaPrimaId entityId, CantidadMateriaPrima cantidadMateriaPrima) {
        this.entityId = entityId;
        this.cantidadMateriaPrima = cantidadMateriaPrima;
    }

    public MateriaPrimaId getEntityId() {
        return entityId;
    }

    public CantidadMateriaPrima getCantidadMateriaPrima() {
        return cantidadMateriaPrima;
    }
}
