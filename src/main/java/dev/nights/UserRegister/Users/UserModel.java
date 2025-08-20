package dev.nights.UserRegister.Users;


import dev.nights.UserRegister.Tasks.TaskModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    private int age;

    @ManyToOne // define many tasks to one user
    @JoinColumn(name = "task_id") //foreign key
    private TaskModel task;
}
