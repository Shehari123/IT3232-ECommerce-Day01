class PrintedBook extends Book{
    private int pages;

    public PrintedBook(String title, String author, int year, int pages) {
        super(title, author, year);
        this.pages = pages;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", " + pages + " pages";
    }
}
