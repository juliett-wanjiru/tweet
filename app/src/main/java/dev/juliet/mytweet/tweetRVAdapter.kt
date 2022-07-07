//package dev.juliet.mytweet
//
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.ImageView
//import android.widget.TextView
//import androidx.recyclerview.widget.RecyclerView
//class ContactsRvAdapter(var contact_list:List<tweet>):
//    RecyclerView.Adapter<tweetViewHolder>() {
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): tweetViewHolder {
//        var itemView=LayoutInflater.from(parent.context)
//            .inflate(R.layout.tweet_list_item,parent,false)
//        return tweetViewHolder(itemView)
//
//    }
//
//    override fun onBindViewHolder(holder: tweetViewHolder, position: Int) {
//        var currentContact=tweet_list.get(position)
//        holder.tv.text=currentContact.name
//        holder.tvMail.text=currentContact.email
//        holder.tvPhoneno.text=currentContact.phoneNo
//        holder.tvPlace.text=currentContact.address
//    }
//    override fun getItemCount(): Int {
//        return tweet_list.size
//    }
//
//}
//
//class tweetViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
//
//    var tv = itemView.findViewById<TextView>(R.id.tv)
//    var tv = itemView.findViewById<TextView>(R.id.tv)
//    var img = itemView.findViewById<TextView>(R.id.img)
//    var img= itemView.findViewById<TextView>(R.id.img)
//    var img = itemView.findViewById<ImageView>(R.id.img)
//}