package dev.nights.UserRegister.Tasks;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.nights.UserRegister.Users.UserModel;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_tasks ")
public class TaskModel {

    @Id //creating an id for the model
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @Column(name = "taskname_DB")
    private String name;

    @Column(name = "area_DB")
    private String area;

    @OneToMany(mappedBy = "task") //one task can be assigned to many users
    @JsonIgnore
    private List<UserModel> user;

}
