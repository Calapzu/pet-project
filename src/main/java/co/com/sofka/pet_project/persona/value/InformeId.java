package co.com.sofka.pet_project.persona.value;

import co.com.sofka.domain.generic.Identity;

public class InformeId extends Identity {
    public InformeId(){
    }

    private InformeId(String id){
        super(id);
    }

    public static InformeId of(String id){
        return new InformeId(id);
    }
}
