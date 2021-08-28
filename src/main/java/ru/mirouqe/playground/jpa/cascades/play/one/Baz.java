package ru.mirouqe.playground.jpa.cascades.play.one;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Baz {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_baz")
    @SequenceGenerator(name = "gen_baz", sequenceName = "seq_baz", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Integer id;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "key_ageo")
    @ToString.Exclude
    private Ageo ageo;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "baz", cascade = CascadeType.ALL)
    @Fetch(value = FetchMode.SUBSELECT)
    private List<Citr> citrs;
}
