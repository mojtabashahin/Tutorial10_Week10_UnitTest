import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestClassBook {

	@Test
	void testAddBook_testCase1() {
	    //Test Case 1: Check the function with valid inputs
		//Test Case 1_Test Data 1
		Book booktestCase1Data1 = new Book ("1abcd", "First Book", 10, 5.1, "Kids");
		//assertEquals ("The book information has been added", booktestCase1Data1.AddBook());
		//Test Case 1_Test Data 2
		Book booktestCase1Data2 = new Book ("1abcd", "First Book AB AC", 10, 39.7, "Kids");
		//assertEquals ("The book information has been added", booktestCase1Data2.AddBook());
		
		Book booktestCase1Data3 = new Book ("1abcd", "First Book", 10, 249.6, "History");
		//assertEquals ("The book information has been added", booktestCase1Data3.AddBook());
		
		assertAll ("", ()->assertEquals("The book information can be added", booktestCase1Data1.AddBook()),
				()->assertEquals ("The book information can be added", booktestCase1Data2.AddBook()),
						()->assertEquals ("The book information can be added", booktestCase1Data3.AddBook()));
	    
	}
	@Test
	void testAddBook_testCase2() {
		//Test Case 2: Check the function with invalid Book ID
		
		//Test Case 2_Test Data 1
		Book booktestCase2Data1 = new Book ("1abc", "First Book", 10, 15.4, "Kids");
		//assertEquals ("The book information cannot be added", booktestCase2Data1.AddBook());
		//Test Case 2_Test Data 2
		Book booktestCase2Data2 = new Book ("abc", "First Book", 10, 5.1, "Kids");
		//assertEquals ("The book information cannot be added", booktestCase2Data2.AddBook());
		//Test Case 2_Test Data 3
		Book booktestCase2Data3 = new Book ("abcde", "First Book", 10, 5.1, "Kids");
		//assertEquals ("The book information cannot be added", booktestCase2Data3.AddBook());
		
		assertAll ("", ()->assertEquals ("The book information cannot be added", booktestCase2Data1.AddBook()),
				()->assertEquals ("The book information cannot be added", booktestCase2Data2.AddBook()),
				()->assertEquals ("The book information cannot be added", booktestCase2Data3.AddBook()));
		
	}
	@Test
	void testAddBook_testCase3() {
		//Test Case 3: Check the function with invalid Book Title
		
		//Test Case 3_Test Data 1
		Book booktestCase3Data1 = new Book ("1abcd", "First", 10, 15.4, "Kids");
		//assertEquals ("The book information cannot be added", booktestCase3Data1.AddBook());
		//Test Case 3_Test Data 1
	    Book booktestCase3Data2 = new Book ("1abcd", "First Book AB AC AD AE", 10, 15.4, "Kids");
	   // assertEquals ("The book information cannot be added", booktestCase3Data2.AddBook());
	    
		assertAll ("", ()->assertEquals ("The book information cannot be added", booktestCase3Data1.AddBook()),
				()->assertEquals ("The book information cannot be added", booktestCase3Data2.AddBook()));
				
		
	}
	@Test
	void testAddBook_testCase4() {
		//Test Case 4: Check the function with invalid Book Price
		
		//Test Case 4_Test Data 1
	}
}
