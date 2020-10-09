// creaating junior developer class that extends the developer class 
public class JuniorDeveloper extends Developer
{
    float salary;
    String appointedDate;
    String evaluationPeriod;
    String terminationDate;
    String specialization;
    String appointedBy;
    boolean joined;      
    //constructor with 6 attribtes
    public JuniorDeveloper(String platform,String Interviewer_Name,int working_Hours,float salary,String appointedBy,String terminationDate)
    {
       super(platform,Interviewer_Name,working_Hours);
       this.salary=salary;
       this.appointedBy=appointedBy;
       this.terminationDate=terminationDate;
       this.appointedDate="";
       this.evaluationPeriod="";
       this.specialization="";
       this.joined=false;    
    }
    public float getsalary(){//getter method for salary
       return this.salary;
    }
    public String getappointedBy(){//getter method for appointed by whom
       return this.appointedBy;
    }
    public String getterminationDate(){//getter method for the termination date
       return this.terminationDate;
    }
    
    public String getappointedDate(){//getter method for the appointed date
       return this.appointedDate;
    }
    public String getevaluationPeriod(){//getter method for evaluation period
       return this.evaluationPeriod; 
    }
    
    public String getspecialization(){//getter method for specialization
        return this.specialization;
    }
    
    
    public boolean getjoined(){//get method if developer joined or not
        return this.joined;
    }
    public void setsalary(int changedSalary){//to set the new salary if developer has not joined 
       if(this.joined==false){// check if the developer is joined
           this.salary=changedSalary;
        }
       else{
           System.out.println("The salary cannot be changed, the developer has started working");
    }
    }
    public void appointDeveloper(String developername,String appointedDate,String terminationDate,String specialization){
        if(this.joined==false){
            /*
             * check if the developer has joined
             */
            super.setDeveloperName(Developer_Name);
            /*
             * calling the method to set the name of the developer from the super class
             */
            this.joined=true;
            this.appointedDate=appointedDate;
            this.terminationDate=terminationDate;
            this.specialization=specialization;
            System.out.println("The Developer has been appointed. New developer was hired on: "+getappointedDate());
            }
        else{//displaying if the developer has already joined with the date of appointed
            System.out.println("The developer is already appointed. The date of appointed is:"+getappointedDate());
            }
    }
    public void displaydetails(){//this method display the details of the junior developer
            super.display();//displays the display method of the developer class
            System.out.println("The developer has appointed at: "+getappointedDate());
            System.out.println("The name of the developer name is: "+super.getDeveloperName());
            System.out.println("Evaluation period: "+getevaluationPeriod());
            System.out.println("Terminates in: "+getterminationDate());
            System.out.println("The salary of the developer is: "+getsalary());
            System.out.println("Specialization of developer: "+getspecialization());
            System.out.println("The developer is appointed by : "+getappointedBy());
        }
    
    
}
