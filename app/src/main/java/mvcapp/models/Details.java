package mvcapp.models;

import java.util.ArrayList;

public class Details {

   private static Details mDetails;
    private ArrayList<Person>  personlist=new ArrayList<Person>();
    private ArrayList<Animal>  aniallist=new ArrayList<Animal>();


    public static Details getmDetails() {
        return mDetails;
    }

    public static void setmDetails(Details mDetails) {
        Details.mDetails = mDetails;
    }

    public ArrayList<Person> getPersonlist() {
        return personlist;
    }

    public void setPersonlist(ArrayList<Person> personlist) {
        this.personlist = personlist;
    }

    public ArrayList<Animal> getAniallist() {
        return aniallist;
    }

    public void setAniallist(ArrayList<Animal> aniallist) {
        this.aniallist = aniallist;
    }

    public static Details getAllDetails(){
        if(mDetails==null){
            mDetails=new Details();
        }

        return  mDetails;

    }

}
