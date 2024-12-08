package com.orange.dataprovider;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.DataProvider;

import com.orange.utility.NewExcelLibrary;

/**
 * 
 */
public class DataProviders {
	
	NewExcelLibrary obj = new NewExcelLibrary();
	
//	@DataProvider(name = "loginDataProvider")
//	public Object[][] loginDataProvider() {
//	    return new Object[][] {
//	        {"admin@practicesoftwaretesting.com", "welcome01"},
//	        {"user2@example.com", "password2"}
//	    };
//	}
	@DataProvider(name= "CredentialsToLoginIn")
     public Object[][] getCredentialstoLoginIn(){
		// Totals rows count
				int rows = obj.getRowCount("Credentials");
				// Total Columns
				int column = obj.getColumnCount("Credentials");
				int actRows = rows - 1;

				Object[][] data = new Object[actRows][column];

				for (int i = 0; i < actRows; i++) {
					for (int j = 0; j < column; j++) {
						data[i][j] = obj.getCellData("Credentials", j, i + 2);
					}
				}
				return data;
				}
	///class saechproductTest
    		 @DataProvider(name = "searchProduct1")
	public Object[][] getProductSearch() {
		// Totals rows count
		int rows = obj.getRowCount("Search");
		// Total Columns
		int column = obj.getColumnCount("Search");
		int actRows = rows - 1;

		Object[][] data = new Object[actRows][column];
		for (int i = 0; i < actRows; i++) {
			for (int j = 0; j < column; j++) {
				data[i][j] = obj.getCellData("Search", j, i + 2);
			}
		}
		return data;
	}
/// add to cart test
    		 @DataProvider(name = "AddToCart")
    			public Object[][] getAddCart() {
    				// Totals rows count
    				int rows = obj.getRowCount("AddToCart");
    				// Total Columns
    				int column = obj.getColumnCount("AddToCart");
    				int actRows = rows - 1;

    				Object[][] data = new Object[actRows][column];
    				for (int i = 0; i < actRows; i++) {
    					for (int j = 0; j < column; j++) {
    						data[i][j] = obj.getCellData("AddToCart", j, i + 2);
    					}
    				}
    				return data;
    			}

    		 /// sign in after cart is selected or in checkout page sign while proceed to check out only ordering personalo account
    		 
    		 @DataProvider(name= "SignInAfter---CartAdded")
    	     public Object[][] getCredentialstosigninAfterCart(){
    			// Totals rows count
    					int rows = obj.getRowCount("SignINatCART");
    					// Total Columns
    					int column = obj.getColumnCount("SignINatCART");
    					int actRows = rows - 1;

    					Object[][] data = new Object[actRows][column];

    					for (int i = 0; i < actRows; i++) {
    						for (int j = 0; j < column; j++) {
    							data[i][j] = obj.getCellData("SignINatCART", j, i + 2);
    						}
    					}
    					return data;
    					}
    		 //////////////////////////////////////////////////////////////////
    		 ///Address details at check out
    		 
    		 @DataProvider(name= "AddressAtCartCheckout")
    	     public Object[][] getBillingAddressAtCart(){
    			// Totals rows count
    					int rows = obj.getRowCount("AddressAtCheckout");
    					// Total Columns
    					int column = obj.getColumnCount("AddressAtCheckout");
    					int actRows = rows - 1;

    					Object[][] data = new Object[actRows][column];

    					for (int i = 0; i < actRows; i++) {
    						for (int j = 0; j < column; j++) {
    							data[i][j] = obj.getCellData("AddressAtCheckout", j, i + 2);
    						}
    					}
    					return data;
    					}
    		 
    		 
	//Class --> LoginPageTest,HomePageTest Test Case--> loginTest, wishListTest, orderHistoryandDetailsTest

		@DataProvider(name = "credentials1")
		public Object[][] getCredentials() {
			// Totals rows count
			int rows = obj.getRowCount("Credentials");
			// Total Columns
			int column = obj.getColumnCount("Credentials");
			int actRows = rows - 1;

			Object[][] data = new Object[actRows][column];

			for (int i = 0; i < actRows; i++) {
				for (int j = 0; j < column; j++) {
					data[i][j] = obj.getCellData("Credentials", j, i + 2);
				}
			}
			return data;
		}

		
		@DataProvider(name = "endtoend")
		public Object[][] getDATAendToend() {
			// Totals rows count
			int rows = obj.getRowCount("endToendTest");
			// Total Columns
			int column = obj.getColumnCount("endToendTest");
			int actRows = rows - 1;

			Object[][] data = new Object[actRows][column];

			for (int i = 0; i < actRows; i++) {
				for (int j = 0; j < column; j++) {
					data[i][j] = obj.getCellData("endToendTest", j, i + 2);
				}
			}
			return data;
		}
	//Class --> AccountCreationPage  Test Case--> verifyCreateAccountPageTest	
		@DataProvider(name = "email")
		public Object[][] getEmail() {
			// Totals rows count
			int rows = obj.getRowCount("Email");
			// Total Columns
			int column = obj.getColumnCount("Email");
			int actRows = rows - 1;

			Object[][] data = new Object[actRows][column];

			for (int i = 0; i < actRows; i++) {
				for (int j = 0; j < column; j++) {
					data[i][j] = obj.getCellData("Email", j, i + 2);
				}
			}
			return data;
		}

	//Class --> AddToCartPageTest, EndToEndTest,  Test Case--> addToCartTest, endToEndTest	
		@DataProvider(name = "getProduct")
		public Object[][] getProduct() {
			// Totals rows count
			int rows = obj.getRowCount("ProductDetails");
			// Total Columns
			int column = obj.getColumnCount("ProductDetails");
			int actRows = rows - 1;

			Object[][] data = new Object[actRows][column];

			for (int i = 0; i < actRows; i++) {
				for (int j = 0; j < column; j++) {
					data[i][j] = obj.getCellData("ProductDetails", j, i + 2);
				}
			}
			return data;
		}

		// Class --> SearchResultPageTest, Test Case--> productAvailabilityTest
		@DataProvider(name = "searchProduct")
		public Object[][] getProductPrice() {
			// Totals rows count
			int rows = obj.getRowCount("SearchProduct");
			// Total Columns
			int column = obj.getColumnCount("SearchProduct");
			int actRows = rows - 1;

			Object[][] data = new Object[actRows][column];

			for (int i = 0; i < actRows; i++) {
				for (int j = 0; j < column; j++) {
					data[i][j] = obj.getCellData("SearchProduct", j, i + 2);
				}
			}
			return data;
		}
		
		@DataProvider(name = "newAcountDetailsData")
		public Object[][] accountCreation() {

			// Totals rows count
			int rows = obj.getRowCount("AccountCreationData");
			// Total Columns
			int column = obj.getColumnCount("AccountCreationData");
			int actRows = rows - 1;
			//Created an object of array to store data
			Object[][] data = new Object[actRows][1];
			
			for (int i = 0; i < actRows; i++) {
				Map<String, String> hashMap = new HashMap<>();
				for (int j = 0; j < column; j++) {
					hashMap.put(obj.getCellData("AccountCreationData", j, 1),
							obj.getCellData("AccountCreationData", j, i + 2));
				}
				data[i][0]=hashMap;
			}
			return data;
		}

	}



