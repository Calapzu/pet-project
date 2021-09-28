package co.com.sofka.pet_project.stock.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.pet_project.stock.value.CantidadMateriaPrima;
import co.com.sofka.pet_project.stock.value.MateriaPrimaId;
import co.com.sofka.pet_project.stock.value.NombreMateriaPrima;

public class AgregarMateriaPrima extends Command {

    private final MateriaPrimaId entityId;
    private final NombreMateriaPrima nombreMateriaPrima;
    private final CantidadMateriaPrima cantidadMateriaPrima;

    public AgregarMateriaPrima(MateriaPrimaId entityId, NombreMateriaPrima nombreMateriaPrima, CantidadMateriaPrima cantidadMateriaPrima) {
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
