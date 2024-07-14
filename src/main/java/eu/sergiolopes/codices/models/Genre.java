package eu.sergiolopes.codices.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Genre {

    //TABLE genre

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owned_by_id")
    private Account owner;

    public Genre() {
        //DO NOTHING
    }

    public Genre(String name, Account owner) {
        this.name = name;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Account getOwner() {
        return owner;
    }

    public void setOwner(Account owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Genre)) return false;

        return Objects.equals(getId(), ((Genre) o).getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

//CREATE TABLE item_genre
//(
//    itemId  INTEGER NOT NULL,
//    genreId INTEGER NOT NULL,
//    PRIMARY KEY (itemId, genreId),
//    FOREIGN KEY (itemId) REFERENCES item (id),
//    FOREIGN KEY (genreId) REFERENCES genre (id)
//);
}
