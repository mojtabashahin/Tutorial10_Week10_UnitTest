import java.util.StringTokenizer;
public class Book {
	private String bookID;
	private String bookTitle;
	private int bookQuanity;
	private double bookPrice;
	private String bookType;
	
	public Book (String ID, String Title, int Quanity, double Price, String Type)
	{
		bookID=ID;
		bookTitle=Title;
		bookQuanity=Quanity;
		bookPrice=Price;
		bookType=Type;
	}
	public String AddBook ()
	 {
		
		if (bookID.length()!=5 || Character.isDigit(bookID.charAt(0))==false)	
		{
			return "The book information cannot be added";
		}
		int countWord= countWordsBookTitle (bookTitle);
		if (countWord <2 || countWord >4)
		{
			return "The book information cannot be added";
		}
		if ((bookType != "Kids" && (bookPrice <=5  || bookPrice >=250)) || (bookType == "Kids" && (bookPrice <=5  || bookPrice >=40)))
			return "The book information cannot be added";
		
		
		return "The book information can be added";
	 }
	public int countWordsBookTitle (String book_Title)
    {
		StringTokenizer stringTokenizer1 = new StringTokenizer(book_Title);
		return  stringTokenizer1.countTokens();//
    }
}
