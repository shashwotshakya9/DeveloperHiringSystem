
public class SeniorDeveloper extends Developer//creating senior Developerclass that extends developer clsss
{
    int salary;
    String staffRoomno;
    String joiningDate;
    int contractPeriod;
    double advanceSalary;
    boolean appointed;
    boolean terminated;
    public SeniorDeveloper(String platform,String Interviewer_Name,int working_Hours,int salary,int contractPeriod){
        //calling super calss constructor
        super(platform,Interviewer_Name,working_Hours);
        this.salary = salary;
        this.contractPeriod = contractPeriod;
        joiningDate= " ";
        staffRoomno= " ";
        advanceSalary = 0.0;
        appointed = false;
        terminated = false;        
    }

    public int getsalary(){//getter method for salary
        return salary; 
    }
    public int getcontractPeriod(){//getter method for contractperiod
        return contractPeriod;
    }
    
    public String getjoiningDate(){//getter method for joining date
        return joiningDate;
    }
    public String getstaffRoom(){//getter method for the staff room no
        return staffRoomno;
    }
    public double getadvanceSalary(){//getter for advance salary
    return this.advanceSalary;
    }
    public boolean getappointed(){//getter for appointed status
    return this.appointed;
    }
    public boolean getterminated(){//getter for termination status
    return this.terminated;
    }
    public void setsalary(int newSalary){//setter method to set new salary to developer
        this.salary=newSalary;
    }
    public void setContractperiod(int newContractperiod){//setter method to set the contract period
        this.contractPeriod=newContractperiod;
    }
    public void sethireDeveloper(String newDevelopername, String joiningDate,double advanceSalary,String staffRoomno){
    if(this.appointed==true){
        /*
         checking if the developer is appointed or not
         */
        System.out.println("The interviewer's name is:"+getInterviewer_Name());
        System.out.println("Staff room no is:"+getstaffRoom());
      }
    else{
        /*
         calling the super class method to set the developer name
         */
        super.setDeveloperName(Developer_Name);
        this.joiningDate=joiningDate;
        this.advanceSalary=advanceSalary;
        this.staffRoomno=staffRoomno;
        this.appointed=true;
        this.terminated=false;
        System.out.println("Joining Date:"+getjoiningDate());
        System.out.println("Advance Salary:"+getadvanceSalary());
        System.out.println("Staff RoomNo:"+getjoiningDate());
        System.out.println("Developer has been hired");
        }
    }
    public void contractTermination(){
        /*
         * method to check the contract termination 
         */
        if(this.terminated==true){
            System.out.println("The contract of the developer is already terminated");
        }
        else{
            System.out.println("Your contract is over. time to leave: ");
            System.out.println("Hired date of the developer was"+getjoiningDate());
            super.setDeveloperName("");
            this.joiningDate="";
            this.advanceSalary=0.0;
            this.appointed=false;
            this.terminated=true;
        }
    }
    public void DeveloperDetails(){
        /*
         * method to platform, interviewer name and developersalary
         */
        System.out.println("The platform is "+super.getplatform());
        System.out.println("The name of the interviewer is : "+ super.getInterviewer_Name());
        System.out.println("The salary of the developer is: "+ getsalary());
        }
    public void Display(){
        /*
         * method to display the details for the senior developer
         */
        if(this.appointed==true){
            super.display();
            System.out.println("Appointed status: " +getappointed());
            System.out.println("Joining date:"+ getjoiningDate());
            System.out.println("the payment of advance salary: "+ getadvanceSalary());
        }else if (this.terminated==true){
            System.out.println("the contract for the developer is already terminated");
        }else{
            System.out.println("The contract period is not over yet");
        }
    
    }
}