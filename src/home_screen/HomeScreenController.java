package home_screen;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import product_management.ProductScreen;
import user_management.UserManagementScreen;

public class HomeScreenController {
	
	@FXML
	private Button usermanagement;

	@FXML
	private Button productmanagement;
	
	@FXML
	private Button quit;
	
	public void showUserManagement(ActionEvent event) {
		UserManagementScreen.showUserManagementScreen();
		
	}
	
    public void showProductManagement(ActionEvent event) {
    	ProductScreen.showProductScreen();
	}
    
    public void backTOHomePage(ActionEvent event) {
	
    }
    
    

}
