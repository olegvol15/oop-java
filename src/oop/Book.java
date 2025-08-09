package oop;

import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private int year;
    private String publisher;
    private String genre;
    private int pages;

    public Book() {}

    public Book(String title, String author, int year, String publisher, String genre, int pages) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
        this.genre = genre;
        this.pages = pages;
    }

    public void inputData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter book title: ");
        title = sc.nextLine();

        System.out.print("Enter author full name: ");
        author = sc.nextLine();

        System.out.print("Enter year of publication: ");
        year = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter publisher: ");
        publisher = sc.nextLine();

        System.out.print("Enter genre: ");
        genre = sc.nextLine();

        System.out.print("Enter number of pages: ");
        pages = sc.nextInt();
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }
    public String getPublisher() { return publisher; }
    public String getGenre() { return genre; }
    public int getPages() { return pages; }

    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setYear(int year) { this.year = year; }
    public void setPublisher(String publisher) { this.publisher = publisher; }
    public void setGenre(String genre) { this.genre = genre; }
    public void setPages(int pages) { this.pages = pages; }

    public void printInfo() {
        System.out.println("Book Information:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Publisher: " + publisher);
        System.out.println("Genre: " + genre);
        System.out.println("Pages: " + pages);
    }

}


