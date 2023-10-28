package com.mitocode.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import com.mitocode.model.Camisa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Nombre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idNombre;

    private String Nombre;

    private String Posicion;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "camisa_ent", 
      joinColumns = 
        { @JoinColumn(name = "idNombre", referencedColumnName = "idNombre") },
      inverseJoinColumns = 
        { @JoinColumn(name = "idCamisa", referencedColumnName = "idCamisa") })
    private Camisa camisa;



//     @OneToOne(fetch = FetchType.EAGER)
//     @JoinTable(name = "menu_role",
//             joinColumns = @JoinColumn(name = "id_menu", referencedColumnName = "idMenu"),
//             inverseJoinColumns = @JoinColumn(name = "id_role", referencedColumnName = "idRole"))
//     private List<Role> roles;
// }

}
