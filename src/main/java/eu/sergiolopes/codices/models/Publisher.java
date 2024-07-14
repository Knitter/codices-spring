package eu.sergiolopes.codices.models;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @Lob
    private String summary;
    private String website;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owned_by_id")
    private Account owner;

    @OneToMany
    private Set<Item> items;

    public Publisher() {
        //DO NOTHING
    }

    public Publisher(String name, Account owner) {
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

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
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
        if (!(o instanceof Publisher)) return false;

        return Objects.equals(getId(), ((Publisher) o).getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}
