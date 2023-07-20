package com.example.arraycopyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtDoubleArr = findViewById(R.id.txtDoubleArr);
        TextView txtArray1  = findViewById(R.id.txtArray1);
        TextView txtIntigerArray = findViewById(R.id.txtIntigerArray);
        TextView txtIntigerArrCopy = findViewById(R.id.txtIntigerArrCopy);
        TextView txtSpecificElement = findViewById(R.id.txtSpecificElement);

        Switch swtTrueOrNOt = findViewById(R.id.swtTrueOrNOt);

        Double[] myArrayDub = {1.5,6.5,3.4,6.7,4.35,6.7,3.4,6.8,4.5,7.68,8.6,8.7,6.5,3.45,4.5,4.545,4.65,5.7};

        Arrays.sort(myArrayDub);

        String OldArrayValue;
        for(double arry : myArrayDub){

            OldArrayValue = txtDoubleArr.getText().toString();

            txtDoubleArr.setText(OldArrayValue + arry + " ");

        }

        int[] Array1 = new int[20];
        Arrays.fill(Array1,2);

        GetThePrintOUt(txtArray1 , Array1);

        int[] IntigerArray = {100,200,300,400,500,600,700,800,900,1000} ;
        int[] IntigerArrayCopy = new int[IntigerArray.length];

        System.arraycopy(IntigerArray , 0 , IntigerArrayCopy , 0 , IntigerArray.length);

        GetThePrintOUt(txtIntigerArray , IntigerArray);
        GetThePrintOUt(txtIntigerArrCopy , IntigerArrayCopy);

        Boolean isEqual = (Arrays.equals(IntigerArray , IntigerArrayCopy));
        swtTrueOrNOt.setChecked((isEqual? true : false));
        swtTrueOrNOt.setText((isEqual? "the Both INteger array are equal"  : "array are not Equal"));

        int Arrayelement = Arrays.binarySearch(myArrayDub ,6.5);
        if(Arrayelement >= 0){
            txtSpecificElement.setText(String.format("the array 6.5 is found at %d" , Arrayelement));
        }
        else{
            txtSpecificElement.setText("arraynotFOund");
        }






    }

    public void GetThePrintOUt(TextView textView , int[] myarr){
        String OldtxtViewarr;
        for(int words : myarr){
            OldtxtViewarr = textView.getText().toString();
            textView.setText(OldtxtViewarr + words + " ");
        }

    }
}