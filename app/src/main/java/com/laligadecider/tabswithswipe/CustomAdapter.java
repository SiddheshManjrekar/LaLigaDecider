package com.laligadecider.tabswithswipe;


import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
        import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.widget.Button;
        import android.widget.CheckBox;
        import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class CustomAdapter extends ArrayAdapter{

    Model[] modelItems;
    Context context;
    int start;
    Button button1,button2,button3;
    public static int counterA,counterB,counterR;

    TextView tvA,tvB,tvR;
    ImageView imgA,imgB,imgR;

    public CustomAdapter(Context context, Model[] resource, int start) {
        super(context,R.layout.list_items,resource);
        // TODO Auto-generated constructor stub

        tvA=(TextView) ((MainActivity) getContext()).findViewById(R.id.textViewA);
        tvB=(TextView) ((MainActivity) getContext()).findViewById(R.id.textViewB);
        tvR=(TextView) ((MainActivity) getContext()).findViewById(R.id.textViewR);


        imgA=(ImageView) ((MainActivity) getContext()).findViewById(R.id.imgA);
        imgB=(ImageView) ((MainActivity) getContext()).findViewById(R.id.imgB);
        imgR=(ImageView) ((MainActivity) getContext()).findViewById(R.id.imgR);

        counterA=76;
        counterB=76;
        counterR=75;

        this.context = context;
        this.modelItems = resource;
        this.start=start;


    }

    @Override
    public View getView(final int position, View convertView, final ViewGroup parent) {
        // TODO Auto-generated method stub
        LayoutInflater inflater = ((Activity)context).getLayoutInflater();
        convertView = inflater.inflate(R.layout.list_items, parent, false);

        if (position>=0 &&position<5) {

            TextView team1 = (TextView) convertView.findViewById(R.id.expandedListItem);
            team1.setText(modelItems[position].getName());
            TextView team2 = (TextView) convertView.findViewById(R.id.expandedListItem1);
            team2.setText(modelItems[position].getName1());

            button1=(Button) convertView.findViewById(R.id.button1);
            button2=(Button) convertView.findViewById(R.id.button2);
            button3=(Button) convertView.findViewById(R.id.button3);


            button1.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    if (start==1 && (position==1  || position==3)) {

                        button1 = (Button) parent.getChildAt(position).findViewById(R.id.button1);
                        button2 = (Button) parent.getChildAt(position).findViewById(R.id.button2);
                        button3 = (Button) parent.getChildAt(position).findViewById(R.id.button3);

                        if (button3.getCurrentTextColor() != Color.parseColor("#ffffff")) {
                            counterB = counterB + 0;
                        }
                        if (button2.getCurrentTextColor() != Color.parseColor("#ffffff")) {
                            counterB = counterB - 1;
                        }
                        if (button1.getCurrentTextColor() == Color.parseColor("#ffffff")) {
                            button1.setTextColor(Color.parseColor("#000000"));
                            button2.setTextColor(Color.parseColor("#ffffff"));
                            button3.setTextColor(Color.parseColor("#ffffff"));

                            counterB = counterB + 3;
                            updateTable();
                            button1.setBackgroundColor(Color.parseColor("#aa00ff00"));
                            button2.setBackgroundColor(Color.parseColor("#44ffffff"));
                            button3.setBackgroundColor(Color.parseColor("#44ffffff"));


                        }
                    }

                    if (start==1 && (position==0  || position==2 || position==4)) {

                        button1 = (Button) parent.getChildAt(position).findViewById(R.id.button1);
                        button2 = (Button) parent.getChildAt(position).findViewById(R.id.button2);
                        button3 = (Button) parent.getChildAt(position).findViewById(R.id.button3);

                        if (button3.getCurrentTextColor() != Color.parseColor("#ffffff")) {
                            counterB = counterB - 3;
                        }
                        if (button2.getCurrentTextColor() != Color.parseColor("#ffffff")) {
                            counterB = counterB - 1;
                        }
                        if (button1.getCurrentTextColor() == Color.parseColor("#ffffff")) {
                            button1.setTextColor(Color.parseColor("#000000"));
                            button2.setTextColor(Color.parseColor("#ffffff"));
                            button3.setTextColor(Color.parseColor("#ffffff"));

                            counterB = counterB + 0;
                            updateTable();
                            button1.setBackgroundColor(Color.parseColor("#aaff0000"));
                            button2.setBackgroundColor(Color.parseColor("#44ffffff"));
                            button3.setBackgroundColor(Color.parseColor("#44ffffff"));


                        }
                    }

                    //Atletico Madrid Button 1 Scenario

                    if (start==2 && (position==1  || position==2 || position==4)) {



                        button1 = (Button) parent.getChildAt(position).findViewById(R.id.button1);
                        button2 = (Button) parent.getChildAt(position).findViewById(R.id.button2);
                        button3 = (Button) parent.getChildAt(position).findViewById(R.id.button3);

                        if (button3.getCurrentTextColor() != Color.parseColor("#ffffff")) {
                            counterA = counterA + 0;
                        }
                        if (button2.getCurrentTextColor() != Color.parseColor("#ffffff")) {
                            counterA = counterA - 1;
                        }
                        if (button1.getCurrentTextColor() == Color.parseColor("#ffffff")) {
                            button1.setTextColor(Color.parseColor("#000000"));
                            button2.setTextColor(Color.parseColor("#ffffff"));
                            button3.setTextColor(Color.parseColor("#ffffff"));

                            counterA = counterA + 3;
                            updateTable();
                            button1.setBackgroundColor(Color.parseColor("#aa00ff00"));
                            button2.setBackgroundColor(Color.parseColor("#44ffffff"));
                            button3.setBackgroundColor(Color.parseColor("#44ffffff"));


                        }
                    }

                    if (start==2 && (position==0  || position==3)) {

                        button1 = (Button) parent.getChildAt(position).findViewById(R.id.button1);
                        button2 = (Button) parent.getChildAt(position).findViewById(R.id.button2);
                        button3 = (Button) parent.getChildAt(position).findViewById(R.id.button3);

                        if (button3.getCurrentTextColor() != Color.parseColor("#ffffff")) {
                            counterA = counterA - 3;
                        }
                        if (button2.getCurrentTextColor() != Color.parseColor("#ffffff")) {
                            counterA = counterA - 1;
                        }
                        if (button1.getCurrentTextColor() == Color.parseColor("#ffffff")) {
                            button1.setTextColor(Color.parseColor("#000000"));
                            button2.setTextColor(Color.parseColor("#ffffff"));
                            button3.setTextColor(Color.parseColor("#ffffff"));

                            counterA = counterA + 0;
                            updateTable();
                            button1.setBackgroundColor(Color.parseColor("#aaff0000"));
                            button2.setBackgroundColor(Color.parseColor("#44ffffff"));
                            button3.setBackgroundColor(Color.parseColor("#44ffffff"));


                        }
                    }

                    //Real Madrid Button 1 Scenario

                    if (start==3 && (position==0  || position==3 )) {



                        button1 = (Button) parent.getChildAt(position).findViewById(R.id.button1);
                        button2 = (Button) parent.getChildAt(position).findViewById(R.id.button2);
                        button3 = (Button) parent.getChildAt(position).findViewById(R.id.button3);

                        if (button3.getCurrentTextColor() != Color.parseColor("#ffffff")) {
                            counterR = counterR + 0;
                        }
                        if (button2.getCurrentTextColor() != Color.parseColor("#ffffff")) {
                            counterR = counterR - 1;
                        }
                        if (button1.getCurrentTextColor() == Color.parseColor("#ffffff")) {
                            button1.setTextColor(Color.parseColor("#000000"));
                            button2.setTextColor(Color.parseColor("#ffffff"));
                            button3.setTextColor(Color.parseColor("#ffffff"));

                            counterR = counterR + 3;
                            updateTable();
                            button1.setBackgroundColor(Color.parseColor("#aa00ff00"));
                            button2.setBackgroundColor(Color.parseColor("#44ffffff"));
                            button3.setBackgroundColor(Color.parseColor("#44ffffff"));


                        }
                    }

                    if (start==3 && (position==1  || position==2 || position==4)) {

                        button1 = (Button) parent.getChildAt(position).findViewById(R.id.button1);
                        button2 = (Button) parent.getChildAt(position).findViewById(R.id.button2);
                        button3 = (Button) parent.getChildAt(position).findViewById(R.id.button3);

                        if (button3.getCurrentTextColor() != Color.parseColor("#ffffff")) {
                            counterR = counterR - 3;
                        }
                        if (button2.getCurrentTextColor() != Color.parseColor("#ffffff")) {
                            counterR = counterR - 1;
                        }
                        if (button1.getCurrentTextColor() == Color.parseColor("#ffffff")) {
                            button1.setTextColor(Color.parseColor("#000000"));
                            button2.setTextColor(Color.parseColor("#ffffff"));
                            button3.setTextColor(Color.parseColor("#ffffff"));

                            counterR = counterR + 0;
                            updateTable();
                            button1.setBackgroundColor(Color.parseColor("#aaff0000"));
                            button2.setBackgroundColor(Color.parseColor("#44ffffff"));
                            button3.setBackgroundColor(Color.parseColor("#44ffffff"));


                        }
                    }

                }
            });

            button2.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    if (start==1 && (position==1  || position==3)) {

                        button1 = (Button) parent.getChildAt(position).findViewById(R.id.button1);
                        button2 = (Button) parent.getChildAt(position).findViewById(R.id.button2);
                        button3 = (Button) parent.getChildAt(position).findViewById(R.id.button3);

                        if (button3.getCurrentTextColor() != Color.parseColor("#ffffff")) {
                            counterB = counterB + 0;
                        }
                        if (button1.getCurrentTextColor() != Color.parseColor("#ffffff")) {
                            counterB = counterB - 3;
                        }
                        if (button2.getCurrentTextColor() == Color.parseColor("#ffffff")) {
                            button2.setTextColor(Color.parseColor("#000000"));
                            button1.setTextColor(Color.parseColor("#ffffff"));
                            button3.setTextColor(Color.parseColor("#ffffff"));

                            counterB = counterB + 1;
                            updateTable();
                            button2.setBackgroundColor(Color.parseColor("#aaffff00"));
                            button1.setBackgroundColor(Color.parseColor("#44ffffff"));
                            button3.setBackgroundColor(Color.parseColor("#44ffffff"));


                        }
                    }

                    if (start==1 && (position==0  || position==2 || position==4)) {

                        button1 = (Button) parent.getChildAt(position).findViewById(R.id.button1);
                        button2 = (Button) parent.getChildAt(position).findViewById(R.id.button2);
                        button3 = (Button) parent.getChildAt(position).findViewById(R.id.button3);

                        if (button3.getCurrentTextColor() != Color.parseColor("#ffffff")) {
                            counterB = counterB - 3;
                        }
                        if (button1.getCurrentTextColor() != Color.parseColor("#ffffff")) {
                            counterB = counterB - 0;
                        }
                        if (button2.getCurrentTextColor() == Color.parseColor("#ffffff")) {
                            button2.setTextColor(Color.parseColor("#000000"));
                            button1.setTextColor(Color.parseColor("#ffffff"));
                            button3.setTextColor(Color.parseColor("#ffffff"));

                            counterB = counterB + 1;
                            updateTable();
                            button2.setBackgroundColor(Color.parseColor("#aaffff00"));
                            button1.setBackgroundColor(Color.parseColor("#44ffffff"));
                            button3.setBackgroundColor(Color.parseColor("#44ffffff"));


                        }
                    }

                    //Atletico Madrid Button2 Scenario

                    if (start==2 && (position==1  || position==2 || position==4)) {

                        button1 = (Button) parent.getChildAt(position).findViewById(R.id.button1);
                        button2 = (Button) parent.getChildAt(position).findViewById(R.id.button2);
                        button3 = (Button) parent.getChildAt(position).findViewById(R.id.button3);

                        if (button3.getCurrentTextColor() != Color.parseColor("#ffffff")) {
                            counterA = counterA + 0;
                        }
                        if (button1.getCurrentTextColor() != Color.parseColor("#ffffff")) {
                            counterA = counterA - 3;
                        }
                        if (button2.getCurrentTextColor() == Color.parseColor("#ffffff")) {
                            button2.setTextColor(Color.parseColor("#000000"));
                            button1.setTextColor(Color.parseColor("#ffffff"));
                            button3.setTextColor(Color.parseColor("#ffffff"));

                            counterA = counterA + 1;
                            updateTable();
                            button2.setBackgroundColor(Color.parseColor("#aaffff00"));
                            button1.setBackgroundColor(Color.parseColor("#44ffffff"));
                            button3.setBackgroundColor(Color.parseColor("#44ffffff"));


                        }
                    }

                    if (start==2 && (position==0  || position==3)) {

                        button1 = (Button) parent.getChildAt(position).findViewById(R.id.button1);
                        button2 = (Button) parent.getChildAt(position).findViewById(R.id.button2);
                        button3 = (Button) parent.getChildAt(position).findViewById(R.id.button3);

                        if (button3.getCurrentTextColor() != Color.parseColor("#ffffff")) {
                            counterA = counterA - 3;
                        }
                        if (button1.getCurrentTextColor() != Color.parseColor("#ffffff")) {
                            counterA = counterA - 0;
                        }
                        if (button2.getCurrentTextColor() == Color.parseColor("#ffffff")) {
                            button2.setTextColor(Color.parseColor("#000000"));
                            button1.setTextColor(Color.parseColor("#ffffff"));
                            button3.setTextColor(Color.parseColor("#ffffff"));

                            counterA = counterA + 1;
                            updateTable();
                            button2.setBackgroundColor(Color.parseColor("#aaffff00"));
                            button1.setBackgroundColor(Color.parseColor("#44ffffff"));
                            button3.setBackgroundColor(Color.parseColor("#44ffffff"));


                        }
                    }

                    //Real Madrid Button 2 Scenario

                    if (start==3 && (position==0  || position==3 )) {

                        button1 = (Button) parent.getChildAt(position).findViewById(R.id.button1);
                        button2 = (Button) parent.getChildAt(position).findViewById(R.id.button2);
                        button3 = (Button) parent.getChildAt(position).findViewById(R.id.button3);

                        if (button3.getCurrentTextColor() != Color.parseColor("#ffffff")) {
                            counterR = counterR + 0;
                        }
                        if (button1.getCurrentTextColor() != Color.parseColor("#ffffff")) {
                            counterR = counterR - 3;
                        }
                        if (button2.getCurrentTextColor() == Color.parseColor("#ffffff")) {
                            button2.setTextColor(Color.parseColor("#000000"));
                            button1.setTextColor(Color.parseColor("#ffffff"));
                            button3.setTextColor(Color.parseColor("#ffffff"));

                            counterR = counterR + 1;
                            updateTable();
                            button2.setBackgroundColor(Color.parseColor("#aaffff00"));
                            button1.setBackgroundColor(Color.parseColor("#44ffffff"));
                            button3.setBackgroundColor(Color.parseColor("#44ffffff"));


                        }
                    }

                    if (start==3 && (position==1  || position==2 || position==4)) {

                        button1 = (Button) parent.getChildAt(position).findViewById(R.id.button1);
                        button2 = (Button) parent.getChildAt(position).findViewById(R.id.button2);
                        button3 = (Button) parent.getChildAt(position).findViewById(R.id.button3);

                        if (button3.getCurrentTextColor() != Color.parseColor("#ffffff")) {
                            counterR = counterR - 3;
                        }
                        if (button1.getCurrentTextColor() != Color.parseColor("#ffffff")) {
                            counterR = counterR - 0;
                        }
                        if (button2.getCurrentTextColor() == Color.parseColor("#ffffff")) {
                            button2.setTextColor(Color.parseColor("#000000"));
                            button1.setTextColor(Color.parseColor("#ffffff"));
                            button3.setTextColor(Color.parseColor("#ffffff"));

                            counterR = counterR + 1;
                            updateTable();
                            button2.setBackgroundColor(Color.parseColor("#aaffff00"));
                            button1.setBackgroundColor(Color.parseColor("#44ffffff"));
                            button3.setBackgroundColor(Color.parseColor("#44ffffff"));


                        }
                    }



                }
            });

            button3.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    if (start==1 && (position==1  || position==3)) {

                        button1 = (Button) parent.getChildAt(position).findViewById(R.id.button1);
                        button2 = (Button) parent.getChildAt(position).findViewById(R.id.button2);
                        button3 = (Button) parent.getChildAt(position).findViewById(R.id.button3);

                        if (button2.getCurrentTextColor() != Color.parseColor("#ffffff")) {
                            counterB = counterB - 1;
                        }
                        if (button1.getCurrentTextColor() != Color.parseColor("#ffffff")) {
                            counterB = counterB - 3;
                        }
                        if (button3.getCurrentTextColor() == Color.parseColor("#ffffff")) {
                            button3.setTextColor(Color.parseColor("#000000"));
                            button1.setTextColor(Color.parseColor("#ffffff"));
                            button2.setTextColor(Color.parseColor("#ffffff"));

                            counterB = counterB + 0;
                            updateTable();
                            button3.setBackgroundColor(Color.parseColor("#aaff0000"));
                            button1.setBackgroundColor(Color.parseColor("#44ffffff"));
                            button2.setBackgroundColor(Color.parseColor("#44ffffff"));


                        }
                    }

                    if (start==1 && (position==0  || position==2 || position==4)) {

                        button1 = (Button) parent.getChildAt(position).findViewById(R.id.button1);
                        button2 = (Button) parent.getChildAt(position).findViewById(R.id.button2);
                        button3 = (Button) parent.getChildAt(position).findViewById(R.id.button3);

                        if (button2.getCurrentTextColor() != Color.parseColor("#ffffff")) {
                            counterB = counterB - 1;
                        }
                        if (button1.getCurrentTextColor() != Color.parseColor("#ffffff")) {
                            counterB = counterB - 0;
                        }
                        if (button3.getCurrentTextColor() == Color.parseColor("#ffffff")) {
                            button3.setTextColor(Color.parseColor("#000000"));
                            button1.setTextColor(Color.parseColor("#ffffff"));
                            button2.setTextColor(Color.parseColor("#ffffff"));

                            counterB = counterB + 3;
                            updateTable();
                            button3.setBackgroundColor(Color.parseColor("#aa00ff00"));
                            button1.setBackgroundColor(Color.parseColor("#44ffffff"));
                            button2.setBackgroundColor(Color.parseColor("#44ffffff"));


                        }
                    }

                    //Atletico Madrid Button 3 Scenarios

                    if (start==2 && (position==1  || position==2 || position==4)) {

                        button1 = (Button) parent.getChildAt(position).findViewById(R.id.button1);
                        button2 = (Button) parent.getChildAt(position).findViewById(R.id.button2);
                        button3 = (Button) parent.getChildAt(position).findViewById(R.id.button3);

                        if (button2.getCurrentTextColor() != Color.parseColor("#ffffff")) {
                            counterA = counterA - 1;
                        }
                        if (button1.getCurrentTextColor() != Color.parseColor("#ffffff")) {
                            counterA = counterA - 3;
                        }
                        if (button3.getCurrentTextColor() == Color.parseColor("#ffffff")) {
                            button3.setTextColor(Color.parseColor("#000000"));
                            button1.setTextColor(Color.parseColor("#ffffff"));
                            button2.setTextColor(Color.parseColor("#ffffff"));

                            counterA = counterA + 0;
                            updateTable();
                            button3.setBackgroundColor(Color.parseColor("#aaff0000"));
                            button1.setBackgroundColor(Color.parseColor("#44ffffff"));
                            button2.setBackgroundColor(Color.parseColor("#44ffffff"));


                        }
                    }

                    if (start==2 && (position==0  || position==3)) {

                        button1 = (Button) parent.getChildAt(position).findViewById(R.id.button1);
                        button2 = (Button) parent.getChildAt(position).findViewById(R.id.button2);
                        button3 = (Button) parent.getChildAt(position).findViewById(R.id.button3);

                        if (button2.getCurrentTextColor() != Color.parseColor("#ffffff")) {
                            counterA = counterA - 1;
                        }
                        if (button1.getCurrentTextColor() != Color.parseColor("#ffffff")) {
                            counterA = counterA - 0;
                        }
                        if (button3.getCurrentTextColor() == Color.parseColor("#ffffff")) {
                            button3.setTextColor(Color.parseColor("#000000"));
                            button1.setTextColor(Color.parseColor("#ffffff"));
                            button2.setTextColor(Color.parseColor("#ffffff"));

                            counterA = counterA + 3;
                            updateTable();
                            button3.setBackgroundColor(Color.parseColor("#aa00ff00"));
                            button1.setBackgroundColor(Color.parseColor("#44ffffff"));
                            button2.setBackgroundColor(Color.parseColor("#44ffffff"));


                        }
                    }


                    //Real Madrid Button 3 scenarios

                    if (start==3 && (position==0  || position==3 )) {

                        button1 = (Button) parent.getChildAt(position).findViewById(R.id.button1);
                        button2 = (Button) parent.getChildAt(position).findViewById(R.id.button2);
                        button3 = (Button) parent.getChildAt(position).findViewById(R.id.button3);

                        if (button2.getCurrentTextColor() != Color.parseColor("#ffffff")) {
                            counterR = counterR - 1;
                        }
                        if (button1.getCurrentTextColor() != Color.parseColor("#ffffff")) {
                            counterR = counterR - 3;
                        }
                        if (button3.getCurrentTextColor() == Color.parseColor("#ffffff")) {
                            button3.setTextColor(Color.parseColor("#000000"));
                            button1.setTextColor(Color.parseColor("#ffffff"));
                            button2.setTextColor(Color.parseColor("#ffffff"));

                            counterR = counterR + 0;
                            updateTable();
                            button3.setBackgroundColor(Color.parseColor("#aaff0000"));
                            button1.setBackgroundColor(Color.parseColor("#44ffffff"));
                            button2.setBackgroundColor(Color.parseColor("#44ffffff"));


                        }
                    }

                    if (start==3 && (position==1  || position==2 || position==4)) {

                        button1 = (Button) parent.getChildAt(position).findViewById(R.id.button1);
                        button2 = (Button) parent.getChildAt(position).findViewById(R.id.button2);
                        button3 = (Button) parent.getChildAt(position).findViewById(R.id.button3);

                        if (button2.getCurrentTextColor() != Color.parseColor("#ffffff")) {
                            counterR = counterR - 1;
                        }
                        if (button1.getCurrentTextColor() != Color.parseColor("#ffffff")) {
                            counterR = counterR - 0;
                        }
                        if (button3.getCurrentTextColor() == Color.parseColor("#ffffff")) {
                            button3.setTextColor(Color.parseColor("#000000"));
                            button1.setTextColor(Color.parseColor("#ffffff"));
                            button2.setTextColor(Color.parseColor("#ffffff"));

                            counterR = counterR + 3;
                            updateTable();
                            button3.setBackgroundColor(Color.parseColor("#aa00ff00"));
                            button1.setBackgroundColor(Color.parseColor("#44ffffff"));
                            button2.setBackgroundColor(Color.parseColor("#44ffffff"));


                        }
                    }



                }
            });

        }

        return convertView;

    }

    void updateTable() {

        int bPos = 1, aPos = 2, rPos = 3;

        //Barcelona Position
        if (counterB >= counterA && counterB >= counterR) {
            bPos = 1;
        }
        if ((counterB < counterA && counterB >= counterR) || (counterB < counterR && counterB >= counterA)) {
            bPos = 2;
        }
        if (counterB < counterA && counterB < counterR) {
            bPos = 3;
        }
        //Atletico Madrid Position
        if (counterA > counterB && counterA >= counterR) {
            aPos = 1;
        }
        if ((counterA <= counterB && counterA >= counterR) || (counterA < counterR && counterA > counterB)) {
            aPos = 2;
        }
        if (counterA <= counterB && counterA < counterR) {
            aPos = 3;
        }

        //Real Madrid Position
        if (counterR > counterB && counterR > counterA) {
            rPos = 1;
        }
        if ((counterR <= counterB && counterR > counterA) || (counterR <= counterA && counterR > counterB)) {
            rPos = 2;
        }
        if (counterR <= counterB && counterR <= counterA) {
            rPos = 3;
        }

        MainActivity ma=(MainActivity)getContext();
        ma.rPos=rPos;
        ma.aPos=aPos;
        ma.bPos=bPos;
        ma.counterB=counterB;
        ma.counterA=counterA;
        ma.counterR=counterR;





        if (bPos == 1) {
            tvB.setText("" + counterB);
            imgB.setImageResource(R.drawable.barca);
        }
        if (bPos == 2) {
            tvA.setText("" + counterB);
            imgA.setImageResource(R.drawable.barca);
        }
        if (bPos == 3) {
            tvR.setText("" + counterB);
            imgR.setImageResource(R.drawable.barca);
        }

        //Atletico Madrid

        if (aPos == 1) {
            tvB.setText("" + counterA);
            imgB.setImageResource(R.drawable.a2);
        }
        if (aPos == 2) {
            tvA.setText("" + counterA);
            imgA.setImageResource(R.drawable.a2);
        }
        if (aPos == 3) {
            tvR.setText("" + counterA);
            imgR.setImageResource(R.drawable.a2);
        }

        //Real Madrid
        if (rPos == 1) {
            tvB.setText("" + counterR);
            imgB.setImageResource(R.drawable.r7);
        }
        if (rPos == 2) {
            tvA.setText("" + counterR);
            imgA.setImageResource(R.drawable.r7);
        }
        if (rPos == 3) {
            tvR.setText("" + counterR);
            imgR.setImageResource(R.drawable.r7);
        }

        Log.e("Atletico", String.valueOf(counterA));
        Log.e("Barca", String.valueOf(counterB));
        Log.e("Real", String.valueOf(counterR));





    }



}

