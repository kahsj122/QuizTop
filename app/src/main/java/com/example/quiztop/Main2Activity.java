package com.example.quiztop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView ptextViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ptextViewResult=(TextView)findViewById(R.id.myTextViewResult);

        Intent result=getIntent();
        String myresult=result.getStringExtra("score");
        if(myresult.equals("1")){
            ptextViewResult.setText("Désolé, vous avez juste réussi une seule question et votre Score est :"+myresult+"/3");
        }
        else if(myresult.equals("2")){
            ptextViewResult.setText("Pas mal, vous avez réussi deux questions et votre Score est :"+myresult+"/3");
        }
        else if (myresult.equals("3")){
            ptextViewResult.setText("Bravo, vous avez réussi toutes les questions et votre Score est :"+myresult+"/3");
        }
        else{
            ptextViewResult.setText("Malheureusement vous n'avez réussi aucune questions et votre Score est :"+myresult+"/3, Merci de retenter votre chance!!!");
        }





    }
}
