package co.com.sofka.pet_project.persona.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.pet_project.stock.value.StockId;

public class StockAsociado extends DomainEvent {

    private final StockId stockId;

    public StockAsociado(StockId stockId) {
        super("sofka.persona.stockasociado");
        this.stockId = stockId;
    }

    public StockId getStockId() {
        return stockId;
    }
}
