package org.tee.union.entities.body;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tenant")
@AllArgsConstructor @NoArgsConstructor
@Setter @Getter
public class Tenant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "description", length = 50, nullable = false)
    private String description;
}