package com.noah.bcquiz;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.security.acl.Group;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new AlertDialog.Builder(this)
                .setTitle(R.string.disclaimer_title)
                .setMessage(R.string.disclaimer_message)
                .setNeutralButton(R.string.disclaimer_button, null)
                .show();

        TextView who = (TextView) findViewById(R.id.link_who);
        who.setMovementMethod(LinkMovementMethod.getInstance());

        TextView yourLife = (TextView) findViewById(R.id.link_your_life);
        yourLife.setMovementMethod(LinkMovementMethod.getInstance());
    }


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
            condomGrade++;
            displayCondomGrade(condomGrade);
            pillsGrade++;
            displayPillsGrade(pillsGrade);
            iudGrade += 0;
            displayIudGrade(iudGrade);
        } else if (answer_2_no.isChecked()) {
            condomGrade++;
            displayCondomGrade(condomGrade);
            pillsGrade++;
            displayPillsGrade(pillsGrade);
            iudGrade++;
            displayIudGrade(iudGrade);
        }

        if (answer_3_yes.isChecked()) {
            condomGrade++;
            displayCondomGrade(condomGrade);
            pillsGrade += 0;
            displayPillsGrade(pillsGrade);
            iudGrade += 0;
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
            pillsGrade += 0;
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
            pillsGrade += 0;
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
            iudGrade += 0;
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
            pillsGrade += 0;
            displayPillsGrade(pillsGrade);
            iudGrade += 0;
            displayIudGrade(iudGrade);
        } else if (answer_7_no.isChecked()) {
            condomGrade++;
            displayCondomGrade(condomGrade);
            pillsGrade++;
            displayPillsGrade(pillsGrade);
            iudGrade++;
            displayIudGrade(iudGrade);
        }

        if (answer_8_yes.isChecked()) {
            condomGrade++;
            displayCondomGrade(condomGrade);
            pillsGrade += 0;
            displayPillsGrade(pillsGrade);
            iudGrade += 0;
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




    }

}
