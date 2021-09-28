package co.com.sofka.pet_project.stock.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.pet_project.stock.value.CantidadMateriaPrima;
import co.com.sofka.pet_project.stock.value.MateriaPrimaId;
import co.com.sofka.pet_project.stock.value.NombreMateriaPrima;

public class MateriaPrimaSacada extends DomainEvent {

    private final MateriaPrimaId materiaPrimaId;
    private final CantidadMateriaPrima cantidadMateriaPrima;

    public MateriaPrimaSacada(MateriaPrimaId materiaPrimaId, CantidadMateriaPrima cantidadMateriaPrima) {
        super("sofka.stock.materiaprimasacada");
        this.materiaPrimaId = materiaPrimaId;
        this.cantidadMateriaPrima = cantidadMateriaPrima;
    }

    public MateriaPrimaId getMateriaPrimaId() {
        return materiaPrimaId;
    }

    public CantidadMateriaPrima getCantidadMateriaPrima() {
        return cantidadMateriaPrima;
    }
}
