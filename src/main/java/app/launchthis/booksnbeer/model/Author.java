package app.launchthis.booksnbeer.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;

@Entity
public class Author extends PanacheEntity {

    public String firstName;
    public String lastName;
}
