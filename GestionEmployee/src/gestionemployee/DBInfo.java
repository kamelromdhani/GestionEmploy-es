package gestionemployee;


import java.util.ArrayList;
import java.util.List;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.StringTokenizer;
 

public class DBInfo implements Serializable{
	
	public static int save (Employee emp) throws IOException{
		
		
                try{
            PrintWriter sortie=new PrintWriter(new FileWriter("employee.txt",true));
        sortie.println (emp.getId()+"#"+emp.getAddress()+"#"+emp.getContract_end()+"#"+emp.getContract_start()+"#"+emp.getDate_of_birth()+"#"+emp.getDepartment()+"#"+emp.getEducation()+"#"+emp.getExperience()+"#"+ emp.getFname()+"#"+emp.getGender()+"#"+emp.getLname()+"#"+emp.getMother_language()+"#"+ emp.getNationality()+"#"+emp.getOther_language()+"#"+emp.getAge()+"#"+emp.getSalary()); 
        sortie.close();
        return 1;
        }
        catch(IOException e){
            return -1;
        }
}	
	
	
public static int update(Employee emp) throws IOException, ClassNotFoundException{
		
	try{
        BufferedReader entree=new BufferedReader(new FileReader("employee.txt"));
        PrintWriter sortie=new PrintWriter(new FileWriter("copie.txt",true));
        String ligne,phone;
            while((ligne=entree.readLine())!=null){
                StringTokenizer str=new StringTokenizer(ligne,"#");         
                phone=str.nextToken();
                
                if(emp.getId()==Integer.parseInt(phone))
        sortie.println (emp.getId()+"#"+emp.getAddress()+"#"+emp.getContract_end()+"#"+emp.getContract_start()+"#"+emp.getDate_of_birth()+"#"+emp.getDepartment()+"#"+emp.getEducation()+"#"+emp.getExperience()+"#"+ emp.getFname()+"#"+emp.getGender()+"#"+emp.getLname()+"#"+emp.getMother_language()+"#"+ emp.getNationality()+"#"+emp.getOther_language()+"#"+emp.getAge()+"#"+emp.getSalary()); 
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
        return 1;
        }
        catch(IOException e){
            return -1;
        }
	}
	
	
public static int delete(String id) throws FileNotFoundException, IOException, ClassNotFoundException{
	
        try{
        BufferedReader entree=new BufferedReader(new FileReader("employee.txt"));
        PrintWriter sortie=new PrintWriter(new FileWriter("copie.txt",true));
        String ligne,phone;
            while((ligne=entree.readLine())!=null){
                StringTokenizer str=new StringTokenizer(ligne,"#");
                
                phone=str.nextToken();
                
                if(!(id.equals(phone)))              
                    sortie.println(ligne);
                
            }
            sortie.close();
            entree.close();
            File employee = new File("employee.txt");
            employee.delete();
            File copie = new File("copie.txt");
            File f1 = new File("employee.txt");
            copie.renameTo(f1);
        return 1;
        }
        catch(IOException e){
            return -1;
        }
}
	
	
	
public static Employee  getEmployeeId(String id) throws FileNotFoundException, IOException, ClassNotFoundException{
	
	Employee emp = new Employee();
	
	
        BufferedReader entree=new BufferedReader(new FileReader("employee.txt"));
	String ligne,phone;
        while((ligne=entree.readLine())!=null){
            StringTokenizer str=new StringTokenizer(ligne," ");
            phone=str.nextToken();
            if(id.equals(phone)){
            emp.setId(Integer.parseInt(phone));
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
            break;}
                    
                }
       
            System.out.println(emp.getAddress());
            System.out.println(emp.getId());
            System.out.println(emp.getContract_end());
            System.out.println(emp.getContract_start());
            System.out.println(emp.getGender());
            entree.close();
	return emp;
	
}



public static List<Employee>  getEmployee() throws FileNotFoundException, IOException, ClassNotFoundException{
	
	List<Employee> list = new ArrayList<Employee>();
        BufferedReader entree=new BufferedReader(new FileReader("employee.txt"));
	Employee emp=new Employee();
        String ligne;
	while((ligne=entree.readLine())!=null){
                        StringTokenizer str=new StringTokenizer(ligne," ");
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
                    list.add(emp);
                }
	entree.close();
	
	return list;
	
}	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
}
