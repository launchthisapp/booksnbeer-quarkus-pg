package app.launchthis.booksnbeer.model;


import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Book extends PanacheEntity {

    public String name;

    @ManyToOne
    public Author author;
}
