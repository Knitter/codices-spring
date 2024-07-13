package eu.sergiolopes.codices.models;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    private String name;
    private String surname;

    @Lob
    private String biography;
    private String website;
    //TODO: Blob?
    private String photo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owned_by_id")
    private Account owner;

    @ManyToMany(mappedBy = "authors")
    private Set<Item> items;

    public Author() {
    }

    public Author(String name, String surname, Account owner) {
        this.name = name;
        this.surname = surname;
        this.owner = owner;
    }

    public boolean addItem(Item item) {
        if (items == null) {
            items = new HashSet<>();
        }

        if (items.contains(item)) {
            return true;
        }
        return items.add(item);
    }

    public boolean removeItem(Item item) {
        if (items.contains(item)) {
            return items.remove(item);
        }

        return false;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Account getOwner() {
        return owner;
    }

    public void setOwner(Account owner) {
        this.owner = owner;
    }

    public Set<Item> getItems() {
        return Set.copyOf(items);
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;

        return Objects.equals(getId(), ((Author) o).getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

}
