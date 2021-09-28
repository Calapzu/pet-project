package co.com.sofka.pet_project.stock.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.pet_project.stock.value.CantidadProducto;
import co.com.sofka.pet_project.stock.value.NombreProducto;
import co.com.sofka.pet_project.stock.value.ProductoId;

public class ProductoAgregado extends DomainEvent {

    private final ProductoId entityId;
    private final NombreProducto nombreProducto;
    private final CantidadProducto cantidadProducto;


    public ProductoAgregado(ProductoId entityId, NombreProducto nombreProducto, CantidadProducto cantidadProducto) {
        super("sofkia.stock.productoagregado");
        this.entityId = entityId;
        this.nombreProducto = nombreProducto;
        this.cantidadProducto = cantidadProducto;
    }

    public ProductoId getEntityId() {
        return entityId;
    }

    public NombreProducto getNombreProducto() {
        return nombreProducto;
    }

    public CantidadProducto getCantidadProducto() {
        return cantidadProducto;
    }
}
