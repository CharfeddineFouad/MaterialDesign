package com.fouad.chf.materialdesign;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class FirstFragment extends Fragment {


    private RecyclerView mRecyclerView;
  //  FloatingActionButton mFloatingActionButton ;
    MyAdapter adapter ;
    List<RecyclerItem> listitem ;
    String [] tabnom = {"Crépe", "Pizza" , "Sandwitch" , "Entrée" ,"Plat Principal", "Salade","Dessert","Glace"};
    int [] tabimg = {R.drawable.crepeimgg , R.drawable.pizzaimgg , R.drawable.sadwitchimgg,R.drawable.entreesimgg,R.drawable.platimgg , R.drawable.saladeimgg,R.drawable.dessertimgg,R.drawable.glaceimgg};

    public FirstFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



View view = inflater.inflate(R.layout.fragment_first, container, false);
        mRecyclerView=(RecyclerView) view.findViewById(R.id.recycler_view);

       // mFloatingActionButton = (FloatingActionButton) view.findViewById(R.id.floating_action_button);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setHasFixedSize(true);
        listitem = new ArrayList<>() ;


        for (int i=0 ;i<8;i++)
        {

            listitem.add (new RecyclerItem(tabnom[i].toString(),tabimg[i]));


        }

        adapter=new MyAdapter(listitem , getActivity() );
        mRecyclerView.setAdapter(adapter);

        /*mRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                if (dy > 0 && mFloatingActionButton.getVisibility() == View.VISIBLE) {
                    mFloatingActionButton.hide();
                } else if (dy < 0 && mFloatingActionButton.getVisibility() != View.VISIBLE) {
                    mFloatingActionButton.show();
                }
            }
        });*/

        return view;
    }

}


