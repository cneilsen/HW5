
package model;


public class StudentMajors {
    
    private String STUDENTID;
    private String MAJOR;
    private String HOMETOWN;
    private int Age;
    private String FavBar;
    

    
       public StudentMajors(String STUDENTID, String MAJOR, String HOMETOWN, int Age, String FavBar) {
        this.STUDENTID = STUDENTID;
        this.MAJOR = MAJOR;
        this.HOMETOWN = HOMETOWN;
        this.Age = Age;
        this.FavBar = FavBar; 
    }

       
       
     public StudentMajors() {
        this.STUDENTID = "";
        this.MAJOR = "";
        this.HOMETOWN = "";
        this.Age = 0;
        this.FavBar="";
        
    }
     
   
    public String getSTUDENTID() {
        return STUDENTID;
    }

    public void setSTUDENTID(String STUDENTID) {
        this.STUDENTID = STUDENTID;
    }

    public String getMAJOR() {
        return MAJOR;
    }

    public void setMAJOR(String MAJOR) {
        this.MAJOR = MAJOR;
    }

    public String getHOMETOWN() {
        return HOMETOWN;
    }

    public void setHOMETOWN(String HOMETOWN) {
        this.HOMETOWN = HOMETOWN;
    }
    
     public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

     public String getFavBar() {
        return FavBar;
    }

    public void setFavBar(String FavBar) {
        this.FavBar = FavBar;
    }


    @Override
    public String toString() {
        return "StudentMajors{" + "STUDENTID=" + STUDENTID + ", MAJOR=" + MAJOR + ", HOMETOWN=" + HOMETOWN + ", Age=" + Age + ", FavBar=" + FavBar + '}';
    }
}


        
    
    
    
    
   
    
    
    
