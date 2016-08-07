package com.laligadecider.tabswithswipe;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class GamesFragment extends Fragment {

    private static final String TAG = MainActivity.class.getSimpleName();
    private static final int REQUEST_CODE_PICK_CONTACTS = 1;
    private Uri uriContact;
    private String contactID;// contacts unique ID

    TextView tvTestToast;
    String allNames;
    CustomAdapter adapter1,adapter2,adapter3;
    ListView lv1,lv2,lv3;
    com.laligadecider.tabswithswipe.Model[] modelItems1;
    Model[] modelItems2;
    Model[] modelItems3;
    Button button1,button2,button3;
    int counterA=76,counterB=76,counterR=75;
    int length,i,j,check,checkedLength;
    Button buttonToast;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_games, container, false);

        final ArrayList<String> nameList = new ArrayList <String> () ;
        final ArrayList <String> selectedNameList = new ArrayList <String> () ;

        modelItems1 = new Model[5];
        modelItems2 = new Model[5];
        modelItems3 = new Model[5];

        lv1 = (ListView) rootView.findViewById(R.id.listView1);
        lv2 = (ListView) rootView.findViewById(R.id.listView2);
        lv3 = (ListView) rootView.findViewById(R.id.listView3);

        List<String> science = new ArrayList<String>();
        science.add("Deportivo");
        science.add("Barcelona");
        science.add("Betis");
        science.add("Barcelona");
        science.add("Granada");

        List<String> science1 = new ArrayList<String>();
        science1.add("Barcelona");
        science1.add("Sporting");
        science1.add("Barcelona");
        science1.add("Espanyol");
        science1.add("Barcelona");

        List<String> technology1 = new ArrayList<String>();
        technology1.add("A.Madrid");
        technology1.add("Malaga");
        technology1.add("Rayo");
        technology1.add("A.Madrid");
        technology1.add("Celta");

        List<String> entertainment1 = new ArrayList<String>();
        entertainment1.add("Villareal");
        entertainment1.add("R.Madrid");
        entertainment1.add("R.Madrid");
        entertainment1.add("Valencia");
        entertainment1.add("R.Madrid");

        List<String> technology = new ArrayList<String>();
        technology.add("Athletic");
        technology.add("A.Madrid");
        technology.add("A.Madrid");
        technology.add("Levante");
        technology.add("A.Madrid");

        List<String> entertainment = new ArrayList<String>();
        entertainment.add("R.Madrid");
        entertainment.add("Rayo");
        entertainment.add("Sociedad");
        entertainment.add("R.Madrid");
        entertainment.add("Deportivo");



        for(i=0;i<5;i++) {
            modelItems1[i] = new Model(science.get(i), science1.get(i));
        }

        for(i=0;i<5;i++) {
            modelItems2[i] = new Model(technology.get(i), technology1.get(i));
        }

        for(i=0;i<5;i++) {
            modelItems3[i] = new Model(entertainment.get(i), entertainment1.get(i));
        }


        adapter1 = new CustomAdapter(getContext(), modelItems1,1);
        lv1.setAdapter(adapter1);


        adapter2 = new CustomAdapter(getContext(), modelItems2,2);
        lv2.setAdapter(adapter2);

        adapter3 = new CustomAdapter(getContext(), modelItems3,3);
        lv3.setAdapter(adapter3);

        ListUtils.setDynamicHeight(lv1);
        ListUtils.setDynamicHeight(lv2);
        ListUtils.setDynamicHeight(lv3);

        return rootView;
    }

    public static class ListUtils {
        public static void setDynamicHeight(ListView mListView) {
            ListAdapter mListAdapter = mListView.getAdapter();
            if (mListAdapter == null) {
                // when adapter is null
                return;
            }
            int height = 0;
            int desiredWidth = View.MeasureSpec.makeMeasureSpec(mListView.getWidth(), View.MeasureSpec.UNSPECIFIED);
            for (int i = 0; i < mListAdapter.getCount(); i++) {
                View listItem = mListAdapter.getView(i, null, mListView);
                listItem.measure(desiredWidth, View.MeasureSpec.UNSPECIFIED);
                height += listItem.getMeasuredHeight();
            }
            ViewGroup.LayoutParams params = mListView.getLayoutParams();
            params.height = height + (mListView.getDividerHeight() * (mListAdapter.getCount() - 1));
            mListView.setLayoutParams(params);
            mListView.requestLayout();
        }
    }
}
