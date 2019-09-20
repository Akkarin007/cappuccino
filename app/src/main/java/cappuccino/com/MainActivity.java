package cappuccino.com;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("test");
        launchActivity();
        System.out.println("login Launched!");
    }

    private void launchActivity() {

        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}
