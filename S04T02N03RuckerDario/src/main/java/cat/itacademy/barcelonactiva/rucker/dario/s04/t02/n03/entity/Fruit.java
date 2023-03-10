package cat.itacademy.barcelonactiva.rucker.dario.s04.t02.n03.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(value = "fruits")
@Data @Builder @AllArgsConstructor @NoArgsConstructor
public class Fruit {


    @Id
    private String id;
    private String name;
    private String quantityKilos;
}
