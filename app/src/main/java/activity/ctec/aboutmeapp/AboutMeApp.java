package activity.ctec.aboutmeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android. widget.Button;
import android. widget.TextView;
import android. view.View;
import android. widget.ImageView;


public class AboutMeApp extends AppCompatActivity {
    private Button Roboticbutton;
    private Button Gamebutton;
    private Button cookingbutton;
    private Button campbutton;
    private Button MyName;
    private Button schoolbutton;
    private TextView aboutMeText;
    private TextView TextForSchool;
    private TextView TextForCamp;
    private TextView games_text;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me_app);

    MyName = (Button) findViewById(R.id.MyName);
    campbutton = (Button) findViewById(R.id.campbutton);
        Roboticbutton  = (Button) findViewById(R.id.Roboticbutton);
        Gamebutton = (Button) findViewById(R.id.Gamebutton);
        cookingbutton  = (Button) findViewById(R.id.cookingbutton);
        schoolbutton  = (Button) findViewById(R.id.schoolbutton);
    }




  public void setuplisteners()
  {

    cookingbutton.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View v)
        {
            changeVisibility();
        }
      });


      MyName.setOnClickListener(new View.OnClickListener()
      {
         public void onClick(View v)
         {
             changeVisibility();
         }
      });
      Roboticbutton.setOnClickListener(new View.OnClickListener()
      {
          public void onClick(View v)
          {
              changeVisibility();
          }
      });
      campbutton.setOnClickListener(new View.OnClickListener()
      {
          public void onClick(View v)
          {
              changeVisibility();
          }

      });
    Gamebutton.setOnClickListener(new View.OnClickListener()
    {
        public void onClick(View v)
        {
            changeVisibility();
        }
    });
  }



private void changeVisibility()
{
    if(aboutMeText.getVisibility() == View.GONE)
    {
        aboutMeText.setVisibility(View.VISIBLE);
    }
    else
    {
        aboutMeText.setVisibility(View.GONE);
    }



}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_about_me_app, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
