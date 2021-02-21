package am.itspace.springdemo.controller.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "user")
@Entity

public class User {

    @Id
    @GeneratedValue
    private int id;
    @Column
    private String name;
    private String surname;



}
