package eu.sergiolopes.codices.models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * A paper book, ebook or audiobook managed by Codices
 */
@Entity
public class Item {

    // TABLE item

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String type;
    private boolean translated;
    private boolean read;

    @Column(name = "copies")
    private int noOfCopies;

    private String subtitle;
    private String originalTitle;

    @Lob
    private String plot;
    private String isbn;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "format_id")
    private Format format;
    private int pageCount;

    @Temporal(TemporalType.TIMESTAMP)
    private Date publishDate;

    private int publishYear;

    @Temporal(TemporalType.TIMESTAMP)
    private Date addedOn;

    private String language;
    private String edition;
    private String volume;
    private int rating;
    private String url;

    @Lob
    private String review;
    private String cover;
    private String filename;
    private String fileLocation;
    private String narrator;
    private String illustrator;
    private String dimensions;
    private String physicalLocation;
    private String loanedTo;

    @Temporal(TemporalType.TIMESTAMP)
    private Date loanedDate;
    private String borrowedFrom;

    @Temporal(TemporalType.TIMESTAMP)
    private Date borrowedDate;
    private String bitrate;
    private String purchasedFrom;

    @Temporal(TemporalType.TIMESTAMP)
    private Date purchasedOn;
    private int duration;
    private int sizeBytes;
    private int orderInSeries;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "owned_by_id")
    private Account owner;

    @ManyToOne()
    @JoinColumn(name = "publisher_id")
    private Publisher publisher;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "series_id")
    private Series series;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "collection_id")
    private Collection collection;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "duplicates_id")
    private Item duplicate;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "item_author", joinColumns = @JoinColumn(name = "item_id"), inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<Author> authors;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "item_genre", joinColumns = @JoinColumn(name = "item_id"), inverseJoinColumns = @JoinColumn(name = "genre_id"))
    private Set<Genre> genres;

    public Item() {
        //DO NOTHING
    }

    public boolean addAuthor(Author author) {
        if (authors == null) {
            authors = new HashSet<>();
        }

        if (authors.contains(author)) {
            return true;
        }
        return authors.add(author);
    }

    public boolean removeAuthor(Author author) {
        if (authors.contains(author)) {
            return authors.remove(author);
        }

        return false;
    }

    public boolean addGenre(Genre genre) {
        if (genres == null) {
            genres = new HashSet<>();
        }

        if (genres.contains(genre)) {
            return true;
        }
        return genres.add(genre);
    }

    public boolean removeGenre(Genre genre) {
        if (genres.contains(genre)) {
            return genres.remove(genre);
        }

        return false;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isTranslated() {
        return translated;
    }

    public void setTranslated(boolean translated) {
        this.translated = translated;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public int getNoOfCopies() {
        return noOfCopies;
    }

    public void setNoOfCopies(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Format getFormat() {
        return format;
    }

    public void setFormat(Format format) {
        this.format = format;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public Date getAddedOn() {
        return addedOn;
    }

    public void setAddedOn(Date addedOn) {
        this.addedOn = addedOn;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFileLocation() {
        return fileLocation;
    }

    public void setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }

    public String getIllustrator() {
        return illustrator;
    }

    public void setIllustrator(String illustrator) {
        this.illustrator = illustrator;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public String getPhysicalLocation() {
        return physicalLocation;
    }

    public void setPhysicalLocation(String physicalLocation) {
        this.physicalLocation = physicalLocation;
    }

    public String getLoanedTo() {
        return loanedTo;
    }

    public void setLoanedTo(String loanedTo) {
        this.loanedTo = loanedTo;
    }

    public Date getLoanedDate() {
        return loanedDate;
    }

    public void setLoanedDate(Date loanedDate) {
        this.loanedDate = loanedDate;
    }

    public String getBorrowedFrom() {
        return borrowedFrom;
    }

    public void setBorrowedFrom(String borrowedFrom) {
        this.borrowedFrom = borrowedFrom;
    }

    public Date getBorrowedDate() {
        return borrowedDate;
    }

    public void setBorrowedDate(Date borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    public String getBitrate() {
        return bitrate;
    }

    public void setBitrate(String bitrate) {
        this.bitrate = bitrate;
    }

    public String getPurchasedFrom() {
        return purchasedFrom;
    }

    public void setPurchasedFrom(String purchasedFrom) {
        this.purchasedFrom = purchasedFrom;
    }

    public Date getPurchasedOn() {
        return purchasedOn;
    }

    public void setPurchasedOn(Date purchasedOn) {
        this.purchasedOn = purchasedOn;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getSizeBytes() {
        return sizeBytes;
    }

    public void setSizeBytes(int sizeBytes) {
        this.sizeBytes = sizeBytes;
    }

    public int getOrderInSeries() {
        return orderInSeries;
    }

    public void setOrderInSeries(int orderInSeries) {
        this.orderInSeries = orderInSeries;
    }

    public Account getOwner() {
        return owner;
    }

    public void setOwner(Account owner) {
        this.owner = owner;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    public Collection getCollection() {
        return collection;
    }

    public void setCollection(Collection collection) {
        this.collection = collection;
    }

    public Item getDuplicate() {
        return duplicate;
    }

    public void setDuplicate(Item duplicate) {
        this.duplicate = duplicate;
    }

    public Set<Author> getAuthors() {
        return Set.copyOf(authors);
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    public Set<Genre> getGenres() {
        return Set.copyOf(genres);
    }

    public void setGenres(Set<Genre> genres) {
        this.genres = genres;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;

        return Objects.equals(getId(), ((Item) o).getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    public enum Type {
        EBOOK("ebook"),
        AUDIO("audio"),
        PAPER("paper");

        private final String value;

        Type(String v) {
            value = v;
        }

        @Override
        public String toString() {
            return value;
        }
    }
}
