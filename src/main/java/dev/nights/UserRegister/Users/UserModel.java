package dev.nights.UserRegister.Users;


import dev.nights.UserRegister.Tasks.TaskModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@Entity
@Table(name = "tb_user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public  class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_DB")
    private String name;

    @Column(unique = true, name = "email_DB")
    private String email;

    @Column(name = "age_DB")
    private int age;

    @ManyToOne // define many tasks to one user
    @JoinColumn(name = "task_id") //foreign key
    private TaskModel task;
}
