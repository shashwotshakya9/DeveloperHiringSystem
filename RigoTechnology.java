
/**
 * Write a description of class RigoTechnology here.
 *
 * @author (Hardik Poudel)
 * @version (0.1)
 */
    import java.awt.event.*;
    import javax.swing.*;
    import java.util.*;
public class RigoTechnology implements ActionListener
{ //setting all the attributes that we need in creating the frame
    JFrame DA;
    JLabel  name1,name2,line,line2,thePlatform, interviewerName,workingHours,salary,joiningDate,staffRoomNumber,contractPeriod,workingHours1, salary1, 
    appointedBy, terminationDate,evaluationPeriod,specialization,advanceSalary,developerName,developerNo,platform2,intervewName,salary2,devName,appointDate
    ,terminationDate2,devNo;
    //creating array list
    ArrayList<Developer> list=new ArrayList<Developer>();
    JTextField txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9,txt10,txt11,txt13,txt15,txt16,txt17,txt18,txt19,txt20,txt21,txt22,txt23;
    JButton addSenior,appointSenior,terminateDev,addJunior,exit,clear,appointJunior,displayAl;
    
    public void setComponents()
    {
        DA=new JFrame("Developer Appoint System");
        DA.setLayout(null);
        //setting the values for the platform
        thePlatform= new JLabel("Platform:");
        name1= new JLabel("Senior Developer");
        name2= new JLabel("Junior Developer");
        line= new JLabel("==============");
        line2= new JLabel("==============");
        line.setBounds(15,18,120,30);
        line2.setBounds(15,340,120,30);
        thePlatform.setBounds(35,40,120,30);
        name1.setBounds(15,5,150,40);
        name2.setBounds(15,327,150,40);
        DA.add(name1);
        DA.add(line);
        DA.add(name2);
        DA.add(line2);
        DA.add(thePlatform);
        
        txt1= new JTextField();
        txt1.setBounds(160,40,410,25);
        DA.add(txt1);
        //setting the interviewer name
        interviewerName=new JLabel("Interviewer's name: ");
        interviewerName.setBounds(35,70,120,30);
        DA.add(interviewerName);
        
        //text field for the interviewer name 
        txt2= new JTextField();
        txt2.setBounds(160,70,410,25);
        DA.add(txt2);
       
        //setting the working hour
        
        workingHours=new JLabel("Working Hours: ");
        workingHours.setBounds(35,100,120,30);
        DA.add(workingHours);
        
        //textfield for the working hour
        txt3= new JTextField();
        txt3.setBounds(160,100,140,25);
        DA.add(txt3);
        
        //setting for the salary
        salary= new JLabel("Salary: ");
        salary.setBounds(350,100,100,30);
        DA.add(salary);
        //setting textfield for the salary
        txt15= new JTextField();
        txt15.setBounds(430,100,140,25);
        DA.add(txt15);
        
        
        //setting for the contract period
        contractPeriod =new JLabel("Contract Period:");
        contractPeriod.setBounds(35,130,150,30);
        txt4= new JTextField();
        //setting text field for the contract period
        txt4.setBounds(160,130,140,25);
        DA.add(txt4);
        DA.add(contractPeriod);
        
        //for the add button to add the developer
        addSenior= new JButton("Add");
        addSenior.setBounds(470,140,100,25);
        DA.add(addSenior );
        
        //line break.
        //-------------------------------------------setting for advance salary
        advanceSalary = new JLabel("Advance Salary");
        txt8 = new JTextField("");
        advanceSalary.setBounds(35,250,120,30);
        txt8.setBounds(160,250,140,25);
        DA.add(advanceSalary);
        DA.add(txt8);
        
         //setting for the developer name
        developerName = new JLabel("Developer's Name:");
        developerName.setBounds(35,190,120,30);
        txt7 = new JTextField("");
        txt7.setBounds(160,190,410,25);
        DA.add(developerName);
        DA.add(txt7);
        
        //setting developer no
        developerNo = new JLabel("Developer-No:");
        txt16 = new JTextField();
        developerNo.setBounds(323,250,120,30);
        txt16.setBounds(430,250,140,25);
        DA.add(developerNo);
        DA.add(txt16);
        
        //setting for joining date
        joiningDate=new JLabel("Joining date: ");
        joiningDate.setBounds(35,220,120,30);
        DA.add(joiningDate);
        
        //textfield for joining date
        txt5= new JTextField();
        txt5.setBounds(160,220,140,25);
        DA.add(txt5);
        
        //setting for the staff room no(text field and jlabel)
        staffRoomNumber=new JLabel("Staff Room-No:");
        staffRoomNumber.setBounds(323,220,120,30);
        DA.add(staffRoomNumber);
        
        txt6= new JTextField();
        txt6.setBounds(430,220,140,25);
        DA.add(txt6);
      
        
        //setting appoint button
        appointSenior= new JButton("Appoint");
        appointSenior.setBounds(470,280,100,25);
        DA.add(appointSenior);
        terminateDev =new JButton("Terminate");
        terminateDev.setBounds(160,280,100,25);
        DA.add(terminateDev);
        
        // for the junior developer
        //setting platform
        platform2=new JLabel("Platform:");
        txt17 = new JTextField();
        platform2.setBounds(35,362,120,30);
        txt17.setBounds(160,362,410,25);
        DA.add(platform2);
        DA.add(txt17);
        
        //setting interviewer name
        intervewName = new JLabel ("Interviewer's Name:");
        txt18 =new JTextField();
        intervewName.setBounds(35,392,120,30);
        txt18.setBounds(160,392,410,25);
        DA.add(intervewName);
        DA.add(txt18);
        
        //setting salary for junior developer
        salary2= new JLabel("Salary:");
        txt19 = new JTextField();
        salary2.setBounds(35,422,120,30);
        txt19.setBounds(160,422,140,25);
        DA.add(salary2);
        DA.add(txt19);
        
        //setting appointed by
        appointedBy=new JLabel("Appointed By: ");
        appointedBy.setBounds(328,422,140,30);
        DA.add(appointedBy);
        txt10= new JTextField();
        txt10.setBounds(430,422,140,25);
        DA.add(txt10);
        
        //setting termination date for adding the junior developer
        terminationDate= new JLabel("Termination date: ");
        terminationDate.setBounds(35,452,120,30);
        DA.add(terminationDate);
        //textfield for termination date
        txt11= new JTextField();
        txt11.setBounds(160,452,140,25);
        DA.add(txt11);
        
        //setting the working hours
        workingHours1=new JLabel("Working Hours: ");
        workingHours1.setBounds(325,452,120,30);
        DA.add(workingHours1);
        //setting textfield for working hours
        txt9= new JTextField();
        txt9.setBounds(430,452,140,25);
        DA.add(txt9);
        
        //setting add button for junior developer
        addJunior = new JButton("Add");
        addJunior.setBounds(470,482,100,30);
        DA.add(addJunior);
        
       
        
        // setting developer name 
        devName = new JLabel("Developer's Name:");
        txt20 = new JTextField();
        devName.setBounds(35,532,120,30);
        txt20.setBounds(160,532,410,25);
        DA.add(devName);
        DA.add(txt20);
        
        //setting for specialization
        specialization=new JLabel("Specialization: ");
        specialization.setBounds(35,562,120,30);
        DA.add(specialization);
        
        txt13= new JTextField();
        txt13.setBounds(160,562,140,25);
        DA.add(txt13);
        
        //setting the termination date for the junior developer
        terminationDate2 = new JLabel("Termination Date:");
        txt21 = new JTextField();
        terminationDate2.setBounds(35,592,120,30);
        txt21.setBounds(160,592,140,25);
        DA.add(terminationDate2);
        DA.add(txt21);
        
        //Setting for the developer no
        devNo = new JLabel("Developer-No:");
        txt22= new JTextField();
        devNo.setBounds(328,562,120,30);
        txt22.setBounds(430,562,140,25);
        DA.add(devNo);
        DA.add(txt22);
        
        //setting for the appoint date
        appointDate = new JLabel("Appointed-Date");
        txt23 = new JTextField();
        appointDate.setBounds(328,592,120,30);
        txt23.setBounds(430,592,140,25);
        DA.add(appointDate);
        DA.add(txt23);
        
        
        //setting the buttons for the junior developer class
        //setting appoint button for the appoint of the junior developer
        appointJunior = new JButton("Appoint");
        displayAl = new JButton("Display All");
        clear= new JButton("Clear");
        exit = new JButton("Exit");
        clear.setBounds(470,624,100,30);
        exit.setBounds(470,654,100,30);
        appointJunior.setBounds(160,622,100,30);
        displayAl.setBounds(160,652,100,30);
        DA.add(exit);
        DA.add(clear);
        DA.add(displayAl);
        DA.add(appointJunior);
        
        //now adding the action listner
        exit.addActionListener(this);
        appointJunior.addActionListener(this);
        clear.addActionListener(this);
        displayAl.addActionListener(this);
        addSenior.addActionListener(this);
        terminateDev.addActionListener(this);
        appointSenior.addActionListener(this);
        addJunior.addActionListener(this);
        DA.setSize(620,950);
        DA.setVisible(true);
        
    }
    public void addSeniorDev()
    {
        String plat = txt1.getText();
        String name = txt2 .getText();
        String hours = txt3.getText();
        String period = txt4.getText();
        String salary = txt15.getText();
        if( plat.equals("") || name.equals(""))
        {//|| hours.equals("") || period.equals("")|| salary.equals(""))
            JOptionPane.showMessageDialog(DA,"The field are left empty:","Warning",JOptionPane.WARNING_MESSAGE);
        }
        try{
            int hours1 = Integer.parseInt(hours);
            int salary1 = Integer.parseInt(salary);
            int period1 = Integer.parseInt(period); 
            // this is just for the testing purpose and later i comment it 
            //JOptionPane.showMessageDialog(DA,plat +":"+ name +":"+ hours +":"+ period +":"+ salary);
            
            SeniorDeveloper s =new SeniorDeveloper(plat,name,hours1,salary1,period1);
            list.add(s);
            JOptionPane.showMessageDialog(DA,"Interviewer is added sucessfully");
            txt1.setText("");
            txt2.setText("");
            txt3.setText("");
            txt4.setText("");
            txt15.setText("");
        }   
            catch(NumberFormatException e){
            JOptionPane.showMessageDialog(DA,"Please enter a valid no:","Error",JOptionPane.ERROR_MESSAGE);
        
        }   
    }

