package com.lab42.maham.senseilocater;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;



public class MainNotificationFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//    private static final String ARG_PARAM1 = "param1";
//    private static final String ARG_PARAM2 = "param2";
//
//    // TODO: Rename and change types of parameters
//    private String mParam1;
//    private String mParam2;

    ListView list;
    List<NotificationBO> ln=new ArrayList<NotificationBO>();
   // String [] In = {"a","b","c","d","e","f","g","h","i","j","k","l"};
    NotificationAdapter nadapter;
  //  private OnFragmentInteractionListener mListener;

    public MainNotificationFragment() {
        // Required empty public constructor

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        NotificationBO nb=new NotificationBO("bsef14m021","fatima","1/2/17","1:30am");
        NotificationBO nb1=new NotificationBO("bsef14m021","fatima","1/2/17","1:30am");
        NotificationBO nb2=new NotificationBO("bsef14m021","fatima","1/2/17","1:30am");
        NotificationBO nb3=new NotificationBO("bsef14m021","fatima","1/2/17","1:30am");
        NotificationBO nb4=new NotificationBO("bsef14m021","fatima","1/2/17","1:30am");
        NotificationBO nb5=new NotificationBO("bsef14m021","fatima","1/2/17","1:30am");
        NotificationBO nb6=new NotificationBO("bsef14m021","fatima","1/2/17","1:30am");
        ln.add(nb);
        ln.add(nb1);
        ln.add(nb2);
        ln.add(nb3);
        ln.add(nb4);
        ln.add(nb5);
        ln.add(nb6);

      //  Toast.makeText(getActivity() , "Message" , Toast.LENGTH_SHORT);
        View view=inflater.inflate(R.layout.fragment_main_notification,container,false);

        list=(ListView) view.findViewById(R.id.notificationList);
        if(list!=null){
            nadapter=new NotificationAdapter(getActivity(),R.layout.notification_cell,ln);
            list.setAdapter(nadapter);
        }
        return view;
    }
//    /**
//     * Use this factory method to create a new instance of
//     * this fragment using the provided parameters.
//     *
//     * @param param1 Parameter 1.
//     * @param param2 Parameter 2.
//     * @return A new instance of fragment MainNotificationFragment.
//     */
//    // TODO: Rename and change types and number of parameters
//    public static MainNotificationFragment newInstance(String param1, String param2) {
//        MainNotificationFragment fragment = new MainNotificationFragment();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);
//        return fragment;
//    }
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
//        }
//    }


//
//    // TODO: Rename method, update argument and hook method into UI event
//    public void onButtonPressed(Uri uri) {
//        if (mListener != null) {
//            mListener.onFragmentInteraction(uri);
//        }
//    }
//
//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        if (context instanceof OnFragmentInteractionListener) {
//            mListener = (OnFragmentInteractionListener) context;
//        } else {
//            throw new RuntimeException(context.toString()
//                    + " must implement OnFragmentInteractionListener");
//        }
//    }
//
//    @Override
//    public void onDetach() {
//        super.onDetach();
//        mListener = null;
//    }
//
//    /**
//     * This interface must be implemented by activities that contain this
//     * fragment to allow an interaction in this fragment to be communicated
//     * to the activity and potentially other fragments contained in that
//     * activity.
//     * <p>
//     * See the Android Training lesson <a href=
//     * "http://developer.android.com/training/basics/fragments/communicating.html"
//     * >Communicating with Other Fragments</a> for more information.
//     */
//    public interface OnFragmentInteractionListener {
//        // TODO: Update argument type and name
//        void onFragmentInteraction(Uri uri);
//    }
}
