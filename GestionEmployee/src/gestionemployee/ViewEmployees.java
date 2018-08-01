package gestionemployee;

import java.net.URL;
import java.util.ResourceBundle;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ViewEmployees implements Initializable{


	
	/*@FXML 
	private TableView<Employee> table;
	@FXML 
	private TableColumn<Employee,Integer> id;
	@FXML 
	private TableColumn<Employee,String> fname;
	@FXML 
	private TableColumn<Employee,String> lname;
	@FXML 
	private TableColumn<Employee,Float> salary;
	@FXML 
	private TableColumn<Employee,Integer> age;
	@FXML 
	private TableColumn<Employee,String> department;
	@FXML 
	private TableColumn<Employee,String> address;
	@FXML 
	private TableColumn<Employee,String> date_of_birth;*/
 
        @FXML
    private ListView<Integer> phoneList;
        @FXML
    private ListView<String> nameList;
        @FXML
    private ListView<Float> salaryList;
        @FXML
    private ListView<String> departmentList;
        @FXML
    private ListView<String> contract_startList;
        @FXML
    private ListView<String> contract_endList;
    
ObservableList<Integer> phoneitems =FXCollections.observableArrayList ();
ObservableList<String> nameitems =FXCollections.observableArrayList ();
ObservableList<Float> salaryitems =FXCollections.observableArrayList ();
ObservableList<String> departmentitems =FXCollections.observableArrayList ();
ObservableList<String> contract_startitems =FXCollections.observableArrayList ();
ObservableList<String> contract_enditems =FXCollections.observableArrayList ();

	
 //public	ObservableList<Employee> data = FXCollections.observableArrayList();
	  
 
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
		String ligne;
                Employee emp=new Employee();
                
        BufferedReader entree = null;
            try {
                entree = new BufferedReader(new FileReader("employee.txt"));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ViewEmployees.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                while((ligne=entree.readLine())!=null){
                    StringTokenizer str=new StringTokenizer(ligne,"#");
                    emp.setId(Integer.parseInt(str.nextToken()));
            emp.setAddress(str.nextToken());
            emp.setContract_end(str.nextToken());
            emp.setContract_start(str.nextToken());
            emp.setDate_of_birth(str.nextToken());        
            emp.setDepartment(str.nextToken());
            emp.setEducation(str.nextToken());
            emp.setExperience(str.nextToken());
            emp.setFname(str.nextToken());
            emp.setGender(str.nextToken());
            emp.setLname(str.nextToken());
            emp.setMother_language(str.nextToken());
            emp.setNationality(str.nextToken());
            emp.setOther_language(str.nextToken());            
            emp.setAge(Integer.parseInt(str.nextToken()));
            emp.setSalary(Float.parseFloat(str.nextToken()));
            phoneitems.add(emp.getId());
            nameitems.add(emp.getLname()+" "+emp.getFname());
            salaryitems.add(emp.getSalary());
            departmentitems.add(emp.getDepartment());
            contract_startitems.add(emp.getContract_start());
            contract_enditems.add(emp.getContract_end());
                }   }
            
            catch (IOException ex) {
                Logger.getLogger(ViewEmployees.class.getName()).log(Level.SEVERE, null, ex);
            }
        phoneList.setItems(phoneitems);
        nameList.setItems(nameitems);
        salaryList.setItems(salaryitems);
        departmentList.setItems(departmentitems);
        contract_startList.setItems(contract_startitems);
        contract_endList.setItems(contract_enditems)   ;    
            try {
                entree.close();
                } catch (IOException ex) {
                Logger.getLogger(ViewEmployees.class.getName()).log(Level.SEVERE, null, ex);
            }
                //try {
                /*String sql = "SELECT * FROM `employee` WHERE 1";
                Connection con = DBInfo.getConnection();
                PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(sql);
                
                ResultSet rs = preparedStatement.executeQuery();*/
                
                
                /*BufferedReader entree=new BufferedReader(new FileReader("employee.txt"));
                String ligne;
                while((ligne=entree.readLine())!=null){
                Employee emp=new Employee();
                StringTokenizer str=new StringTokenizer(ligne,"#");
                emp.setAddress(str.nextToken());
                emp.setAge(Integer.parseInt(str.nextToken()));
                emp.setContract_end(str.nextToken());
                emp.setDate_of_birth(str.nextToken());
                emp.setDepartment(str.nextToken());
                emp.setEducation(str.nextToken());
                emp.setExperience(str.nextToken());
                emp.setFname(str.nextToken());
                emp.setGender(str.nextToken());
                emp.setId(Integer.parseInt(str.nextToken()));
                emp.setLname(str.nextToken());
                emp.setMother_language(str.nextToken());
                emp.setNationality(str.nextToken());
                emp.setOther_language(str.nextToken());
                emp.setSalary(Float.parseFloat(str.nextToken()));
                data.add(emp);
                
                }
                entree.close();
                
                }  catch (FileNotFoundException ex) {
                Logger.getLogger(ViewEmployees.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                Logger.getLogger(ViewEmployees.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
                
                id.setCellValueFactory(new PropertyValueFactory<Employee,Integer>("id"));
                fname.setCellValueFactory(new PropertyValueFactory<Employee,String>("fname"));
                lname.setCellValueFactory(new PropertyValueFactory<Employee,String>("lname"));
                salary.setCellValueFactory(new PropertyValueFactory<Employee,Float>("salary"));
                age.setCellValueFactory(new PropertyValueFactory<Employee,Integer>("age"));
                department.setCellValueFactory(new PropertyValueFactory<Employee,String>("department"));
                address.setCellValueFactory(new PropertyValueFactory<Employee,String>("address"));
                date_of_birth.setCellValueFactory(new PropertyValueFactory<Employee,String>("date_of_birth"));
                
                
                table.setItems(data);*/
            
 	
 	
	}
 
	
	
	
 
	
	
	
	
	
	
	
}
