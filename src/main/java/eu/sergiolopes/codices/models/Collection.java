package eu.sergiolopes.codices.models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * A collection of books either created by the user or by a publisher/seller (e.g. HumbleBundle)
 */
@Entity
public class Collection {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @Temporal(TemporalType.TIMESTAMP)
    private Date publishDate;

    private int publishingYear;

    @Lob
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owned_by_id")
    private Account owner;

    @OneToMany
    private Set<Item> items;

    public Collection() {
        //DO NOTHING
    }

    public Collection(String name, Account owner) {
        this.name = name;
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

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        if (!(o instanceof Collection)) return false;

        return Objects.equals(getId(), ((Collection) o).getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}
