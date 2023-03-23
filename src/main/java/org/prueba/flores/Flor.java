package org.prueba.flores;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;

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
    private  Integer id;

    private  String name;
    private  Double price;
}
