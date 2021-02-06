import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.emicalculator.R
import com.example.emicalculator.StatisticsData

class StatsticsAdapter(val statistics: ArrayList<StatisticsData>) : RecyclerView.Adapter<StatsticsAdapter.ViewHolder>() {

    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StatsticsAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.recycler_row, parent, false)
        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: StatsticsAdapter.ViewHolder, position: Int) {
        holder.bindItems(statistics[position])
    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return statistics.size
    }

    //the class is hodling the list view
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(statistics: StatisticsData) {
            val textViewYear = itemView.findViewById(R.id.yearCount) as TextView
            val textViewPrincipal  = itemView.findViewById(R.id.principleCount) as TextView
            val textViewInterest  = itemView.findViewById(R.id.interestCount) as TextView
            val textViewBalance  = itemView.findViewById(R.id.balanceCount) as TextView

            textViewYear.text = statistics.year
            textViewPrincipal.text = statistics.principle
            textViewBalance.text=statistics.balance
            textViewInterest.text=statistics.interest
        }
    }

}
