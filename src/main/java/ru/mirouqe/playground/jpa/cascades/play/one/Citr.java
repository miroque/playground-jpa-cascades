package ru.mirouqe.playground.jpa.cascades.play.one;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Citr {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_citr")
    @SequenceGenerator(name = "gen_citr", sequenceName = "seq_citr", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Integer id;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "key_baz")
    @ToString.Exclude
    private Baz baz;

}
