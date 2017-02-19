package somoneletman.org.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText operand1;
    private EditText operand2;
    private Button btnAddition;
    private Button btnSubtraction;
    private Button btnDivision;
    private Button btnMultiplication;
    private Button btnClear;
    private TextView txtResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        operand1 = (EditText) findViewById(R.id.editOperand1);
        operand2 = (EditText) findViewById(R.id.editOperand2);
        btnAddition = (Button) findViewById(R.id.btnAddition);
        btnSubtraction = (Button) findViewById(R.id.btnSubtraction);
        btnDivision = (Button) findViewById(R.id.btnDivision);
        btnMultiplication = (Button) findViewById(R.id.btnMultiplication);
        btnClear = (Button) findViewById(R.id.btnClear);
        txtResult = (TextView) findViewById(R.id.txtResult);

        //Button Listeners

        //Addition Button Listener
        btnAddition.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //checks if your operands have data in them before performing operations
                if((operand1.getText().length()>0) && (operand2.getText().length()>0)){
                    //Gets value that is stored on screen in text, converts to  string, uses parse to convervt to a numerical value to be able to do processing.
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());

                    double theResult = oper1 + oper2;
                    //outputs our value into our text result field
                    //txtresult links to the result onscreen
                    //set text updates the value on screen
                    //double.tostring converts numeric value back to a string becasue when we add something to the screen it needs to be in text form
                    txtResult.setText(Double.toString(theResult));

                } else {
                    Toast.makeText(MainActivity.this, "Please enter numbers in both operand fields first.", Toast.LENGTH_LONG).show();
                }

           }
        });

        //Subtraction Button Listener
        btnSubtraction.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if((operand1.getText().length()>0) && (operand2.getText().length())>0) {
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());

                    double theResult = oper1 - oper2;

                    txtResult.setText(Double.toString(theResult));
                } else {
                    Toast.makeText(MainActivity.this, "Please enter numbers in both operand fields first.", Toast.LENGTH_LONG).show();
                }

            }
        });

        //Division Button Listener
        btnDivision.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if((operand1.getText().length()>0) && (operand2.getText().length()>0)){
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());

                    double theResult = oper1 / oper2;

                    txtResult.setText(Double.toString(theResult));
                }else {
                    Toast.makeText(MainActivity.this, "Please enter numbers in both operand fields first.", Toast.LENGTH_LONG).show();
                }

            }
        });

        //Multiplication Button Listener
        btnMultiplication.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if((operand1.getText().length()>0) && (operand2.getText().length()>0)) {
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());

                    double theResult = oper1 * oper2;

                    txtResult.setText(Double.toString(theResult));
                }else {
                    Toast.makeText(MainActivity.this, "Please enter numbers in both operand fields first.", Toast.LENGTH_LONG).show();
                }

            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            //Clears operand field
            public void onClick(View v) {
                operand1.setText("");
                operand2.setText("");
                txtResult.setText("0.00");
                operand1.requestFocus();

            }
        });


    }
}
