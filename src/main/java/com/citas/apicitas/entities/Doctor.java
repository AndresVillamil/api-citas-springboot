package com.citas.apicitas.entities;
import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="doctor")

public class Doctor {
    
    @Id
    @Column(name="id_profesional")
    private long idProfesional;

    @Column
    private String name;

    @Column 
    private String apellido;

    @Column
    private String correo;

    @Enumerated(EnumType.STRING)
    @Column
    private Especialidad especialidad;

    @OneToMany(mappedBy = "doctor")
    private Set<Cita> citas = new HashSet<Cita>();

    public enum Especialidad{medicina_interna, medicina_general}

}
