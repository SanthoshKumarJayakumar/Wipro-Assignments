package Milestone1_OOPSInheritance_AbstractionEnscapsulation;
/*Create a class called Author is designed as follows:

It contains:
 Three private instance variables: name (String), email (String), and gender (char of either m or f).
 One constructor to initialize the name, email and gender with the given values.

And, a class called Book is designed as follows:
It contains:
 Four private instance variables: name (String), author (of the class Author you have just created), 
price (double), and qtyInStock (int). Assuming that each book is written by one author.
 One constructor which constructs an instance with the values given.
 Getters and setters: getName(), getAuthor(), getPrice(), setPrice(), getQtyInStock(), setQtyInStock().
 Again there is no setter for name and author.
Write the class Book (which uses the Author class written earlier). 
Try:
1. Printing the book name, price and qtyInStock from a Book instance. (Hint: aBook.getName())
2. After obtaining the Author object, print the Author (name, email & gender) of the book.

*/
class AuthorCall{
	private String name;
	private String email;
	private char Gender;
	AuthorCall(){
		
	}
}
class Book extends AuthorCall{
	String name;
	String author;
	double price;
	int qtyInStock;
}
class Author {

	public static void main(String[] args) {
		

	}

}
