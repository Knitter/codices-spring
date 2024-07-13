package eu.sergiolopes.codices.bootstrap;

import eu.sergiolopes.codices.models.*;
import eu.sergiolopes.codices.repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * <p>Provides a set of example data created from a real library, real books and details.</p>
 * <p>It is used for demo/testing only.</p>
 *
 * <p>Offers:</p>
 * <ul>
 * <li>List of publishers (mainly paper books) and authors</li>
 * <li>List of series and book collections</li>
 * <li>List of formats and genres</li>
 * <li>Small list of books</li>
 * </ul>
 */
@Component
public class DevBootstrap implements CommandLineRunner {

    private final AccountRepository accountRepository;
    private final AuthorRepository authorRepository;
    private final ColleciontRepository collectRepository;
    private final FormatRepository formatRepository;
    private final GenreRepository genreRepository;
    private final ItemRepository itemRepository;
    private final PublisherRepository publisherRepository;
    private final SeriesRepository seriesRepository;

    public DevBootstrap(AccountRepository accountRepository, AuthorRepository authorRepository, ColleciontRepository collectRepository,
                        FormatRepository formatRepository, GenreRepository genreRepository, ItemRepository itemRepository,
                        PublisherRepository publisherRepository, SeriesRepository seriesRepository) {

        this.accountRepository = accountRepository;
        this.authorRepository = authorRepository;
        this.collectRepository = collectRepository;
        this.formatRepository = formatRepository;
        this.genreRepository = genreRepository;
        this.itemRepository = itemRepository;
        this.publisherRepository = publisherRepository;
        this.seriesRepository = seriesRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("DevBoostrap started ...");

        Account account = new Account("sergio", "Sérgio L", "knitter.is@gmail.com");
        Account sergio = accountRepository.save(account);

        Publisher publisher = new Publisher("Orion", sergio);
        publisher.setWebsite("https://www.orionbooks.co.uk/");
        Publisher orion = publisherRepository.save(publisher);

        publisher = new Publisher("Orbit", sergio);
        publisher.setWebsite("https://www.orbitbooks.net/");
        Publisher orbit = publisherRepository.save(publisher);

        publisher = new Publisher("Editorial Presença", sergio);
        publisher.setWebsite("https://www.presenca.pt/");
        Publisher presenca = publisherRepository.save(publisher);

        publisher = new Publisher("Bloomsbury", sergio);
        publisher.setWebsite("https://www.bloomsbury.com");
        Publisher bloomsbury = publisherRepository.save(publisher);

        publisher = new Publisher("Porto Editora", sergio);
        publisher.setWebsite("https://www.portoeditora.pt/");
        Publisher portoEditora = publisherRepository.save(publisher);

        publisher = new Publisher("Harper Collins", sergio);
        publisher.setWebsite("https://www.harpercollins.com/");
        Publisher harperCollins = publisherRepository.save(publisher);

        publisher = new Publisher("Harper Voyager", sergio);
        publisher.setWebsite("https://harpervoyagerbooks.co.uk/");
        Publisher harperVoyager = publisherRepository.save(publisher);

        publisher = new Publisher("Pan Macmillan", sergio);
        publisher.setWebsite("https://www.panmacmillan.com/");
        Publisher panMacmillan = publisherRepository.save(publisher);

        publisher = new Publisher("ASA", sergio);
        publisher.setWebsite("https://www.leyaeducacao.com/");
        Publisher asa = publisherRepository.save(publisher);

        publisher = new Publisher("Penguin", sergio);
        publisher.setWebsite("https://www.penguin.com/");
        Publisher penguin = publisherRepository.save(publisher);

        publisher = new Publisher("Manning", sergio);
        publisher.setWebsite("https://www.manning.com/");
        Publisher manning = publisherRepository.save(publisher);

        publisher = new Publisher("TOR Publishing Group", sergio);
        publisher.setWebsite("https://us.macmillan.com/torpublishinggroup/");
        Publisher tor = publisherRepository.save(publisher);

        Series series = new Series("The Saga of the Shadows", sergio); //1
        Series ofTheShadows = seriesRepository.save(series);

        series = new Series("Foundation", sergio); //2
        Series foundation = seriesRepository.save(series);

        series = new Series("Ciclo dos Demónios", sergio); //3
        Series cicloDosDemonios = seriesRepository.save(series);

        series = new Series("The Lightship Chronicles", sergio); //4
        Series lightshipChronicles = seriesRepository.save(series);

        series = new Series("The Riftwar Saga", sergio); //5
        Series riftwarSaga = seriesRepository.save(series);

        series = new Series("The Empire Trilogy", sergio); //6
        Series empireTrilogy = seriesRepository.save(series);

        series = new Series("Krondor's Sons", sergio); //7
        Series krondosSons = seriesRepository.save(series);

        series = new Series("The Serpentwar Saga", sergio); //8
        Series serpentwarSaga = seriesRepository.save(series);

        series = new Series("Chaoswar Saga", sergio);//9
        Series chaoswarSaga = seriesRepository.save(series);

        series = new Series("The Riftwar Legacy", sergio); //10
        Series riftwarLegacy = seriesRepository.save(series);

        series = new Series("Steelhaven", sergio); //11
        Series steelhaven = seriesRepository.save(series);

        series = new Series("Saga A Espada da Verdade", sergio); //12
        Series sagaEspadaVerdade = seriesRepository.save(series);

        Collection collection = new Collection("Reading List", sergio); //1
        Collection readingList = collectRepository.save(collection);

        collection = new Collection("Favorite", sergio); //2
        Collection favorite = collectRepository.save(collection);

        collection = new Collection("Steven Erikson's Malazan Book of the Fallen", sergio); //3
        Collection steven = collectRepository.save(collection);

        collection = new Collection("Math for Programmers 2023", sergio); //4
        Collection mathForProgrammers = collectRepository.save(collection);

        Author author = new Author("Scott", "Adams", sergio); //1
        Author scottAdams = authorRepository.save(author);

        author = new Author("Kevin J.", "Anderson", sergio); //2
        Author kevinAnderson = authorRepository.save(author);

        author = new Author("Isaac", "Asimov", sergio); //3
        Author isaacAsimov = authorRepository.save(author);

        author = new Author("Petter V.", "Brett", sergio); //4
        Author petterBrett = authorRepository.save(author);

        author = new Author("Dave", "Bara", sergio); //5
        Author daveBara = authorRepository.save(author);

        author = new Author("Raymond E.", "Feist", sergio); //6
        Author raymondFeist = authorRepository.save(author);

        author = new Author("Forsyth", "Frederick", sergio); //7
        Author forsythFrederick = authorRepository.save(author);

        author = new Author("Richard", "Ford", sergio); //8
        Author richardFord = authorRepository.save(author);

        author = new Author("Gillian", "Flynn", sergio); //9
        Author gillianFlynn = authorRepository.save(author);

        author = new Author("Terry", "Goodkind", sergio); //10
        Author terryGoodkind = authorRepository.save(author);

        author = new Author("Paul", "Hoffman", sergio); //11
        Author paulHoffman = authorRepository.save(author);

        //INSERT INTO genre(id, name, ownedById)
        Genre genre = new Genre("Literary Fiction", sergio); //1
        Genre literaryFiction = genreRepository.save(genre);

        genre = new Genre("Mystery", sergio); //2
        Genre mystery = genreRepository.save(genre);

        genre = new Genre("Thriller", sergio); //3
        Genre thriller = genreRepository.save(genre);

        genre = new Genre("Horror", sergio); //4
        Genre horror = genreRepository.save(genre);

        genre = new Genre("Historical", sergio); //5
        Genre historical = genreRepository.save(genre);

        genre = new Genre("Romance", sergio); //6
        Genre romance = genreRepository.save(genre);

        genre = new Genre("Science Fiction", sergio); //7
        Genre scienceFiction = genreRepository.save(genre);

        genre = new Genre("Fantasy", sergio); //8
        Genre fantasy = genreRepository.save(genre);

        genre = new Genre("Historical Fiction", sergio); //9
        Genre historicalFiction = genreRepository.save(genre);

        genre = new Genre("Action & Adventure", sergio); //10
        Genre actionAndAdventure = genreRepository.save(genre);

        genre = new Genre("Humor", sergio); //11
        Genre humor = genreRepository.save(genre);

        genre = new Genre("Graphic Novel", sergio); //12
        Genre graphicNovel = genreRepository.save(genre);

        genre = new Genre("Short Story", sergio); //13
        Genre shortStory = genreRepository.save(genre);

        genre = new Genre("Young Adult", sergio); //14
        Genre youngAdult = genreRepository.save(genre);

        genre = new Genre("Children's", sergio); //15
        Genre children = genreRepository.save(genre);

        genre = new Genre("Autobiography", sergio); //16
        Genre autobiography = genreRepository.save(genre);

        genre = new Genre("Biography", sergio); //17
        Genre biography = genreRepository.save(genre);

        genre = new Genre("Food & Drink", sergio); //18
        Genre food = genreRepository.save(genre);

        genre = new Genre("Art & Photography", sergio); //19
        Genre artPhotography = genreRepository.save(genre);

        genre = new Genre("Self-help", sergio); //20
        Genre selfHelp = genreRepository.save(genre);

        genre = new Genre("Travel", sergio); //21
        Genre travel = genreRepository.save(genre);

        genre = new Genre("Essays", sergio); //22
        Genre essays = genreRepository.save(genre);

        genre = new Genre("Guide / How-to", sergio); //23
        Genre guide = genreRepository.save(genre);

        genre = new Genre("Religion & Spirituality", sergio); //24
        Genre religion = genreRepository.save(genre);

        genre = new Genre("Humanities & Social Sciences", sergio); //25
        Genre humanities = genreRepository.save(genre);

        genre = new Genre("Science & Technology", sergio); //26
        Genre scienceTech = genreRepository.save(genre);

        Format format = new Format(Item.Type.PAPER.toString(), "Paperback", sergio); //1
        Format paperback = formatRepository.save(format);

        format = new Format(Item.Type.PAPER.toString(), "Hardcover", sergio); //2
        Format hardcover = formatRepository.save(format);

        format = new Format(Item.Type.PAPER.toString(), "B-format", sergio); //3
        Format bFormat = formatRepository.save(format);

        format = new Format(Item.Type.EBOOK.toString(), "PDF", sergio); //4
        Format pdf = formatRepository.save(format);

        format = new Format(Item.Type.EBOOK.toString(), "epub", sergio); //5
        Format epub = formatRepository.save(format);

        format = new Format(Item.Type.EBOOK.toString(), "mobi", sergio); //6
        Format mobi = formatRepository.save(format);

        format = new Format(Item.Type.AUDIO.toString(), "MP3", sergio); //7
        Format mp3 = formatRepository.save(format);

        format = new Format(Item.Type.AUDIO.toString(), "AAX", sergio); //8
        Format aax = formatRepository.save(format);

        format = new Format(Item.Type.AUDIO.toString(), "M4A/M4B", sergio); //9
        Format m4aM4b = formatRepository.save(format);

        format = new Format(Item.Type.AUDIO.toString(), "AAC", sergio); //10
        Format aac = formatRepository.save(format);

        format = new Format(Item.Type.AUDIO.toString(), "M4P", sergio); //11
        Format m4p = formatRepository.save(format);

        format = new Format(Item.Type.AUDIO.toString(), "OGG", sergio); //12
        Format ogg = formatRepository.save(format);

        format = new Format(Item.Type.AUDIO.toString(), "FLAC", sergio); //13
        Format flac = formatRepository.save(format);

        Date now = new Date();

        //1
        Item book = new Item();
        book.setTitle("Liberdade é só mais uma palavra para as pessoas descobrirem que és incompetente");
        book.setOwner(sergio);
        book.setType(Item.Type.PAPER.toString());
        book.setTranslated(true);
        book.setRead(false);
        book.setNoOfCopies(1);
        book.setIsbn("9789892315997");
        book.setLanguage("Portuguese");
        book.setFormat(paperback);
        book.setAddedOn(now);
        Item book1 = itemRepository.save(book);

        //2
        book = new Item();
        book.setTitle("The Dark Between the Stars");
        book.setOwner(sergio);
        book.setType(Item.Type.PAPER.toString());
        book.setTranslated(false);
        book.setRead(false);
        book.setNoOfCopies(1);
        book.setIsbn("9781840836784");
        book.setLanguage("English");
        book.setOrderInSeries(1);
        book.setSeries(ofTheShadows); //1
        book.setFormat(paperback);
        book.setAddedOn(now);
        Item book2 = itemRepository.save(book);

        //3
        book = new Item();
        book.setTitle("Foundation");
        book.setOwner(sergio);
        book.setType(Item.Type.PAPER.toString());
        book.setTranslated(true);
        book.setRead(false);
        book.setNoOfCopies(1);
        book.setIsbn("9780586010808");
        book.setLanguage("English");
        book.setOrderInSeries(1);
        book.setSeries(foundation); //2
        book.setFormat(paperback);
        book.setAddedOn(now);
        Item book3 = itemRepository.save(book);

        //4
        book = new Item();
        book.setTitle("Second Foundation");
        book.setOwner(sergio);
        book.setType(Item.Type.PAPER.toString());
        book.setTranslated(true);
        book.setRead(false);
        book.setNoOfCopies(1);
        book.setIsbn("9780586017135");
        book.setLanguage("English");
        book.setOrderInSeries(3);
        book.setSeries(foundation);//2
        book.setFormat(paperback);
        book.setAddedOn(now);
        Item book4 = itemRepository.save(book);

        //5
        book = new Item();
        book.setTitle("Prelude to Foundation");
        book.setOwner(sergio);
        book.setType(Item.Type.PAPER.toString());
        book.setTranslated(true);
        book.setRead(false);
        book.setNoOfCopies(1);
        book.setIsbn("9780586071113");
        book.setLanguage("English");
        book.setOrderInSeries(0);
        book.setSeries(foundation);//2
        book.setFormat(paperback);
        book.setAddedOn(now);
        Item book5 = itemRepository.save(book);

        //6
        book = new Item();
        book.setTitle("Foundation & Earth");
        book.setOwner(sergio);
        book.setType(Item.Type.PAPER.toString());
        book.setTranslated(true);
        book.setRead(false);
        book.setNoOfCopies(1);
        book.setIsbn("9780586071106");
        book.setLanguage("English");
        book.setOrderInSeries(5);
        book.setSeries(foundation);//2
        book.setFormat(paperback);
        book.setAddedOn(now);
        Item book6 = itemRepository.save(book);

        //7
        book = new Item();
        book.setTitle("Foundation's Edge");
        book.setOwner(sergio);
        book.setType(Item.Type.PAPER.toString());
        book.setTranslated(true);
        book.setRead(false);
        book.setNoOfCopies(1);
        book.setIsbn("9780586058398");
        book.setLanguage("English");
        book.setOrderInSeries(2);
        book.setSeries(foundation);//2
        book.setFormat(paperback);
        book.setAddedOn(now);
        Item book7 = itemRepository.save(book);

        //8
        book = new Item();
        book.setTitle("Foundation and Empire");
        book.setOwner(sergio);
        book.setType(Item.Type.PAPER.toString());
        book.setTranslated(true);
        book.setRead(false);
        book.setNoOfCopies(1);
        book.setIsbn("9780586013557");
        book.setLanguage("English");
        book.setOrderInSeries(2);
        book.setSeries(foundation);//2
        book.setFormat(paperback);
        book.setAddedOn(now);
        Item book8 = itemRepository.save(book);

        //9
        book = new Item();
        book.setTitle("Homem Pintado");
        book.setSubtitle("");
        book.setOwner(sergio);
        book.setType(Item.Type.PAPER.toString());
        book.setTranslated(true);
        book.setRead(true);
        book.setNoOfCopies(1);
        book.setIsbn("9789895576677");
        book.setLanguage("Portuguese");
        book.setOrderInSeries(1);
        book.setSeries(cicloDosDemonios);//3
        book.setFormat(paperback);
        book.setAddedOn(now);
        Item book9 = itemRepository.save(book);

        //10
        book = new Item();
        book.setTitle("Lança  do Deserto");
        book.setOwner(sergio);
        book.setType(Item.Type.PAPER.toString());
        book.setTranslated(true);
        book.setRead(false);
        book.setNoOfCopies(1);
        book.setIsbn("9789895577156");
        book.setLanguage("Portuguese");
        book.setOrderInSeries(2);
        book.setSeries(cicloDosDemonios);//3
        book.setFormat(paperback);
        book.setAddedOn(now);
        Item book10 = itemRepository.save(book);

        //11
        book = new Item();
        book.setTitle("A Guerra Diurna");
        book.setOwner(sergio);
        book.setType(Item.Type.PAPER.toString());
        book.setTranslated(true);
        book.setRead(false);
        book.setNoOfCopies(1);
        book.setIsbn("9789892324494");
        book.setLanguage("Portuguese");
        book.setOrderInSeries(3);
        book.setSeries(cicloDosDemonios);//3
        book.setFormat(paperback);
        book.setAddedOn(now);
        Item book11 = itemRepository.save(book);

        //12
        book = new Item();
        book.setTitle("O Grande Bazar e outras histórias");
        book.setOwner(sergio);
        book.setType(Item.Type.PAPER.toString());
        book.setTranslated(true);
        book.setRead(false);
        book.setNoOfCopies(1);
        book.setIsbn("9789892331362");
        book.setLanguage("Portuguese");
        book.setFormat(paperback);
        book.setAddedOn(now);
        Item book12 = itemRepository.save(book);

        //13
        book = new Item();
        book.setTitle("O Trono dos Crânios");
        book.setOwner(sergio);
        book.setType(Item.Type.PAPER.toString());
        book.setTranslated(true);
        book.setRead(false);
        book.setNoOfCopies(1);
        book.setIsbn("9789892334516");
        book.setLanguage("Portuguese");
        book.setFormat(paperback);
        book.setAddedOn(now);
        Item book13 = itemRepository.save(book);

        //14
        book = new Item();
        book.setTitle("Impulse");
        book.setOwner(sergio);
        book.setType(Item.Type.PAPER.toString());
        book.setTranslated(false);
        book.setRead(true);
        book.setNoOfCopies(1);
        book.setIsbn("9780756410667");
        book.setLanguage("English");
        book.setOrderInSeries(1);
        book.setSeries(lightshipChronicles);//4
        book.setFormat(paperback);
        book.setAddedOn(now);
        Item book14 = itemRepository.save(book);

        //15
        book = new Item();
        book.setTitle("Starbound");
        book.setOwner(sergio);
        book.setType(Item.Type.PAPER.toString());
        book.setTranslated(false);
        book.setRead(true);
        book.setNoOfCopies(1);
        book.setIsbn("9781473616110");
        book.setLanguage("English");
        book.setOrderInSeries(2);
        book.setSeries(lightshipChronicles);//4
        book.setFormat(paperback);
        book.setAddedOn(now);
        Item book15 = itemRepository.save(book);

        //16
        book = new Item();
        book.setTitle("Magician");
        book.setOwner(sergio);
        book.setType(Item.Type.PAPER.toString());
        book.setTranslated(false);
        book.setRead(true);
        book.setNoOfCopies(1);
        book.setIsbn("9780586217832");
        book.setLanguage("English");
        book.setOrderInSeries(1);
        book.setSeries(riftwarSaga);//5
        book.setFormat(paperback);
        book.setAddedOn(now);
        Item book16 = itemRepository.save(book);

        //17
        book = new Item();
        book.setTitle("Silverthorn");
        book.setOwner(sergio);
        book.setType(Item.Type.PAPER.toString());
        book.setTranslated(false);
        book.setRead(true);
        book.setNoOfCopies(1);
        book.setIsbn("9780007229420");
        book.setLanguage("English");
        book.setOrderInSeries(2);
        book.setSeries(riftwarSaga);//5
        book.setFormat(paperback);
        book.setAddedOn(now);
        Item book17 = itemRepository.save(book);

        //18
        book = new Item();
        book.setTitle("A Darkness at Sethanon");
        book.setOwner(sergio);
        book.setType(Item.Type.PAPER.toString());
        book.setTranslated(false);
        book.setRead(false);
        book.setNoOfCopies(1);
        book.setIsbn("9780007229437");
        book.setLanguage("English");
        book.setOrderInSeries(3);
        book.setSeries(riftwarSaga);//5
        book.setFormat(paperback);
        book.setAddedOn(now);
        Item book18 = itemRepository.save(book);

        //19
        book = new Item();
        book.setTitle("Daughter of the Empire");
        book.setOwner(sergio);
        book.setType(Item.Type.PAPER.toString());
        book.setTranslated(false);
        book.setRead(true);
        book.setNoOfCopies(1);
        book.setIsbn("9780586074817");
        book.setLanguage("English");
        book.setOrderInSeries(1);
        book.setSeries(empireTrilogy);//6
        book.setFormat(paperback);
        book.setAddedOn(now);
        Item book19 = itemRepository.save(book);

        //20
        book = new Item();
        book.setTitle("Servant of the Empire");
        book.setOwner(sergio);
        book.setType(Item.Type.PAPER.toString());
        book.setTranslated(false);
        book.setRead(true);
        book.setNoOfCopies(1);
        book.setIsbn("9780586203811");
        book.setLanguage("English");
        book.setOrderInSeries(2);
        book.setSeries(empireTrilogy);//6
        book.setFormat(paperback);
        book.setAddedOn(now);
        Item book20 = itemRepository.save(book);

        //21
        book = new Item();
        book.setTitle("Mistress of the Empire");
        book.setOwner(sergio);
        book.setType(Item.Type.PAPER.toString());
        book.setTranslated(false);
        book.setRead(true);
        book.setNoOfCopies(1);
        book.setIsbn("9780586203798");
        book.setLanguage("English");
        book.setOrderInSeries(3);
        book.setSeries(empireTrilogy);//6
        book.setFormat(paperback);
        book.setAddedOn(now);
        Item book21 = itemRepository.save(book);

        //22
        book = new Item();
        book.setTitle("Prince of the Blood");
        book.setOwner(sergio);
        book.setType(Item.Type.PAPER.toString());
        book.setTranslated(false);
        book.setRead(false);
        book.setNoOfCopies(1);
        book.setIsbn("9780007176168");
        book.setLanguage("English");
        book.setOrderInSeries(1);
        book.setSeries(krondosSons);//7
        book.setFormat(paperback);
        book.setAddedOn(now);
        Item book22 = itemRepository.save(book);

        //23
        book = new Item();
        book.setTitle("The King's Buccaneer");
        book.setOwner(sergio);
        book.setType(Item.Type.PAPER.toString());
        book.setTranslated(false);
        book.setRead(false);
        book.setNoOfCopies(1);
        book.setIsbn("9780586203224");
        book.setLanguage("English");
        book.setOrderInSeries(2);
        book.setSeries(krondosSons);//7
        book.setFormat(paperback);
        book.setAddedOn(now);
        Item book23 = itemRepository.save(book);

        //24
        book = new Item();
        book.setTitle("Shadow of a Dark Queen");
        book.setOwner(sergio);
        book.setType(Item.Type.PAPER.toString());
        book.setTranslated(false);
        book.setRead(false);
        book.setNoOfCopies(1);
        book.setIsbn("9780006480266");
        book.setLanguage("English");
        book.setOrderInSeries(1);
        book.setSeries(serpentwarSaga);//8
        book.setFormat(paperback);
        book.setAddedOn(now);
        Item book24 = itemRepository.save(book);

        //25
        book = new Item();
        book.setTitle("Rise of a Merchant Prince");
        book.setOwner(sergio);
        book.setType(Item.Type.PAPER.toString());
        book.setTranslated(false);
        book.setRead(false);
        book.setNoOfCopies(1);
        book.setIsbn("9780006497011");
        book.setLanguage("English");
        book.setOrderInSeries(2);
        book.setSeries(serpentwarSaga);//8
        book.setFormat(paperback);
        book.setAddedOn(now);
        Item book25 = itemRepository.save(book);

        //26
        book = new Item();
        book.setTitle("Rage of a Demon King");
        book.setOwner(sergio);
        book.setType(Item.Type.PAPER.toString());
        book.setTranslated(true);
        book.setRead(false);
        book.setNoOfCopies(1);
        book.setIsbn("9780006482987");
        book.setLanguage("English");
        book.setOrderInSeries(3);
        book.setSeries(serpentwarSaga);//8
        book.setFormat(paperback);
        book.setAddedOn(now);
        Item book26 = itemRepository.save(book);

        //27
        book = new Item();
        book.setTitle("Shards of a Broken Crown");
        book.setOwner(sergio);
        book.setType(Item.Type.PAPER.toString());
        book.setTranslated(false);
        book.setRead(false);
        book.setNoOfCopies(1);
        book.setIsbn("9780006483489");
        book.setLanguage("English");
        book.setOrderInSeries(4);
        book.setSeries(serpentwarSaga);//8
        book.setFormat(paperback);
        book.setAddedOn(now);
        Item book27 = itemRepository.save(book);

        //28
        book = new Item();
        book.setTitle("Magician's End");
        book.setSubtitle("English");
        book.setOwner(sergio);
        book.setType(Item.Type.PAPER.toString());
        book.setTranslated(true);
        book.setRead(false);
        book.setNoOfCopies(1);
        book.setIsbn("9780007264803");
        book.setLanguage("English");
        book.setSeries(chaoswarSaga);//9
        book.setFormat(paperback);
        book.setAddedOn(now);
        Item book28 = itemRepository.save(book);

        //29
        book = new Item();
        book.setTitle("At the Gates of Darkness");
        book.setOwner(sergio);
        book.setType(Item.Type.PAPER.toString());
        book.setTranslated(false);
        book.setRead(false);
        book.setNoOfCopies(1);
        book.setIsbn("9780007264728");
        book.setLanguage("English");
        book.setFormat(paperback);
        book.setAddedOn(now);
        Item book29 = itemRepository.save(book);

        //30
        book = new Item();
        book.setTitle("Rides a Dread Legion");
        book.setOwner(sergio);
        book.setType(Item.Type.PAPER.toString());
        book.setTranslated(false);
        book.setRead(false);
        book.setNoOfCopies(1);
        book.setIsbn("9780007342587");
        book.setLanguage("English");
        book.setFormat(paperback);
        book.setAddedOn(now);
        Item book30 = itemRepository.save(book);

        //31
        book = new Item();
        book.setTitle("Krondor: The assassins");
        book.setOwner(sergio);
        book.setType(Item.Type.PAPER.toString());
        book.setTranslated(false);
        book.setRead(false);
        book.setNoOfCopies(1);
        book.setIsbn("9780008311261");
        book.setLanguage("English");
        book.setSeries(riftwarLegacy);//10
        book.setFormat(paperback);
        book.setAddedOn(now);
        Item book31 = itemRepository.save(book);

        //32
        book = new Item();
        book.setTitle("The Kill List");
        book.setOwner(sergio);
        book.setType(Item.Type.PAPER.toString());
        book.setTranslated(true);
        book.setRead(false);
        book.setNoOfCopies(1);
        book.setIsbn("9780552169486");
        book.setLanguage("English");
        book.setFormat(paperback);
        book.setAddedOn(now);
        Item book32 = itemRepository.save(book);

        //33
        book = new Item();
        book.setTitle("The Shatered Crown");
        book.setOwner(sergio);
        book.setType(Item.Type.PAPER.toString());
        book.setTranslated(true);
        book.setRead(false);
        book.setNoOfCopies(1);
        book.setIsbn("9780755394074");
        book.setLanguage("English");
        book.setOrderInSeries(2);
        book.setSeries(steelhaven);//11
        book.setFormat(paperback);
        book.setAddedOn(now);
        Item book33 = itemRepository.save(book);

        //34
        book = new Item();
        book.setTitle("Herald of the Storm");
        book.setOwner(sergio);
        book.setType(Item.Type.PAPER.toString());
        book.setTranslated(true);
        book.setRead(false);
        book.setNoOfCopies(1);
        book.setIsbn("9781472203922");
        book.setLanguage("English");
        book.setOrderInSeries(1);
        book.setSeries(steelhaven);//11
        book.setFormat(paperback);
        book.setAddedOn(now);
        Item book34 = itemRepository.save(book);

        //35
        book = new Item();
        book.setTitle("Lord of Ashes");
        book.setSubtitle("");
        book.setOwner(sergio);
        book.setType(Item.Type.PAPER.toString());
        book.setTranslated(true);
        book.setRead(false);
        book.setNoOfCopies(1);
        book.setIsbn("9780755394104");
        book.setLanguage("English");
        book.setOrderInSeries(3);
        book.setSeries(steelhaven);//11
        book.setFormat(paperback);
        book.setAddedOn(now);
        Item book35 = itemRepository.save(book);

        //36
        book = new Item();
        book.setTitle("Gone Girl");
        book.setOwner(sergio);
        book.setType(Item.Type.PAPER.toString());
        book.setTranslated(false);
        book.setRead(false);
        book.setNoOfCopies(1);
        book.setIsbn("9780553419085");
        book.setLanguage("English");
        book.setFormat(paperback);
        book.setAddedOn(now);
        Item book36 = itemRepository.save(book);

        //37
        book = new Item();
        book.setTitle("Em Parte Incerta");
        book.setOwner(sergio);
        book.setType(Item.Type.PAPER.toString());
        book.setTranslated(true);
        book.setRead(false);
        book.setNoOfCopies(1);
        book.setIsbn("9799722525572");
        book.setLanguage("Portuguese");
        book.setDuplicate(book36);
        book.setFormat(paperback);
        book.setAddedOn(now);
        Item book37 = itemRepository.save(book);

        //38
        book = new Item();
        book.setTitle("Primeira Regra dos Feiticeiros, Parte I");
        book.setOwner(sergio);
        book.setType(Item.Type.PAPER.toString());
        book.setTranslated(true);
        book.setRead(false);
        book.setNoOfCopies(1);
        book.setIsbn("9789720046840");
        book.setLanguage("Portuguese");
        book.setOrderInSeries(1);
        book.setSeries(sagaEspadaVerdade);//12
        book.setFormat(paperback);
        book.setAddedOn(now);
        Item book38 = itemRepository.save(book);

        //39
        book = new Item();
        book.setTitle("A Primeira Regra dos Feiticeiros, Parte  II");
        book.setOwner(sergio);
        book.setType(Item.Type.PAPER.toString());
        book.setTranslated(true);
        book.setRead(false);
        book.setNoOfCopies(1);
        book.setIsbn("9789720046970");
        book.setLanguage("Portuguese");
        book.setOrderInSeries(2);
        book.setSeries(sagaEspadaVerdade);//12
        book.setFormat(paperback);
        book.setAddedOn(now);
        Item book39 = itemRepository.save(book);

        //40
        book = new Item();
        book.setTitle("A Pedra das Lágrimas, Parte I");
        book.setOwner(sergio);
        book.setType(Item.Type.PAPER.toString());
        book.setTranslated(true);
        book.setRead(false);
        book.setNoOfCopies(1);
        book.setIsbn("9789720047489");
        book.setLanguage("Portuguese");
        book.setOrderInSeries(3);
        book.setSeries(sagaEspadaVerdade);//12
        book.setFormat(paperback);
        book.setAddedOn(now);
        Item book40 = itemRepository.save(book);

        //41
        book = new Item();
        book.setTitle("A Pedra das Lágrimas, Parte II");
        book.setOwner(sergio);
        book.setType(Item.Type.PAPER.toString());
        book.setTranslated(true);
        book.setRead(false);
        book.setNoOfCopies(1);
        book.setIsbn("9789220047687");
        book.setLanguage("Portuguese");
        book.setOrderInSeries(5);
        book.setSeries(sagaEspadaVerdade);//12
        book.setFormat(paperback);
        book.setAddedOn(now);
        Item book41 = itemRepository.save(book);

        //42
        book = new Item();
        book.setTitle("O Sangue da Virtude");
        book.setOwner(sergio);
        book.setType(Item.Type.PAPER.toString());
        book.setTranslated(true);
        book.setRead(false);
        book.setNoOfCopies(1);
        book.setIsbn("9789720047922");
        book.setLanguage("Portuguese");
        book.setFormat(paperback);
        book.setAddedOn(now);
        Item book42 = itemRepository.save(book);

        //43
        book = new Item();
        book.setTitle("The Left Hand of Good");
        book.setOwner(sergio);
        book.setType(Item.Type.PAPER.toString());
        book.setTranslated(false);
        book.setRead(false);
        book.setNoOfCopies(1);
        book.setIsbn("9780141042374");
        book.setLanguage("English");
        book.setOrderInSeries(1);
        book.setFormat(paperback);
        book.setAddedOn(now);
        Item book43 = itemRepository.save(book);

        //44
        book = new Item();
        book.setTitle("The Last Four Things");
        book.setSubtitle("");
        book.setOwner(sergio);
        book.setType(Item.Type.PAPER.toString());
        book.setTranslated(false);
        book.setRead(false);
        book.setNoOfCopies(1);
        book.setIsbn("9780718155209");
        book.setLanguage("English");
        book.setOrderInSeries(2);
        book.setFormat(paperback);
        book.setAddedOn(now);
        Item book44 = itemRepository.save(book);

        //45
        book = new Item();
        book.setTitle("The Beating o His Wings");
        book.setOwner(sergio);
        book.setType(Item.Type.PAPER.toString());
        book.setTranslated(false);
        book.setRead(false);
        book.setNoOfCopies(1);
        book.setIsbn("9780141042404");
        book.setLanguage("English");
        book.setOrderInSeries(3);
        book.setFormat(paperback);
        book.setAddedOn(now);
        Item book45 = itemRepository.save(book);

        book1.addAuthor(scottAdams);
        book2.addAuthor(kevinAnderson);
        book3.addAuthor(isaacAsimov);
        book4.addAuthor(isaacAsimov);
        book5.addAuthor(isaacAsimov);
        book6.addAuthor(isaacAsimov);
        book7.addAuthor(isaacAsimov);
        book8.addAuthor(isaacAsimov);
        book9.addAuthor(petterBrett);
        book10.addAuthor(petterBrett);
        book11.addAuthor(petterBrett);
        book12.addAuthor(petterBrett);
        book13.addAuthor(petterBrett);
        book14.addAuthor(daveBara);
        book15.addAuthor(daveBara);
        book16.addAuthor(raymondFeist);
        book17.addAuthor(raymondFeist);
        book18.addAuthor(raymondFeist);
        book19.addAuthor(raymondFeist);
        book20.addAuthor(raymondFeist);
        book21.addAuthor(raymondFeist);
        book22.addAuthor(raymondFeist);
        book23.addAuthor(raymondFeist);
        book24.addAuthor(raymondFeist);
        book25.addAuthor(raymondFeist);
        book26.addAuthor(raymondFeist);
        book27.addAuthor(raymondFeist);
        book28.addAuthor(raymondFeist);
        book29.addAuthor(raymondFeist);
        book30.addAuthor(raymondFeist);
        book31.addAuthor(raymondFeist);
        book32.addAuthor(forsythFrederick);
        book33.addAuthor(richardFord);
        book34.addAuthor(richardFord);
        book35.addAuthor(richardFord);
        book36.addAuthor(gillianFlynn);
        book37.addAuthor(gillianFlynn);
        book38.addAuthor(terryGoodkind);
        book39.addAuthor(terryGoodkind);
        book40.addAuthor(terryGoodkind);
        book41.addAuthor(terryGoodkind);
        book42.addAuthor(terryGoodkind);
        book43.addAuthor(paulHoffman);
        book44.addAuthor(paulHoffman);
        book45.addAuthor(paulHoffman);

        book1.addGenre(humor);
        book1.addGenre(scienceFiction);
        book1.addGenre(scienceFiction);
        book1.addGenre(scienceFiction);
        book1.addGenre(scienceFiction);
        book1.addGenre(scienceFiction);
        book1.addGenre(scienceFiction);
        book1.addGenre(scienceFiction);
        book1.addGenre(fantasy);
        book1.addGenre(fantasy);
        book1.addGenre(fantasy);
        book1.addGenre(fantasy);
        book1.addGenre(fantasy);
        book1.addGenre(scienceFiction);
        book1.addGenre(scienceFiction);
        book1.addGenre(fantasy);
        book1.addGenre(fantasy);
        book1.addGenre(fantasy);
        book1.addGenre(fantasy);
        book1.addGenre(fantasy);
        book1.addGenre(fantasy);
        book1.addGenre(fantasy);
        book1.addGenre(fantasy);
        book1.addGenre(fantasy);
        book1.addGenre(fantasy);
        book1.addGenre(fantasy);
        book1.addGenre(fantasy);
        book1.addGenre(fantasy);
        book1.addGenre(fantasy);
        book1.addGenre(fantasy);
        book1.addGenre(fantasy);
        book1.addGenre(fantasy);
        book1.addGenre(fantasy);
        book1.addGenre(fantasy);
        book1.addGenre(thriller);
        book1.addGenre(thriller);
        book1.addGenre(fantasy);
        book1.addGenre(fantasy);
        book1.addGenre(fantasy);
        book1.addGenre(fantasy);
        book1.addGenre(fantasy);
        book1.addGenre(fantasy);
        book1.addGenre(fantasy);
        book1.addGenre(fantasy);

        System.out.println("Accounts: " + accountRepository.count());
        System.out.println("Authors: " + authorRepository.count());
        System.out.println("Collection: " + collectRepository.count());
        System.out.println("Formats: " + formatRepository.count());
        System.out.println("Genres: " + genreRepository.count());
        System.out.println("Items: " + itemRepository.count());
        System.out.println("Publishers: " + publisherRepository.count());
        System.out.println("Series: " + seriesRepository.count());
        System.out.println("Bootstrap done.");
    }
}
