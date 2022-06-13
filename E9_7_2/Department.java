package E9_7_2;

public class Department
{
    public static void main(String [] args) throws CloneNotSupportedException {
	
	//for cloning acces variabel
	
	Employee e= new Employee("ram");
	Employee e2=(Employee)e.clone();
	e2.name="shyam";
	e2.add.locadd="indore";
	e2.add.paradd="lon";
     
	
	  System.out.println("Name "+e.name) ;
	  System.out.println("Local Address "+e.add.locadd) ;
	  System.out.println("Pramanent Address "+e.add.paradd) ;
	  
	  System.out.println("Name "+e2.name) ;
	  System.out.println("local Address "+e2.add.locadd) ;
	  System.out.println("param Address "+e2.add.paradd) ;
	 
	//code aplly only if Employ Extend Addres
	
		/*
		 * Employee e3= new Employee(); e.setName("ravi"); e.setLocadd("ind");
		 * e.setParadd("indore");
		 * 
		 * 
		 * System.out.println("Name "+e.getName()) ;
		 * System.out.println("Local Address "+e.getParadd()) ;
		 * System.out.println("Pramanent Address "+e.getLocadd()) ;
		 * 
		 * Employee e1= (Employee) e.clone(); e1.setName("ram"); e1.setLocadd("bharat");
		 * e1.setParadd("london");
		 * 
		 * 
		 * System.out.println("Name "+e1.getName()) ;
		 * System.out.println("Parmanent Address "+e1.getParadd()) ;
		 * System.out.println("Local Address "+e1.getLocadd()) ;
		 */
		 
	}
}


