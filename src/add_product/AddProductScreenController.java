package add_product;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import product_management.ProductScreen;

public class AddProductScreenController {
	
	@FXML
	private TextArea productNames;
	
	@FXML
	private TextArea id;
	
	@FXML
	private TextArea price;
	
	@FXML
	private TextArea quantity;
	
	@FXML
	private TextArea category;
	
	@FXML
	private Button save;
	
	@FXML
	private Button cancel;
	
	
	public void saveProductINFO(ActionEvent event) {

		String query = "INSERT INTO products(productName,ID,price,quantity,category) Values ('" + productNames.getText() + "','" + id.getText()
				+ "','" +price.getText() + "','"+quantity.getText()+"','"+category.getText()+"')";
		dbUtils.DBUtils.executeQuery(query);
	}
	
    public void cancelProduct(ActionEvent event) {
    	ProductScreen.showProductScreen();
	}

   
}