    //method for the appoint button of the junior developer class
    
    public void appointJuniorDev()
    {  
            String devName=txt20.getText();
            String specialization =txt13.getText();
            String termDate=txt21.getText();
            String appDate=txt23.getText();
            String number=txt22.getText();
        if(devName.equals("")||specialization.equals("")||termDate.equals("")||appDate.equals("")||number.equals("")){
            JOptionPane.showMessageDialog(DA,"The field are left empty:","Warning",JOptionPane.WARNING_MESSAGE);
        
            }
        try{
                int num=Integer.parseInt(number);
            //here the input developer no is checked if its size is greater than the size of list or not
            if(list.size()<num){
                JOptionPane.showMessageDialog(DA,"Sorry, there are only"+list.size()+"developer available");
            }else{
                //checking if the developer no is from the senior developer or not
                if(list.get(num-1) instanceof JuniorDeveloper){
                    JuniorDeveloper j =(JuniorDeveloper)list.get(num-1);
                    if(j.getjoined()==false ){
                        j.appointDeveloper(devName,appDate,termDate,specialization);
                        JOptionPane.showMessageDialog(DA,"Developer is successfull appointed");
                        txt20.setText(null);
                        txt13.setText(null);
                        txt21.setText(null);
                        txt23.setText(null);
                    }else{
                       JOptionPane.showMessageDialog(DA,"Developer is already appointed");
                    }
                }else
                {
                   JOptionPane.showMessageDialog(DA,"Developer is not from junior class","Warning",JOptionPane.WARNING_MESSAGE);
                }
            
        }
       }catch(Exception ex){
            JOptionPane.showMessageDialog(DA,"Please fill the form with valid value","Warning",JOptionPane.WARNING_MESSAGE);
        }
}
    //this is the method to when add button of the junior developer
    
