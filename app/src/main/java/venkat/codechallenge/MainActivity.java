package venkat.codechallenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyLinkedList list = new MyLinkedList();

                for (int i = 0; i < 5; i++) {
                    list.add(i + " value");
                }

                Log.i(TAG, "List111 : "+ list.toString());

                list.modify(list.size() - 1, "venkat");
                Log.i(TAG, "List222 : "+ list.toString());

                list.modify(0, "kodali");
                Log.i(TAG, "List3333 : "+ list.toString());


                list.remove(3);
                Log.i(TAG, "List4444 : "+ list.toString());

                list.remove(2);
                Log.i(TAG, "List5555 : "+ list.toString());

                list.remove(0);
                Log.i(TAG, "List6666 : "+ list.toString());

                list.add("CESIT");
                Log.i(TAG, "List7777 : "+ list.toString());

                // same way we can use list.updateValues(), list.get(), createAndModify(),  also.


            }
        });
    }
}
