package mvcapp.models;


public class Person  {

    private String mName;
    private String mcaste;

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setMcaste(String mcaste) {
        this.mcaste = mcaste;
    }

    public String getmName() {

        return mName;
    }

    public String getMcaste() {
        return mcaste;
    }

    public  Person(String mName, String mcaste){
        this.mName=mName;
        this.mcaste=mcaste;
    }


}