package co.com.sofka.pet_project.stock.value;

import co.com.sofka.domain.generic.Identity;

public class StockId extends Identity {
    public StockId(){
    }

    private StockId(String id){
        super(id);
    }

    public static StockId  of(String id){
        return new StockId(id);
    }
}
