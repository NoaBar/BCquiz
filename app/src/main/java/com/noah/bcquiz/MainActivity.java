package com.noah.bcquiz;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.security.acl.Group;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState == null ||
                !savedInstanceState.getBoolean("alertSeen", false)) {
            new AlertDialog.Builder(this)
                    .setTitle(R.string.disclaimer_title)
                    .setMessage(R.string.disclaimer_message)
                    .setNeutralButton(R.string.disclaimer_button, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            alertSeen = true;
                        }
                    })
                    .setCancelable(false)
                    .show();
        } else {
            alertSeen = true;
        }

        TextView who = (TextView) findViewById(R.id.link_who);
        who.setMovementMethod(LinkMovementMethod.getInstance());

        TextView yourLife = (TextView) findViewById(R.id.link_your_life);
        yourLife.setMovementMethod(LinkMovementMethod.getInstance());
    }

    boolean alertSeen = false;

    int condomGrade = 0;
    int pillsGrade = 0;
    int iudGrade = 0;


    /**
     * Displays the given grade for condoms.
     */
    public void displayCondomGrade(int condomGrade) {
        TextView gradeView = (TextView) findViewById(R.id.condomGrade);
        gradeView.setText(String.valueOf(condomGrade));
    }

    /**
     * Displays the given grade for pills.
     */
    public void displayPillsGrade(int pillsGrade) {
        TextView gradeView = (TextView) findViewById(R.id.pillsGrade);
        gradeView.setText(String.valueOf(pillsGrade));
    }


    /**
     * Displays the given grade for IUD.
     */
    public void displayIudGrade(int iudGrade) {
        TextView gradeView = (TextView) findViewById(R.id.iudGrade);
        gradeView.setText(String.valueOf(iudGrade));
    }


    /**
     * This method is called when all the radioButtons are clicked (to see how the grade changes online)
     * and the finish button is clicked.
     */
    public void answers_check(View view) {

        RadioButton answer_1_yes = (RadioButton) findViewById(R.id.answer_1_yes);
        RadioButton answer_1_no = (RadioButton) findViewById(R.id.answer_1_no);
        RadioButton answer_2_yes = (RadioButton) findViewById(R.id.answer_2_yes);
        RadioButton answer_2_no = (RadioButton) findViewById(R.id.answer_2_no);
        RadioButton answer_2_mind = (RadioButton) findViewById(R.id.answer_2_mind);
        RadioButton answer_3_yes = (RadioButton) findViewById(R.id.answer_3_yes);
        RadioButton answer_3_no = (RadioButton) findViewById(R.id.answer_3_no);
        RadioButton answer_4_yes = (RadioButton) findViewById(R.id.answer_4_yes);
        RadioButton answer_4_no = (RadioButton) findViewById(R.id.answer_4_no);
        RadioButton answer_5_yes = (RadioButton) findViewById(R.id.answer_5_yes);
        RadioButton answer_5_no = (RadioButton) findViewById(R.id.answer_5_no);
        RadioButton answer_6_yes = (RadioButton) findViewById(R.id.answer_6_yes);
        RadioButton answer_6_no = (RadioButton) findViewById(R.id.answer_6_no);
        RadioButton answer_7_yes = (RadioButton) findViewById(R.id.answer_7_yes);
        RadioButton answer_7_no = (RadioButton) findViewById(R.id.answer_7_no);
        RadioButton answer_8_yes = (RadioButton) findViewById(R.id.answer_8_yes);
        RadioButton answer_8_no = (RadioButton) findViewById(R.id.answer_8_no);


        condomGrade = 0;
        pillsGrade = 0;
        iudGrade = 0;

        if (answer_1_yes.isChecked()) {
            condomGrade += 10;
            displayCondomGrade(condomGrade);
            pillsGrade += 0;
            displayPillsGrade(pillsGrade);
            iudGrade += 0;
            displayIudGrade(iudGrade);
        } else if (answer_1_no.isChecked()) {
            condomGrade++;
            displayCondomGrade(condomGrade);
            pillsGrade++;
            displayPillsGrade(pillsGrade);
            iudGrade++;
            displayIudGrade(iudGrade);
        }

        if (answer_2_yes.isChecked()) {
            condomGrade += 10;
            displayCondomGrade(condomGrade);
            pillsGrade += 0;
            displayPillsGrade(pillsGrade);
            iudGrade += 10;
            displayIudGrade(iudGrade);
        } else if (answer_2_no.isChecked()) {
            condomGrade += 0;
            displayCondomGrade(condomGrade);
            pillsGrade += 10;
            displayPillsGrade(pillsGrade);
            iudGrade += 0;
            displayIudGrade(iudGrade);
        } else if (answer_2_mind.isChecked()) {
            condomGrade++;
            displayCondomGrade(condomGrade);
            pillsGrade++;
            displayPillsGrade(pillsGrade);
            iudGrade++;
            displayIudGrade(iudGrade);
        }

        if (answer_3_yes.isChecked()) {
            condomGrade += 2;
            displayCondomGrade(condomGrade);
            pillsGrade += 0;
            displayPillsGrade(pillsGrade);
            iudGrade += 2;
            displayIudGrade(iudGrade);
        } else if (answer_3_no.isChecked()) {
            condomGrade++;
            displayCondomGrade(condomGrade);
            pillsGrade++;
            displayPillsGrade(pillsGrade);
            iudGrade++;
            displayIudGrade(iudGrade);

        }

        if (answer_4_yes.isChecked()) {
            condomGrade++;
            displayCondomGrade(condomGrade);
            pillsGrade++;
            displayPillsGrade(pillsGrade);
            iudGrade += 0;
            displayIudGrade(iudGrade);
        } else if (answer_4_no.isChecked()) {
            condomGrade++;
            displayCondomGrade(condomGrade);
            pillsGrade++;
            displayPillsGrade(pillsGrade);
            iudGrade++;
            displayIudGrade(iudGrade);

        }

        if (answer_5_yes.isChecked()) {
            condomGrade++;
            displayCondomGrade(condomGrade);
            pillsGrade++;
            displayPillsGrade(pillsGrade);
            iudGrade += 0;
            displayIudGrade(iudGrade);
        } else if (answer_5_no.isChecked()) {
            condomGrade++;
            displayCondomGrade(condomGrade);
            pillsGrade++;
            displayPillsGrade(pillsGrade);
            iudGrade++;
            displayIudGrade(iudGrade);
        }

        if (answer_6_yes.isChecked()) {
            condomGrade++;
            displayCondomGrade(condomGrade);
            pillsGrade += 0;
            displayPillsGrade(pillsGrade);
            iudGrade++;
            displayIudGrade(iudGrade);
        } else if (answer_6_no.isChecked()) {
            condomGrade++;
            displayCondomGrade(condomGrade);
            pillsGrade++;
            displayPillsGrade(pillsGrade);
            iudGrade++;
            displayIudGrade(iudGrade);
        }

        if (answer_7_yes.isChecked()) {
            condomGrade++;
            displayCondomGrade(condomGrade);
            pillsGrade++;
            displayPillsGrade(pillsGrade);
            iudGrade++;
            displayIudGrade(iudGrade);
        } else if (answer_7_no.isChecked()) {
            condomGrade++;
            displayCondomGrade(condomGrade);
            pillsGrade += 0;
            displayPillsGrade(pillsGrade);
            iudGrade++;
            displayIudGrade(iudGrade);
        }

        if (answer_8_yes.isChecked()) {
            condomGrade += 2;
            displayCondomGrade(condomGrade);
            pillsGrade += 0;
            displayPillsGrade(pillsGrade);
            iudGrade += 2;
            displayIudGrade(iudGrade);
        } else if (answer_8_no.isChecked()) {
            condomGrade++;
            displayCondomGrade(condomGrade);
            pillsGrade++;
            displayPillsGrade(pillsGrade);
            iudGrade++;
            displayIudGrade(iudGrade);
        }
    }


    /**
     * This method checks if all the questions are answered.
     */
    public boolean findIfAllQuestionsAnswered() {

        RadioGroup answer_1 = (RadioGroup) findViewById(R.id.answer_1);
        RadioGroup answer_2 = (RadioGroup) findViewById(R.id.answer_2);
        RadioGroup answer_3 = (RadioGroup) findViewById(R.id.answer_3);
        RadioGroup answer_4 = (RadioGroup) findViewById(R.id.answer_4);
        RadioGroup answer_5 = (RadioGroup) findViewById(R.id.answer_5);
        RadioGroup answer_6 = (RadioGroup) findViewById(R.id.answer_6);
        RadioGroup answer_7 = (RadioGroup) findViewById(R.id.answer_7);
        RadioGroup answer_8 = (RadioGroup) findViewById(R.id.answer_8);

        if (answer_1.getCheckedRadioButtonId() == -1 ||
                answer_2.getCheckedRadioButtonId() == -1 ||
                answer_3.getCheckedRadioButtonId() == -1 ||
                answer_4.getCheckedRadioButtonId() == -1 ||
                answer_5.getCheckedRadioButtonId() == -1 ||
                answer_6.getCheckedRadioButtonId() == -1 ||
                answer_7.getCheckedRadioButtonId() == -1 ||
                answer_8.getCheckedRadioButtonId() == -1) {
            return false;

        } else {
            return true;
        }
    }

    /**
     * This method finds which BC method seems to be the best for the user.
     */
    public String findBestMethod() {
        int[] gradesArray = {condomGrade, pillsGrade, iudGrade};
        String[] methodNames = {getString(R.string.m_f_condom), getString(R.string.pills),
                getString(R.string.non_hormonal_iud)};
        int size = gradesArray.length;
        int bestGrade = gradesArray[0];
        String bestMethod = methodNames[0];

        for (int i = 1; i < size; i++) {
            if (gradesArray[i] >= bestGrade) {
                bestGrade = gradesArray[i];
                bestMethod = methodNames[i];
            }
        }
        return bestMethod;
    }


    /**
     * This method is called when finish button is clicked.
     */

    public void finish(View view) {
        if (findIfAllQuestionsAnswered()) {
            AlertDialog alertDialog = new AlertDialog.Builder(this)
                    .setTitle("Final Answer:")
                    .setMessage("Seems like " + findBestMethod() + " might be a good contraception method for you! " +
                            "\n\nFor more information, please click the links below!")
                    .setNeutralButton("OK", null)
                    .show();
        } else {
            Toast toast = Toast.makeText(this, R.string.incomplete_toast, Toast.LENGTH_LONG);
            LinearLayout layout = (LinearLayout) toast.getView();
            if (layout.getChildCount() > 0) {
                TextView tv = (TextView) layout.getChildAt(0);
                tv.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
            }
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

    }

    /**
     * This method is called when reset button is clicked.
     */

    public void resetGrade(View view) {
        condomGrade = 0;
        displayCondomGrade(condomGrade);
        pillsGrade = 0;
        displayPillsGrade(pillsGrade);
        iudGrade = 0;
        displayIudGrade(iudGrade);

        RadioGroup answer_1 = (RadioGroup) findViewById(R.id.answer_1);
        RadioGroup answer_2 = (RadioGroup) findViewById(R.id.answer_2);
        RadioGroup answer_3 = (RadioGroup) findViewById(R.id.answer_3);
        RadioGroup answer_4 = (RadioGroup) findViewById(R.id.answer_4);
        RadioGroup answer_5 = (RadioGroup) findViewById(R.id.answer_5);
        RadioGroup answer_6 = (RadioGroup) findViewById(R.id.answer_6);
        RadioGroup answer_7 = (RadioGroup) findViewById(R.id.answer_7);
        RadioGroup answer_8 = (RadioGroup) findViewById(R.id.answer_8);


        answer_1.clearCheck();
        answer_2.clearCheck();
        answer_3.clearCheck();
        answer_4.clearCheck();
        answer_5.clearCheck();
        answer_6.clearCheck();
        answer_7.clearCheck();
        answer_8.clearCheck();

        ScrollView scrollView = (ScrollView) findViewById(R.id.scrollView);
        scrollView.smoothScrollTo(0, 0);


    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt("condomGrade", condomGrade);
        outState.putInt("pillsGrade", pillsGrade);
        outState.putInt("iudGrade", iudGrade);
        outState.putBoolean("alertSeen", alertSeen);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        condomGrade = savedInstanceState.getInt("condomGrade", condomGrade);
        pillsGrade = savedInstanceState.getInt("pillsGrade", pillsGrade);
        iudGrade = savedInstanceState.getInt("iudGrade", iudGrade);
        alertSeen = savedInstanceState.getBoolean("alertSeen", alertSeen);
        displayCondomGrade(condomGrade);
        displayPillsGrade(pillsGrade);
        displayIudGrade(iudGrade);
    }

}
