package tn.esprit.foyeresprit.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long idFoyer;
    private String nom;
    private String adresse;
  @OneToOne(mappedBy = "u")
    private Universite u;
  @OneToMany
  List<Bloc> b ;
  @OneToMany
    Set<Chambre>c;


}
