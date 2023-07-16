class BooksTester{

public static void main(String as[]){

Books book=new Books();
book.bookName="Widerness";
book.type="Literature";
book.author="Eugene O'Neill";
book.price=300.00;
System.out.println("The first type of book determined is:");
System.out.println(book.bookName +" "+book.type +" "+book.author +" "+book.price);

Books book1=new Books();
book1.bookName="Alien Corn";
book1.type="Literature";
book1.author="Sidney Howard";
book1.price=320.00;
System.out.println("The second type of book determined is:");
System.out.println(book1.bookName +" "+book1.type +" "+book1.author +" "+book1.price);

Books book2=new Books();
book2.bookName="Game Of Thrones";
book2.type="Novel";
book2.author="George R.R. Martin";
book2.price=230.00;
System.out.println("The third type of book determined is:");
System.out.println(book2.bookName +" "+book2.type +" "+book2.author +" "+book2.price);

Books book3=new Books();
book3.bookName="Harry Potter";
book3.type="Magic";
book3.author="JK Rowling";
book3.price=350.00;
System.out.println("The fourth type of book determined is:");
System.out.println(book3.bookName +" "+book3.type +" "+book3.author +" "+book3.price);

Books book4=new Books();
book4.bookName="The Jungle Book";
book4.type="Adventure";
book4.author="Rudyard Kiplig";
book4.price=210.00;
System.out.println("The fifth type of book determined is:");
System.out.println(book4.bookName +" "+book4.type +" "+book4.author +" "+book4.price);

Books book5=new Books();
book5.bookName="Tomorrow and Tomorrow";
book5.type="Novel";
book5.author="Gabrielle Zevin";
book5.price=240.00;
System.out.println("The sixth type of book determined is:");
System.out.println(book5.bookName +" "+book5.type +" "+book5.author +" "+book5.price);

Books book6=new Books();
book6.bookName="Jungle Cruise";
book6.type="Adventure";
book6.author="Glenn Ficarra";
book6.price=410.00;
System.out.println("The seventh type of book determined is:");
System.out.println(book6.bookName +" "+book6.type +" "+book6.author +" "+book6.price);

Books book7=new Books();
book7.bookName="The Tarzan";
book7.type="Action and Adventure";
book7.author="Edgar Rice Burroughs";
book7.price=100.00;
System.out.println("The eighth type of book determined is:");
System.out.println(book7.bookName +" "+book7.type +" "+book7.author +" "+book7.price);

Books book8=new Books();
book8.bookName="Mercahnt of Venice";
book8.type="Fiction";
book8.author="Wiiliam Shakespeare";
book8.price=365.00;
System.out.println("The ninth type of book determined is:");
System.out.println(book8.bookName +" "+book8.type +" "+book8.author +" "+book8.price);

Books book9=new Books();
book9.bookName="Sonia Greene";
book9.type="Horror";
book9.author="HP Lovecraft";
book9.price=370.00;
System.out.println("The tenth type of book determined is:");
System.out.println(book9.bookName +" "+book9.type +" "+book9.author +" "+book9.price);
}
}