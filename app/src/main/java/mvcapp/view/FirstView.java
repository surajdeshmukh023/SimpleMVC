package mvcapp.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import mvcapp.controller.MyController;
import mvcapp.models.Animal;
import mvcapp.models.Person;
import mvcshoppingcartexample.com.simplemvc.R;

public class FirstView extends AppCompatActivity {
MyController controllerobj;
TextView tv,tv2;
Button model1,model2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstview);
        controllerobj=new MyController();
        tv=(TextView)findViewById(R.id.textView);
        model1=(Button)findViewById(R.id.button);
        model2=(Button)findViewById(R.id.button3);
        tv2=(TextView)findViewById(R.id.textView2);

        model1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animal an=controllerobj.loadAnimal();
                String breed=an.getmBreed();
                String name=an.getmName();

                tv.setText("Dog name is: "+name+" And breed is: "+breed);
            }
        });

        model2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Person p=controllerobj.loadPerson();
                String name=p.getmName();
                String caste=p.getMcaste();

                tv2.setText("Person name is: "+name+" caste is: "+caste);
            }
        });



    }
}
