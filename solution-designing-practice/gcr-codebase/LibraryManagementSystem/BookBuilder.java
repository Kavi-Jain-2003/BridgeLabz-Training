    public class BookBuilder {

        public String title;
        public String author;
        public String edition;

        public BookBuilder(String title) {
            this.title = title;
        }

        public BookBuilder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public BookBuilder setEdition(String edition) {
            this.edition = edition;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
