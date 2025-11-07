class Library {
    int libraryId;
    String name;
    int totalBooks;

    Library(int libraryId, String name) {
        this.libraryId = libraryId;
        this.name = name;
        this.totalBooks = 0;
    }


    Library(int libraryId, String name, int totalBooks) {
        this.libraryId = libraryId;
        this.name = name;
        this.totalBooks = totalBooks;
    }

    void display() {
        System.out.println("Library ID: " + libraryId);
        System.out.println("Name: " + name);
        System.out.println("Total Books: " + totalBooks);
        System.out.println();
    }

    public static void main(String[] args) {
        Library l1 = new Library(1, "Central Library");
        Library l2 = new Library(2, "City Library", 1500);

        l1.display();
        l2.display();
    }
}