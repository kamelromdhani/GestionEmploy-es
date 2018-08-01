package gestionemployee;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.StringTokenizer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class UpdateDelete {

	

	
	@FXML	
	TextField idEmployee;
        
	@FXML	
	private TextField fname1;
	@FXML
	private TextField lname1;
	@FXML
	private TextField salary1;
	@FXML
	private TextField age1;
	@FXML
	private TextField department1;
	@FXML
	private TextField address1;
	 
	@FXML
	private TextField gender1;
	@FXML
	private TextField education1;
	@FXML
	private TextField experience1;
 
	@FXML
	private TextField nationality1;
	@FXML
	private TextField mother_language1;
	@FXML
	private TextField other_language1;
	@FXML
	private TextField date_of_birth1;
	@FXML
	private TextField contract_start1;
	@FXML
	private TextField contract_end1;
	
        @FXML
	public void getEmployeeById(ActionEvent e) throws IOException {
         try{
 BufferedReader entree=new BufferedReader(new FileReader("employee.txt"));
	String ligne;
        while((ligne=entree.readLine())!=null){
            System.out.println(ligne);
            StringTokenizer str=new StringTokenizer(ligne,"#");
           String tel=str.nextToken();
            if(tel.equals(idEmployee.getText())){
            
            address1.setText( str.nextToken());
            contract_end1.setText(str.nextToken());
            contract_start1.setText(str.nextToken());
	    date_of_birth1.setText(str.nextToken());
            department1.setText( str.nextToken());
            education1.setText( str.nextToken());
            experience1.setText( str.nextToken());
	    fname1.setText(str.nextToken());
            gender1.setText(str.nextToken());
	    lname1.setText(str.nextToken());
            mother_language1.setText( str.nextToken());
            nationality1.setText( str.nextToken());
            other_language1.setText(str.nextToken());
            age1.setText(str.nextToken());
	    salary1.setText(str.nextToken());break;
            }}
        System.out.println("out of while");
	   entree.close();
         }
         catch(IOException x){
             
         }
		
	}
	
	
	@FXML
	private void updateEmployee(ActionEvent e) throws IOException, ParseException, ClassNotFoundException{
		
             int status;
		try{
        BufferedReader entree=new BufferedReader(new FileReader("employee.txt"));
        PrintWriter sortie=new PrintWriter(new FileWriter("copie.txt",true));
        String ligne,tel;
            while((ligne=entree.readLine())!=null){
                StringTokenizer str=new StringTokenizer(ligne,"#");
                
                tel=str.nextToken();
                
                if(idEmployee.getText().equals(tel))
        sortie.println (idEmployee.getText()+"#"+address1.getText()+"#"+contract_end1.getText()+"#"+contract_start1.getText()+"#"+date_of_birth1.getText()+"#"+department1.getText()+"#"+education1.getText()+"#"+experience1.getText()+"#"+fname1.getText()+"#"+gender1.getText()+"#"+lname1.getText()+"#"+mother_language1.getText()+"#"+nationality1.getText()+"#"+other_language1.getText()+"#"+age1.getText()+"#"+salary1.getText()); 
                else
                    sortie.println(ligne);
                
            }
            sortie.close();
            entree.close();
            File employee = new File("employee.txt");
            employee.delete();
            File copie = new File("copie.txt");
            File f1 = new File("employee.txt");
            copie.renameTo(f1);
            status=1;
        
        }
        catch(IOException x){
            status=-1;
        }
		/*String sid=idEmployee.getText();  
                int id=Integer.parseInt(sid);
	    
	    String textfName        =     fname1.getText();
	    String textlName        =     lname1.getText();
	    float textsalary        =     Float.parseFloat(salary1.getText());
	    int textage             =     Integer.parseInt(age1.getText());
	    String textdepart       =     department1.getText();
	    String textaddress      =     address1.getText();
	    String textnation       =     nationality1.getText();
	    String textgender       =     gender1.getText();
	    String texteducation    =     education1.getText();
	    String textexperience   =     experience1.getText();
	    String textmother      =     mother_language1.getText();
	    String textother      =     other_language1.getText();
	    String textbirth      =     date_of_birth1.getText();
	    String textstart      =     contract_start1.getText();
	    String textend      =     contract_end1.getText();
     
	    Employee emp=new Employee();  
	    
        emp.setId(id);
		emp.setFname(textfName);
		emp.setLname(textlName);
		emp.setSalary(textsalary);
		emp.setAge(textage);
		emp.setDepartment(textdepart);
		emp.setAddress(textaddress);
		emp.setDate_of_birth(textbirth);
		emp.setGender(textgender);
		emp.setEducation(texteducation);
		emp.setExperience(textexperience);
		emp.setContract_start(textstart);
		emp.setContract_end(textend);
		emp.setNationality(textnation);
		emp.setMother_language(textmother);
		emp.setOther_language(textother); 
	  
		
	
	
	
	   */  
        if(status>0){  
        	
        	
  		  Alert alert = new Alert(AlertType.INFORMATION);
  		  alert.setTitle("Data update");
  		  alert.setHeaderText("Information Dialog");
  		  alert.setContentText("Record updated successfully!");

  		  alert.showAndWait();
        	
        	
        	// System.out.println(" Record saved successfully! ");
        }else{ 
        	
  		  Alert alert = new Alert(AlertType.ERROR);
  		  alert.setTitle("Data update");
  		  alert.setHeaderText("ERROR Dialog");
  		  alert.setContentText("Sorry! unable to update record");

  		  alert.showAndWait();	
        //	System.out.println("Sorry! unable to update record");  
        }  
          
	
	
	
	
	
	
	}	
	
	
	
	
	
	
	public void deleteEmployee(ActionEvent e) throws IOException, ParseException, FileNotFoundException, ClassNotFoundException{
		
		int status;
		  
 
	     try{
        BufferedReader entree=new BufferedReader(new FileReader("employee.txt"));
        PrintWriter sortie=new PrintWriter(new FileWriter("copie.txt",true));
        String ligne,phone;
            while((ligne=entree.readLine())!=null){
                StringTokenizer str=new StringTokenizer(ligne,"#");
                
                phone=str.nextToken();
                
                if(!(phone.equals(idEmployee.getText())))              
                    sortie.println(ligne);
                
            }
            sortie.close();
            entree.close();
            File employee = new File("employee.txt");
            employee.delete();
            File copie = new File("copie.txt");
            File f1 = new File("employee.txt");
            copie.renameTo(f1);
        status= 1;
        }
        catch(IOException x){
            status= -1;
        }
	     
	        if(status>0){  
	        	
	        	
	  		  Alert alert = new Alert(AlertType.INFORMATION);
	  		  alert.setTitle("Data delete");
	  		  alert.setHeaderText("Information Dialog");
	  		  alert.setContentText("Record deleted successfully!");

	  		  alert.showAndWait();
	        	
	        	
	      //  	 System.out.println(" Record deleted successfully! ");
	        }else{ 
	        	
	  		  Alert alert = new Alert(AlertType.ERROR);
	  		  alert.setTitle("Data update");
	  		  alert.setHeaderText("ERROR Dialog");
	  		  alert.setContentText("Sorry! unable to delete record");

	  		  alert.showAndWait();
	        	
	        	
	        	
	        	
	  //      	System.out.println("Sorry! unable to update record");  
	        }  
	          
		     
	     
	     
	     
	     
	     
	     
	     
	    
	  
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
