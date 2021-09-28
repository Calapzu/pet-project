package co.com.sofka.pet_project.stock.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.pet_project.stock.value.CantidadProducto;
import co.com.sofka.pet_project.stock.value.NombreProducto;
import co.com.sofka.pet_project.stock.value.ProductoId;

public class ProductoSacado extends DomainEvent {

    private final ProductoId productoId;
    private final CantidadProducto cantidadProducto;

    public ProductoSacado(ProductoId productoId, CantidadProducto cantidadProducto) {
        super("sofka.producto.productosacado");
        this.productoId = productoId;
        this.cantidadProducto = cantidadProducto;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public CantidadProducto getCantidadProducto() {
        return cantidadProducto;
    }
}
