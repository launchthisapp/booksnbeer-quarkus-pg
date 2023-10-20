package app.launchthis.booksnbeer.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;

@Entity
public class Brewery extends PanacheEntity {

    public String name;
    public String state;
}
