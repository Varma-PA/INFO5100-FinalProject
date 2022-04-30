package org.northeastern.charity.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;

@Entity
@Table(name = "PersonTable")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class Person {

    @Id
    @Column(name = "id")
    private int personId;

    @Column(name = "name")
    private String personName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Person person = (Person) o;
        return false;
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
