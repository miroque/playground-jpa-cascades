package ru.mirouqe.playground.jpa.cascades.play.one;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Ageo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    //*****************************************************************

//    @OneToMany(mappedBy = "ageo", fetch = FetchType.LAZY)
//    List<Baz> bazs;
}
