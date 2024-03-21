package com.example.javaeehelloworld;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class bookList extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Book> bookList = new ArrayList<Book>();

        // Add books to the list
        bookList.add(new Book("The Midnight Library", "Matt Haig", "978-0525559474", 15));
        bookList.add(new Book("The Alchemist", "Paulo Coelho", "978-0062315007", 20));
        bookList.add(new Book("Educated: A Memoir", "Tara Westover", "978-0399590504", 10));
        bookList.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565", 25));
        bookList.add(new Book("To Kill a Mockingbird", "Harper Lee", "978-0061120084", 18));

        // Set the bookList attribute on the request scope
        request.setAttribute("bookList", bookList);

        // Forward the request to the JSP for rendering
        RequestDispatcher dispatcher = request.getRequestDispatcher("bookList.jsp");
        dispatcher.forward(request, response);
    }
}

class Book {
    private String title;
    private String author;
    private String ISBN;
    private int quantity;

    public Book(String title, String author, String ISBN, int quantity) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.quantity = quantity;
    }
}
