package com.superextra.reminderexampel

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_reminder.view.*

class ReminderAdapter(private val reminders: ArrayList<Reminder>) : RecyclerView.Adapter<ReminderAdapter.ViewHolderCard>() {

    class ViewHolderCard(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(reminder: Reminder) {
            itemView.reminder_text.text = reminder.reminderText
        }
    }
    /**
     * Creates and returns a ViewHolder object, inflating the layout called item_reminder.
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderCard {

        val cardView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_reminder, parent, false)

        return ViewHolderCard(cardView)

    }

    /**
     * Returns the size of the list
     */
    override fun getItemCount(): Int = reminders.size

    /**
     * Called by RecyclerView to display the data at the specified position.
     */
    override fun onBindViewHolder(holder: ViewHolderCard, position: Int) {
        holder.bind(reminders[position])
    }

}
