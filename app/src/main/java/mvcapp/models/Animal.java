package mvcapp.models;


public class Animal  {

    private String mName;
    private String mBreed;

    public  Animal(String mName,String mBreed){

        this.mName=mName;
        this.mBreed=mBreed;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmBreed() {
        return mBreed;
    }

    public void setmBreed(String mBreed) {
        this.mBreed = mBreed;
    }
}
