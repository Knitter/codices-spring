package eu.sergiolopes.codices.models;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Format {

    // TABLE format
    //TODO: UNIQUE (type, name),

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String type;
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owned_by_id")
    private Account owner;

    @OneToMany
    private Set<Item> items;

    public Format() {
        //DO NOTHING
    }

    public Format(String type, String name, Account owner) {
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        if (!(o instanceof Format)) return false;

        return Objects.equals(getId(), ((Format) o).getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}
