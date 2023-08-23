package Models;

import java.util.UUID;

public class BaseModel {
    UUID id;

    public BaseModel(){
        this.id = UUID.randomUUID();
    }
    public UUID getId() {
        return id;
    }

}
