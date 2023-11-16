package user_management;

import add_user.AddUserScreen;
import home_screen.HomeScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class UserManagementScreenController {
	
	@FXML
	private Button addUser;
	
	@FXML
	private Button searchUser;
	
	@FXML
	private Button editUser;
	
	@FXML
	private Button quitUser;
	
	@FXML
	private Button deleteUser; 
	
	public void AddUser(ActionEvent event) {
		AddUserScreen.showAddUserScreen();
	}
	
   public void SearchUser(ActionEvent event) {
	   search_user.SearchUser.showUserScreen();
	}
  
   public void EditUser(ActionEvent event) {
	   search_user.SearchUser.showUserScreen();
   }

   public void QuitUser(ActionEvent event) {
	   HomeScreen.showHomeScreen();
   }

   public void DeleteUser(ActionEvent event) {
	   search_user.SearchUser.showUserScreen();
   }
	
	
	
}
