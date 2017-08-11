/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

    /**
     *
     * @author Administrator
     */
    public class PersonFiles {

  private static final String FILENAME= "filename.txt";
   
    
    private String name;
    private String occupation;
    private int age;

    public PersonFiles (String name, String occupation, int age)
    {
        this.name = name;
        this.occupation = occupation;
        this.age = age;

    }

  

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person: " + "name=" + name + ", occupation=" + occupation + ", age=" + age + ' ';
    }






    
    
    
    public static void main (String[]args)
    {
        PersonFiles Mahmoud = new PersonFiles ("Mahmoud", "Consultant", 20);
        PersonFiles James = new PersonFiles ("James", "Student", 22);
        PersonFiles Abdul = new PersonFiles ("Abdul", "Lawyer", 35);
        PersonFiles Steve = new PersonFiles ("Steve", "Labourer", 12);
        PersonFiles Matty = new PersonFiles ("Matty", "Programmer", 45);
        ArrayList <PersonFiles> people = new ArrayList<PersonFiles>();


        people.add(James);
        people.add(Abdul);
        people.add(Steve);
        people.add(Matty);



    
        BufferedWriter bw = null;
        FileWriter fw = null;
        
        try {

            fw = new FileWriter(FILENAME);
            bw = new BufferedWriter(fw);
            bw.write(people.toString());
            
            System.out.println("Done"); 
        }
        
        catch (IOException e)
        {
            e.printStackTrace();
        }
        
        finally {
            try {
                if (bw !=null)
                    bw.close();
                if (fw !=null)
                    fw.close();
            } catch (IOException ex)
            {
                ex.printStackTrace();
            }  
        }
        
        
        BufferedReader br = null;
        FileReader fr = null;
        
        try {
            fr = new FileReader (FILENAME);
            br = new BufferedReader(fr);
            
            String sCurrent;
                   
            
            while ((sCurrent = br.readLine()) != null)
            {
                String[] splitter = sCurrent.split(",");
                for ( int i =0; i < splitter.length; i++)
                {
                   System.out.println(splitter[i]); 
                }
                
            }
            
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try {
                if (br !=null)
                    br.close();
                if (fr !=null)
                    fr.close();
            } catch (IOException ex)
            {
                ex.printStackTrace();
            }  
        }
    }
  
    }

    


