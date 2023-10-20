package app.launchthis.booksnbeer.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Beer extends PanacheEntity {

    public String name;
    public String style;

    @ManyToOne
    public Brewery brewery;
}
