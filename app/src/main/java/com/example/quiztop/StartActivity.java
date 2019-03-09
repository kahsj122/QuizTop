package com.example.quiztop;



import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class StartActivity extends AppCompatActivity {

    private RadioGroup radioGroupPays,radioGroupCouleurs,radioGroupAnimaux;
    private RadioButton radioButtonBlanc,radioButtonBleu,radioButtonViolet,radioButtonRouge;
    private RadioButton radioButtonFrance,radioButtonItalie,radioButtonBelg,radioButtonBresil;
    private RadioButton radioButtonLapin,radioButtonOurs,radioButtonAbeille,radioButtonTortue;

    private RadioGroup radioGroupDiffLevel;

    private Button buttonSave;
    private List<String> listpays =new ArrayList<>();
    private List<String> listCouleurs=new ArrayList<>();
    private List<String> listAnimaux=new ArrayList<>();
    private int ScoreQuiz=0;

    List<Integer> ScoreCount=new ArrayList<>();
    String myscore="";








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        //
        this.radioGroupPays = (RadioGroup) this.findViewById(R.id.radioGroup_diffpays);
        this.radioGroupAnimaux=(RadioGroup)this.findViewById(R.id.radioGroup_diffanimaux);
        this.radioGroupCouleurs=(RadioGroup)this.findViewById(R.id.radioGroup_diffcouleur);
        //Les choix possibles pour la Question 1
        this.radioButtonFrance = (RadioButton) this.findViewById(R.id.radioButton_france);
        this.radioButtonBelg = (RadioButton) this.findViewById(R.id.radioButton_belgique);
        this.radioButtonItalie = (RadioButton) this.findViewById(R.id.radioButton_italie);
        this.radioButtonBresil= (RadioButton) this.findViewById(R.id.radioButton_bresil);
        //Les choix possibles pour la Question 2
        this.radioButtonBlanc = (RadioButton) this.findViewById(R.id.radioButton_blanc);
        this.radioButtonBleu = (RadioButton) this.findViewById(R.id.radioButton_bleu);
        this.radioButtonRouge = (RadioButton) this.findViewById(R.id.radioButton_rouge);
        this.radioButtonViolet = (RadioButton) this.findViewById(R.id.radioButton_violet);
        //Les choix possibles pour la Question 3
        this.radioButtonTortue = (RadioButton) this.findViewById(R.id.radioButton_tortue);
        this.radioButtonLapin = (RadioButton) this.findViewById(R.id.radioButton_lapin);
        this.radioButtonOurs = (RadioButton) this.findViewById(R.id.radioButton_ours);
        this.radioButtonAbeille = (RadioButton) this.findViewById(R.id.radioButton_abeille);




        this.buttonSave = (Button) this.findViewById(R.id.button_save);

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the checked Radio Button ID from Radio Grou[
                int selectedRadioButtonPaysID = radioGroupPays.getCheckedRadioButtonId();
                int selectedRadioButtonCouleursID = radioGroupCouleurs.getCheckedRadioButtonId();
                int selectedRadioButtonAnimauxID = radioGroupAnimaux.getCheckedRadioButtonId();



                if (selectedRadioButtonPaysID != -1) {

                    RadioButton selectedRadioButton = (RadioButton) findViewById(selectedRadioButtonPaysID);
                    String selectedRadioButtonText = selectedRadioButton.getText().toString();

                    int duration = Toast.LENGTH_SHORT;
                    Context context = getApplicationContext();

                    Toast toast = Toast.makeText(context, selectedRadioButtonText, duration);
                    toast.show();
                    listpays.add(selectedRadioButtonText);
                    Log.e("Tableau de pays",""+listpays.size());
                    if(selectedRadioButtonText.equals("France")){
                        ScoreQuiz++;
                    }
                }
                if(selectedRadioButtonCouleursID != -1){
                    RadioButton selectedRadioButton = (RadioButton) findViewById(selectedRadioButtonCouleursID);
                    String selectedRadioButtonText = selectedRadioButton.getText().toString();


                    CharSequence text = "Hello toast!";
                    int duration = Toast.LENGTH_SHORT;
                    Context context = getApplicationContext();

                    Toast toast = Toast.makeText(context, selectedRadioButtonText, duration);
                    toast.show();
                    listCouleurs.add(selectedRadioButtonText);
                    Log.e("Tableau de couleurs",""+listCouleurs.size());
                    if(selectedRadioButtonText.equals("Bleu")){
                        ScoreQuiz++;
                    }



                }
                if(selectedRadioButtonAnimauxID != -1){
                    RadioButton selectedRadioButton = (RadioButton) findViewById(selectedRadioButtonAnimauxID);
                    String selectedRadioButtonText = selectedRadioButton.getText().toString();



                    CharSequence text = "Hello toast!";
                    int duration = Toast.LENGTH_SHORT;
                    Context context = getApplicationContext();

                    Toast toast = Toast.makeText(context, selectedRadioButtonText, duration);
                    toast.show();
                    listAnimaux.add(selectedRadioButtonText);
                    Log.e("Tableau d'animaux",""+listAnimaux.size());
                    if(selectedRadioButtonText.equals("Abeille")){
                        ScoreQuiz++;
                    }

                }






                //Score final
                Log.e("Ton Score final====",""+ScoreCount.size());
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;

                //Toast toast = Toast.makeText(context, ""+ScoreQuiz, duration);
                //toast.show();
                Intent myintent=new Intent(StartActivity.this,Main2Activity.class);
                myintent.putExtra("score",""+ScoreQuiz);
                startActivity(myintent);





                ScoreQuiz=0;



            }
        });


    }
}