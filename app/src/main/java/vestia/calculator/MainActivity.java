package vestia.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addBtn = (Button)findViewById(R.id.addBtn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText FirstTextField = (EditText) findViewById(R.id.FirstTextField);
                EditText SecondTextField = (EditText)findViewById(R.id.SecondTextEditor);
                TextView ResultTextView = (TextView)findViewById(R.id.result);

                int num1 = Integer.parseInt(FirstTextField.getText().toString());
                int num2 = Integer.parseInt(SecondTextField.getText().toString());
                int result = num1+num2;
                ResultTextView.setText(result+"");
            }
        });
    }

}
