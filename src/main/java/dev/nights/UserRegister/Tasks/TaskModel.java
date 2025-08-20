package dev.nights.UserRegister.Tasks;

import dev.nights.UserRegister.Users.UserModel;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_tasks ")
public class TaskModel {
    @Id //creating an id for the model
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    private String name;

    private String area;

    @OneToMany(mappedBy = "task") //one task can be assigned to many users
    private List<UserModel> user;

}
