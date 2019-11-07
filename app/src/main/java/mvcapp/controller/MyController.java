package mvcapp.controller;

import android.app.Application;

import mvcapp.models.Animal;
import mvcapp.models.Details;
import mvcapp.models.Person;

public class MyController extends Application {
    public static final String TAG=MyController.class.getSimpleName();
    private  static MyController mInstance;
    public Animal an;


    public static synchronized MyController getInstance(){
        Details detailsobject=new Details();
        return mInstance;
    }

/**  comment*/
    @Override
    public void onCreate() {
        super.onCreate();
        mInstance=this;

        }


        public Person loadPerson(){
        Person p=new Person("Sunial","cirstian");
        return p;
        }

        public Animal loadAnimal(){
        an=new Animal("dog","two legs");
        return an;
        }
}
