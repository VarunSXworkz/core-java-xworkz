class BooksTester{

public static void main(String as[]){

Books book=new Books("Wilderness", "Literature", "Eugene O'Neill", 300.00);
System.out.println("The first type of book determined is:");
System.out.println(book.bookName +" "+book.type +" "+book.author +" "+book.price);

Books book1=new Books("Alien Corn", "Literature", "Sidney Howard", 320.00);
System.out.println("The second type of book determined is:");
System.out.println(book1.bookName +" "+book1.type +" "+book1.author +" "+book1.price);

Books book2=new Books("Game Of Thrones", "Novel", "George R.R. Martin", 230.00);
System.out.println("The third type of book determined is:");
System.out.println(book2.bookName +" "+book2.type +" "+book2.author +" "+book2.price);

Books book3=new Books("Harry Potter","Magic", "JK Rowling", 350.00);
System.out.println("The fourth type of book determined is:");
System.out.println(book3.bookName +" "+book3.type +" "+book3.author +" "+book3.price);

Books book4=new Books("The Jungle Book", "Adventure", "Rudyard Kiplig", 210.00);
System.out.println("The fifth type of book determined is:");
System.out.println(book4.bookName +" "+book4.type +" "+book4.author +" "+book4.price);

Books book5=new Books("Tomorrow and Tomorrow", "Novel", "Gabrielle Zevin",240.00);
System.out.println("The sixth type of book determined is:");
System.out.println(book5.bookName +" "+book5.type +" "+book5.author +" "+book5.price);

Books book6=new Books("Jungle Cruise", "Adventure", "Glenn Ficarra", 410.00);
System.out.println("The seventh type of book determined is:");
System.out.println(book6.bookName +" "+book6.type +" "+book6.author +" "+book6.price);

Books book7=new Books("The Tarzan", "Action and Adventure", "Edgar Rice Burroughs", 100.00);
System.out.println("The eighth type of book determined is:");
System.out.println(book7.bookName +" "+book7.type +" "+book7.author +" "+book7.price);

Books book8=new Books("Merchant of Venice", "Fiction", "Wiiliam Shakespeare", 365.00);
System.out.println("The ninth type of book determined is:");
System.out.println(book8.bookName +" "+book8.type +" "+book8.author +" "+book8.price);

Books book9=new Books("Sonia Greene", "Horror", "HP Lovecraft", 370.00);
System.out.println("The tenth type of book determined is:");
System.out.println(book9.bookName +" "+book9.type +" "+book9.author +" "+book9.price);
}
}