    public void addJunior()
    {
        String platJun = txt17.getText();
        String name = txt18.getText();
        String salary = txt19.getText();
        String appoint = txt10.getText();
        String termDate = txt11.getText();
        String workingHour=txt9.getText();
        //JOptionPane.showMessageDialog(DA,platJun +":"+ name+":"+ workingHour +":"+ termDate+":"+ appoint +":"+ salary);
        if(platJun.equals("") || name.equals("") || appoint.equals("")|| termDate.equals("")){
            JOptionPane.showMessageDialog(DA,"OOOps the field are left empty","Warning",JOptionPane.WARNING_MESSAGE);
        }
        try{
            float salary1 = Float.parseFloat(salary);
            int workingHrs = Integer.parseInt(workingHour);
            JuniorDeveloper j = new JuniorDeveloper(platJun,name,workingHrs,salary1,appoint,termDate);
            list.add(j);
            JOptionPane.showMessageDialog(DA,"Interviewer is Sucessfully added");
            txt17.setText("");
            txt18.setText("");
            txt19.setText("");
            txt10.setText("");
            txt11.setText("");
            txt9.setText("");
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(DA,"Please enter a valid number:","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    //creating method for the appoint of the senior developer when the appoint button is pressed
    public void appointSenior(){
         
        String devName=txt7.getText(); 
        String joinDate=txt5.getText();
        String Salary= txt8.getText();
        String stRoom=txt6.getText();
        String number=txt16.getText();
            if(devName.equals("")||joinDate.equals("")||stRoom.equals("")||Salary.equals("")){
                JOptionPane.showMessageDialog(DA,"The field left empty","Warning",JOptionPane.WARNING_MESSAGE);
                } 
            try{
                float adSalary= Float.parseFloat(Salary);
                int num=Integer.parseInt(number);
                if(list.size()<num){
                    JOptionPane.showMessageDialog(DA,"Sorry, only"+list.size()+"developers are available");
                }else{
                    if(list.get(num-1) instanceof SeniorDeveloper){
                        SeniorDeveloper s = (SeniorDeveloper)list.get(num-1);
                        if(s.getappointed()==false){
                            s.sethireDeveloper(devName,joinDate,adSalary,stRoom);
                            JOptionPane.showMessageDialog(DA,"Developer is successfully hired");
                            txt7.setText(null);
                            txt5.setText(null);
                            txt8.setText(null);
                            txt6.setText(null);
                        }else{
                            JOptionPane.showMessageDialog(DA,"Developer has already been hired","Warning",JOptionPane.WARNING_MESSAGE);
                        }
                     }else{
                        JOptionPane.showMessageDialog(DA,"Developer is not of Senior developer");
                        }
                }
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(DA,"PLease fill with specefic datatype","Warning",JOptionPane.WARNING_MESSAGE);
            } 
        
    }   
        //when the user press the terminate button then the developer whose no is enter is terminated
    public void terminateDeveloper()
    {  try{
            String val=txt16.getText();
           if(val.equals("")){
               JOptionPane.showMessageDialog(DA,"The field left empty","Warning!!",JOptionPane.WARNING_MESSAGE);
           }else{
               int num=Integer.parseInt(val);
               if(list.size()<num){
                   JOptionPane.showMessageDialog(DA,"Developer is not from the list");
               }else{
                   if(list.get(num-1) instanceof SeniorDeveloper){//checked if the value is in the array list or not
                        SeniorDeveloper s = (SeniorDeveloper)list.get(num-1);
                   if(s.getterminated()==false){
                       s.contractTermination();
                       JOptionPane.showMessageDialog(DA,"Developer is successfully terminated");
                   }else{
                       JOptionPane.showMessageDialog(DA,"Developer is already terminated");
                   }
                   }else{
                   JOptionPane.showMessageDialog(DA,"Developer is not from senior class","Warning!!",JOptionPane.WARNING_MESSAGE); 
                   }
               }
           }
        } catch(Exception ex){
            JOptionPane.showMessageDialog(DA,"Developer not from Senior class","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void clearField()
    {
        txt1.setText(null);
        txt2.setText(null);
        txt3.setText(null);
        txt4.setText(null);
        txt5.setText(null);
        txt6.setText(null);
        txt7.setText(null);
        txt8.setText(null);
        txt9.setText(null);
        txt10.setText(null);
        txt11.setText(null);
        txt13.setText(null);
        txt15.setText(null);
        txt16.setText(null);
        txt17.setText(null);
        txt18.setText(null);
        txt19.setText(null);
        txt20.setText(null);
        txt21.setText(null);
        txt22.setText(null);
        txt23.setText(null);  
        }
    public void displayAll(){
        for (Developer d : list) {
            if (d instanceof SeniorDeveloper) {
                System.out.println("---------------------");
                System.out.println("Senior Developer");
                SeniorDeveloper s = (SeniorDeveloper)d;
                s.Display();
                System.out. println("---------------------");
            }
            else if (d instanceof JuniorDeveloper) {
                System.out.println("---------------------");
                System.out.println("Junior Developer");
                JuniorDeveloper j = (JuniorDeveloper)d;
                j.displaydetails();
                System.out.println("---------------------");
            }
            else {
                JOptionPane.showMessageDialog(DA, "Sorry!There are no Information stored");
            }
        }
    }
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()==exit){
            System.exit(0);
        }
        if(e.getSource()==addSenior){
            addSeniorDev();
        }
        if(e.getSource()==terminateDev){
            terminateDeveloper();
        }
        if(e.getSource()==appointJunior){
            appointJuniorDev();
        }
        if(e.getSource()==addJunior){
            addJunior();
        }
        if(e.getSource()==appointSenior){
            appointSenior();
        }
        if(e.getSource()==clear){
            clearField();
        }
        if(e.getSource()==displayAl){
            displayAll();
        }
       
    }
    //creating the main method where we create object inorder to call other methods   
    public static void main(String args[]){
        RigoTechnology obj=new RigoTechnology();
        obj.setComponents();

     }
}
    
    
    


