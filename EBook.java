class EBook extends Book{
    private String fileFormat;

    public EBook(String title,String author,String fileFormat) {
        super(title, author, year);
        this.fileFormat = fileFormat;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Format: " + fileFormat;
    }
}
