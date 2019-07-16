package com.app.onlineshoppingoods;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

public class UserCategoryActivity extends AppCompatActivity {

    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_category);
        mainGrid = (GridLayout) findViewById(R.id.mainGrid);

        //Set Event
        setSingleEvent(mainGrid);
        //setToggleEvent(mainGrid);
    }

    private void setToggleEvent(GridLayout mainGrid) {
        //Loop all child item of Main Grid
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            final CardView cardView = (CardView) mainGrid.getChildAt(i);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (cardView.getCardBackgroundColor().getDefaultColor() == -1) {
                        //Change background color
                        cardView.setCardBackgroundColor(Color.parseColor("#FF6F00"));
                        Toast.makeText(UserCategoryActivity.this, "State : True", Toast.LENGTH_SHORT).show();

                    } else {
                        //Change background color
                        cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                        Toast.makeText(UserCategoryActivity.this, "State : False", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

    private void setSingleEvent(GridLayout mainGrid) {
        //Loop all child item of Main Grid
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (finalI == 0){   //finalI before i, ActivityOne
                        Intent intent =  new Intent(UserCategoryActivity.this, ActivityOne.class);
                        startActivity(intent);
                    }else if (finalI == 1) {   //ActivityTwo
                        Intent intent = new Intent(UserCategoryActivity.this, ActivityTwo.class);
                        startActivity(intent);
                    }else if (finalI == 2) {   //ActivityThree
                        Intent intent = new Intent(UserCategoryActivity.this, ActivityThree.class);
                        startActivity(intent);
                    }else if (finalI == 3) {   //ActivityFour
                        Intent intent = new Intent(UserCategoryActivity.this, ActivityFour.class);
                        startActivity(intent);
                    }else if (finalI == 4) {   //ActivityFive
                        Intent intent = new Intent(UserCategoryActivity.this, ActivityFive.class);
                        startActivity(intent);
                    }else{
                        Toast.makeText(UserCategoryActivity.this, "Please set Activity for this card item",Toast.LENGTH_SHORT);
                    }


//                    Intent intent = new Intent(UserCategoryActivity.this,HomeActivity.class);
//                    intent.putExtra("info","This is activity from card item index  "+finalI);
//                    startActivity(intent);


                }
            });
        }
    }
}
