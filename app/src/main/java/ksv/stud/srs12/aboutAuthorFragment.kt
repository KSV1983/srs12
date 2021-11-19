package ksv.stud.srs12

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class aboutAuthorFragment : Fragment() {
    private lateinit var about_author_backBtn: Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_about_author, container, false)
      //  about_author_backBtn=view.findViewById(R.id.about_author_back_btn)
        //   val aboutAuthorFragment=aboutAuthorFragment()
        //   about_author_backBtn.setOnClickListener{
        //       activity?.supportFragmentManager
        //           ?.beginTransaction()
        //           ?.replace(R.id.fragment_container,aboutAuthorFragment)
        //           ?.commit()
        //   }
        return view

    }

}