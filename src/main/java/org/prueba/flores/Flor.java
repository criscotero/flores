package org.prueba.flores;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Flor {

    @Id
    @SequenceGenerator(
            name = "flor_id_sequence",
            sequenceName = "flor_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "flor_id_sequence"
    )
    private  String id;

    private  String name;
    private  Double price;
}
