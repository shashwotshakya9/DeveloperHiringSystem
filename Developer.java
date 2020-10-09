
//creating developer calss
public class Developer
{
    String platform;
    String Interviewer_Name;
    int working_Hours;
    String Developer_Name;
    
    
    public Developer(String platform,String Interviewer_Name,int working_Hours){
        this.platform=platform;
        this.Interviewer_Name=Interviewer_Name;
        this.working_Hours=working_Hours;
        Developer_Name="";
    }
    public String getplatform(){
        return platform;
    }
    public String getInterviewer_Name(){
        return Interviewer_Name;
    }
    public int getworking_Hours(){
        return working_Hours;
    }
    public void setDeveloperName(String Developer_Name){
        this.Developer_Name=Developer_Name;
    }   
    public String getDeveloperName(){
        return Developer_Name;
    }
    public void display(){
         /*
          * creating the display method to display the details of the developer
          */
        
        System.out.println("The platfrom of the interviewer is "+ this.platform);
        System.out.println("The name of the interviewer is "+ this.Interviewer_Name);
        System.out.println("The total working hours is "+ this.working_Hours);
        if (!Developer_Name.equals("")){
            System.out.println("The name of the Interviewer is"+this.Developer_Name);
        }
    
    }
}
