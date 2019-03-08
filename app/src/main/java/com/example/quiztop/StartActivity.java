package com.example.quiztop;



import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;
        import android.widget.CompoundButton;
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





    private String LOGTAG = "AndroidRadioDemo";





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        //
        this.radioGroupPays = (RadioGroup) this.findViewById(R.id.radioGroup_diffpays);
        this.radioGroupAnimaux=(RadioGroup)this.findViewById(R.id.radioGroup_diffanimaux);
        this.radioGroupCouleurs=(RadioGroup)this.findViewById(R.id.radioGroup_diffcouleur);
        //Question 1
        this.radioButtonFrance = (RadioButton) this.findViewById(R.id.radioButton_france);
        this.radioButtonBelg = (RadioButton) this.findViewById(R.id.radioButton_belgique);
        this.radioButtonItalie = (RadioButton) this.findViewById(R.id.radioButton_italie);
        this.radioButtonBresil= (RadioButton) this.findViewById(R.id.radioButton_bresil);
        //Question 2
        this.radioButtonBlanc = (RadioButton) this.findViewById(R.id.radioButton_blanc);
        this.radioButtonBleu = (RadioButton) this.findViewById(R.id.radioButton_bleu);
        this.radioButtonRouge = (RadioButton) this.findViewById(R.id.radioButton_rouge);
        this.radioButtonViolet = (RadioButton) this.findViewById(R.id.radioButton_violet);
        //Question 3
        this.radioButtonTortue = (RadioButton) this.findViewById(R.id.radioButton_tortue);
        this.radioButtonLapin = (RadioButton) this.findViewById(R.id.radioButton_lapin);
        this.radioButtonOurs = (RadioButton) this.findViewById(R.id.radioButton_ours);
        this.radioButtonAbeille = (RadioButton) this.findViewById(R.id.radioButton_abeille);




        this.buttonSave = (Button) this.findViewById(R.id.button_save);
        /*
        RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup1);
        final String value =
            ((RadioButton)findViewById(rg.getCheckedRadioButtonId()))
            .getText().toString();

        rg.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                Toast.makeText(getBaseContext(), value, Toast.LENGTH_SHORT).show();
            }
        });
         */
        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the checked Radio Button ID from Radio Grou[
                int selectedRadioButtonPaysID = radioGroupPays.getCheckedRadioButtonId();
                int selectedRadioButtonCouleursID = radioGroupCouleurs.getCheckedRadioButtonId();
                int selectedRadioButtonAnimauxID = radioGroupAnimaux.getCheckedRadioButtonId();


                // If nothing is selected from Radio Group, then it return -1
                if (selectedRadioButtonPaysID != -1) {

                    RadioButton selectedRadioButton = (RadioButton) findViewById(selectedRadioButtonPaysID);
                    String selectedRadioButtonText = selectedRadioButton.getText().toString();

                    //tv_result.setText(selectedRadioButtonText + " selected.");

                    CharSequence text = "Hello toast!";
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

                    //tv_result.setText(selectedRadioButtonText + " selected.");

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

                    //tv_result.setText(selectedRadioButtonText + " selected.");

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

                /*for (int i=0;i<listpays.size();i++){
                    if(listpays.contains("France")){
                        ScoreQuiz++; f.ma@so-buzz.com
                    }

                    for (int j=0;j<listCouleurs.size();j++){
                        if(listpays.contains("Bleu")){
                            //ScoreCount.add(1);
                            ScoreQuiz++;
                        }
                        for (int k=0;k<listAnimaux.size();k++){
                            if(listpays.contains("Abeille")){
                                //ScoreCount.add(1);
                                ScoreQuiz++;
                            }
                        }
                    }
                }*/
               /* if(listpays.contains("France") && listCouleurs.contains("Bleu") && listAnimaux.contains("Abeille")){
                    ScoreQuiz=3;
                }
                else if(listpays.contains("France") && listCouleurs.contains("Bleu") || listCouleurs.contains("Bleu") && listAnimaux.contains("Abeille") || listCouleurs.contains("Abeille") && listpays.contains("France")){

                    ScoreQuiz=2;
                }
                else if(listpays.contains("France") || listCouleurs.contains("Bleu") || listAnimaux.contains("Abeille")){
                    //ScoreCount.add(3);
                    ScoreQuiz=1;
                }*/




                //Score final
                Log.e("Ton Score final====",""+ScoreCount.size());
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, ""+ScoreQuiz, duration);
                toast.show();
                Intent myintent=new Intent(StartActivity.this,Main2Activity.class);





                ScoreQuiz=0;



            }
        });

        // When radio group "Difficulty Level" checked change.
        /*this.radioGroupDiffLevel.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                doOnDifficultyLevelChanged(group, checkedId);
            }
        });*/

        // When radio button "Female" checked change.
       /* this.radioButtonMale.setOnCheckedChangeListener(new RadioButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                doOnGameCharacterChanged(buttonView,isChecked);
            }
        });

        // When radio button "Male" checked change.
        this.radioButtonFemale.setOnCheckedChangeListener(new RadioButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                doOnGameCharacterChanged(buttonView,isChecked);
            }
        });

        // When button "Save" clicked.
        this.buttonSave.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                doSave();
            }
        });
    }


    // When radio group "Difficulty Level" checked change.
    private void doOnDifficultyLevelChanged(RadioGroup group, int checkedId) {
        int checkedRadioId = group.getCheckedRadioButtonId();

        if(checkedRadioId== R.id.radioButton_easy) {
            Toast.makeText(this,"You choose the level of difficulty: Easy",Toast.LENGTH_SHORT).show();
        } else if(checkedRadioId== R.id.radioButton_medium ) {
            Toast.makeText(this,"You choose the level of difficulty: Medium",Toast.LENGTH_SHORT).show();
        } else if(checkedRadioId== R.id.radioButton_hard) {
            Toast.makeText(this,"You choose the level of difficulty: Hard",Toast.LENGTH_SHORT).show();
        }
    }

    // When radio button checked change.
    private void doOnGameCharacterChanged(CompoundButton buttonView, boolean isChecked)  {
        RadioButton radio =(RadioButton) buttonView;

        Log.i(LOGTAG, "RadioButton "+ radio.getText()+" : "+ isChecked);
    }

    // When button "Save" clicked.
    private void doSave()  {
        int difficultyLevel = this.radioGroupDiffLevel.getCheckedRadioButtonId();
        int gameCharacter = this.radioGroupCharacter.getCheckedRadioButtonId();

        RadioButton radioButtonDiffLevel = (RadioButton) this.findViewById(difficultyLevel);
        RadioButton radioButtonGameCharacter = (RadioButton) this.findViewById(gameCharacter);

        String message ="Difficulty Level: "+ radioButtonDiffLevel.getText()
                +", Game Character: " + radioButtonGameCharacter.getText() ;

        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }
    */
    }
}