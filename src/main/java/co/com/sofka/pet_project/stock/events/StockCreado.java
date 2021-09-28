package co.com.sofka.pet_project.stock.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.pet_project.stock.value.NombreStock;

public class StockCreado extends DomainEvent {

    private final NombreStock nombreStock;

    public StockCreado(NombreStock nombreStock) {
        super("sofka.stock.stockcreado");
        this.nombreStock = nombreStock;
    }

    public NombreStock getNombreStock() {
        return nombreStock;
    }
}
