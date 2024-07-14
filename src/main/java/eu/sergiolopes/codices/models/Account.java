package eu.sergiolopes.codices.models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;
import java.util.Set;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String email;
    private String name;
    private boolean active;
    private String password;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedOn;

    private String authKey;

    @OneToMany(mappedBy = "owner")
    private Set<Author> authors;

    @OneToMany(mappedBy = "owner")
    private Set<Collection> collections;

    @OneToMany(mappedBy = "owner")
    private Set<Format> formats;

    @OneToMany(mappedBy = "owner")
    private Set<Genre> genres;

    @OneToMany(mappedBy = "owner")
    private Set<Item> items;

    @OneToMany(mappedBy = "owner")
    private Set<Publisher> publishers;

    @OneToMany(mappedBy = "owner")
    private Set<Series> series;

    public Account() {
        active = true;
        createdOn = new Date();
    }

    public Account(String username, String email, String name) {
        this.username = username;
        this.email = email;
        this.name = name;

        active = true;
        createdOn = new Date();
    }

    public Set<Author> getAuthors() {
        return Set.copyOf(authors);
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    public Set<Collection> getCollections() {
        return Set.copyOf(collections);
    }

    public void setCollections(Set<Collection> collections) {
        this.collections = collections;
    }

    public Set<Format> getFormats() {
        return Set.copyOf(formats);
    }

    public void setFormats(Set<Format> formats) {
        this.formats = formats;
    }

    public Set<Genre> getGenres() {
        return Set.copyOf(genres);
    }

    public void setGenres(Set<Genre> genres) {
        this.genres = genres;
    }

    public Set<Item> getItems() {
        return Set.copyOf(items);
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }

    public Set<Publisher> getPublishers() {
        return Set.copyOf(publishers);
    }

    public void setPublishers(Set<Publisher> publishers) {
        this.publishers = publishers;
    }

    public Set<Series> getSeries() {
        return Set.copyOf(series);
    }

    public void setSeries(Set<Series> series) {
        this.series = series;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    public String getAuthKey() {
        return authKey;
    }

    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;

        return Objects.equals(getId(), ((Account) o).getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}
