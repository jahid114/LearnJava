package com.JahidsCode;

import java.io.*;

class Book implements Serializable {
    private static final long serialVersionUID = 1000L;

    private String tittle;
    private String description;
    private int noOfPage;
    private int noOfCopies;

//        public Book(String tittle, String description, int noOfPage, int noOfCopies) {
//            this.tittle = tittle;
//            this.description = description;
//            this.noOfPage = noOfPage;
//            this.noOfCopies = noOfCopies;
//        }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNoOfPage() {
        return noOfPage;
    }

    public void setNoOfPage(int noOfPage) {
        this.noOfPage = noOfPage;
    }

    public int getNoOfCopies() {
        return noOfCopies;
    }

    public void setNoOfCopies(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    public static void serialize(Book book) throws Exception {
        FileOutputStream file = new FileOutputStream(LearnSerialization.fileName);
        ObjectOutputStream outputStream = new ObjectOutputStream(file);
        outputStream.writeObject(book);
        outputStream.close();
        file.close();
    }

    public static Book deserialize() throws Exception {
        FileInputStream fin = new FileInputStream(LearnSerialization.fileName);
        ObjectInputStream objectInputStream = new ObjectInputStream(fin);
        Book book = (Book) objectInputStream.readObject();
        objectInputStream.close();
        fin.close();
        return book;
    }
}
public class LearnSerialization {
    public static final String fileName = "file.txt";

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setTittle("Complete Java");
        book1.setDescription("A detailed view of Java");
        book1.setNoOfPage(361);
        book1.setNoOfCopies(500);
        try {
            Book.serialize(book1);
        }catch (Exception e){
            System.out.println(e);
            throw new RuntimeException(e);
        }
        Book book2 = new Book();
        try {
            book2 = Book.deserialize();
        }catch (Exception e){
            System.out.println(e);
            throw new RuntimeException(e);
        }
        System.out.println(book2.getTittle());
        System.out.println(book2.getDescription());
        System.out.println(book2.getNoOfCopies());
        System.out.println(book2.getNoOfPage());
    }
}
