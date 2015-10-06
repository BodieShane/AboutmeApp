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
    private TextView Robotics_text;
    private TextView Cooking_text;
    private ImageView Robotics;
    private ImageView cooking;
    private ImageView bodieshanepic;
    private ImageView Gaming;
    private ImageView schoolpic;
    private ImageView CampPic;



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
        aboutMeText = (TextView) findViewById(R.id.aboutMeText);
        TextForSchool = (TextView) findViewById(R.id.TextForSchool);
        TextForCamp = (TextView) findViewById(R.id.TextForCamp);
        games_text = (TextView) findViewById(R.id.games_text);
        Robotics_text = (TextView) findViewById(R.id.Robotics_text);
        Cooking_text = (TextView) findViewById(R.id.Cooking_text);

        Robotics = (ImageView) findViewById(R.id.Robotics);
        cooking = (ImageView) findViewById(R.id.cooking);
        bodieshanepic = (ImageView) findViewById(R.id.bodieshanepic);
        Gaming = (ImageView) findViewById(R.id.Gaming);
        schoolpic = (ImageView) findViewById(R.id.schoolpic);
        CampPic = (ImageView) findViewById(R.id.CampPic);

        setuplisteners();
    }




  public void setuplisteners()
  {

    cookingbutton.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View v)
        {
            TextForCamp.setVisibility(View.GONE);
            aboutMeText.setVisibility(View.GONE);
            TextForSchool.setVisibility(View.GONE);
            games_text. setVisibility(View.GONE);
            Robotics_text.setVisibility(View.GONE);
            Cooking_text.setVisibility(View.VISIBLE);

            Robotics.setVisibility(View.GONE);
            cooking.setVisibility(View.VISIBLE);
            bodieshanepic .setVisibility(View.GONE);
            Gaming.setVisibility(View.GONE);
            schoolpic .setVisibility(View.GONE);
            CampPic .setVisibility(View.GONE);

        }
      });

      schoolbutton.setOnClickListener(new View.OnClickListener()
      {
          public void onClick(View v)
          {
              TextForCamp.setVisibility(View.GONE);
              aboutMeText.setVisibility(View.GONE);
              TextForSchool.setVisibility(View.VISIBLE);
              games_text. setVisibility(View.GONE);
              Robotics_text.setVisibility(View.GONE);
              Cooking_text.setVisibility(View.GONE);

              Robotics.setVisibility(View.GONE);
              cooking.setVisibility(View.GONE);
              bodieshanepic .setVisibility(View.GONE);
              Gaming.setVisibility(View.GONE);
              schoolpic .setVisibility(View.VISIBLE);
              CampPic .setVisibility(View.GONE);
          }
      });

      MyName.setOnClickListener(new View.OnClickListener()
      {
         public void onClick(View v)
         {
             TextForCamp.setVisibility(View.GONE);
             aboutMeText.setVisibility(View.VISIBLE);
             TextForSchool.setVisibility(View.GONE);
             games_text. setVisibility(View.GONE);
             Robotics_text.setVisibility(View.GONE);
             Cooking_text.setVisibility(View.GONE);

             Robotics.setVisibility(View.GONE);
             cooking.setVisibility(View.GONE);
             bodieshanepic .setVisibility(View.VISIBLE);
             Gaming.setVisibility(View.GONE);
             schoolpic .setVisibility(View.GONE);
             CampPic .setVisibility(View.GONE);
         }
      });
      Roboticbutton.setOnClickListener(new View.OnClickListener()
      {
          public void onClick(View v)
          {
              TextForCamp.setVisibility(View.GONE);
              aboutMeText.setVisibility(View.GONE);
              TextForSchool.setVisibility(View.GONE);
              games_text. setVisibility(View.GONE);
              Robotics_text.setVisibility(View.VISIBLE);
              Cooking_text.setVisibility(View.GONE);

              Robotics.setVisibility(View.VISIBLE);
              cooking.setVisibility(View.GONE);
              bodieshanepic .setVisibility(View.GONE);
              Gaming.setVisibility(View.GONE);
              schoolpic .setVisibility(View.GONE);
              CampPic .setVisibility(View.GONE);
          }
      });
      campbutton.setOnClickListener(new View.OnClickListener()
      {
          public void onClick(View v)
          {
              TextForCamp.setVisibility(View.VISIBLE);
              aboutMeText.setVisibility(View.GONE);
              TextForSchool.setVisibility(View.GONE);
              games_text. setVisibility(View.GONE);
              Robotics_text.setVisibility(View.GONE);
              Cooking_text.setVisibility(View.GONE);

              Robotics.setVisibility(View.GONE);
              cooking.setVisibility(View.GONE);
              bodieshanepic .setVisibility(View.GONE);
              Gaming.setVisibility(View.GONE);
              schoolpic .setVisibility(View.GONE);
              CampPic .setVisibility(View.VISIBLE);
          }

      });
    Gamebutton.setOnClickListener(new View.OnClickListener()
    {
        public void onClick(View v)
        {
            TextForCamp.setVisibility(View.GONE);
            aboutMeText.setVisibility(View.GONE);
            TextForSchool.setVisibility(View.GONE);
            games_text. setVisibility(View.VISIBLE);
            Robotics_text.setVisibility(View.GONE);
            Cooking_text.setVisibility(View.GONE);

            Robotics.setVisibility(View.GONE);
            cooking.setVisibility(View.GONE);
            bodieshanepic .setVisibility(View.GONE);
            Gaming.setVisibility(View.VISIBLE);
            schoolpic .setVisibility(View.GONE);
            CampPic .setVisibility(View.GONE);
        }
    });
  }



//private void changeVisibility()
//{



  //  if(aboutMeText.getVisibility() == View.GONE)
  //  {
  //      aboutMeText.setVisibility(View.VISIBLE);
 //   }
  //  else
 //   {
  //      aboutMeText.setVisibility(View.GONE);
  //  }
//
  //  if (TextForSchool.getVisibility() ==View.GONE)
  //  {
 //       TextForSchool.setVisibility(View.VISIBLE);
  //  }
  //  else
 //   {
 //       TextForSchool.setVisibility(View.GONE);
  //  }

//}
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
