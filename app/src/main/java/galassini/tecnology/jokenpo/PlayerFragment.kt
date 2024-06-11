package galassini.tecnology.jokenpo

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationView
import galassini.tecnology.jokenpo.databinding.FragmentPlayerBinding


const val TAG = "LifeCycle"

    class PlayerFragment : Fragment() {
        private lateinit var drawerLayout: DrawerLayout
        private lateinit var selectPlay: Spinner
        private lateinit var navDrawerLayout: NavigationView
        private lateinit var onItemSelectedListener: AdapterView.OnItemSelectedListener
        private var _binding: FragmentPlayerBinding? = null
        private val binding get() = _binding!!

        override fun onAttach(context: Context) {
            super.onAttach(context)

            onItemSelectedListener = context as AdapterView.OnItemSelectedListener

        }

        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            _binding = FragmentPlayerBinding.inflate(inflater, container, false)

            return binding.root
        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
            setupSelectPlaySpinner()
        }

        private fun setupSelectPlaySpinner() {
            selectPlay = binding.spinner
            ArrayAdapter.createFromResource(
                requireContext(),
                R.array.available_plays_array,
                android.R.layout.simple_spinner_item
            ).also { adapter ->
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                selectPlay.adapter = adapter
                selectPlay.onItemSelectedListener = onItemSelectedListener
            }
        }

        override fun onResume() {
            super.onResume()
            Log.i(TAG,"Passou pelo estado de resume")
        }

        override fun onPause() {
            super.onPause()
            Log.i(TAG,"Passou pelo estado de pause")

        }

        override fun onStop() {
            super.onStop()
            Log.i(TAG,"Passou pelo estado de Stop")

        }

        override fun onDestroy() {
            super.onDestroy()
            Log.i(TAG,"Passou pelo estado de Destroy")

        }
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            Log.i(TAG,"Passou pelo estado de Create")

        }


    }