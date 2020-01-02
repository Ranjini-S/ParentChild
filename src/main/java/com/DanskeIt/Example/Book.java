package com.DanskeIt.Example;

public class Book {
private String name;
private String author;
private int noOfPages;
private float cost;

public void setName(String name) {
	this.name = name;
}
public void setAuthor(String author) {
	this.author = author;
}
public void setNoOfPages(int noOfPages) {
	this.noOfPages = noOfPages;
}
public void setCost(float cost) {
	this.cost = cost;
}
@Override
public String toString() {
	return "Book [name=" + name + ", author=" + author + ", noOfPages="
			+ noOfPages + ", cost=" + cost + "]";
}


}
