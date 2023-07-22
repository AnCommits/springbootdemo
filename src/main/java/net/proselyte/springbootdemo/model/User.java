package net.proselyte.springbootdemo.model;

import jakarta.persistence.*;
import lombok.Data;

@Data // класс будет иметь геттеры, сеттеры, конструктор, toString
@Entity // сущность связана с БД
@Table(name = "users") // сущность связана с таблицей users
public class User {
    @Id // поле id является первичным ключом
    @GeneratedValue(strategy = GenerationType.IDENTITY) // автоинкремент
    private Long id; // имя колонки совпадает с именем поля сущности

    @Column(name = "first_name") // имя колонки в БД
    private String firstname;

    @Column(name = "last_name") // имя колонки в БД
    private String lastname;
}
