package sg.edu.rp.c346.todolistdone;

import java.util.Calendar;



public class DoItem {
    private String name;
    private Calendar date;

    public DoItem(String name, Calendar date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public String getDateString() {
        String str = date.get(Calendar.DAY_OF_MONTH) + "/" +
                date.get(Calendar.MONTH) + "/" +
                date.get(Calendar.YEAR);
        return str;
    }


    @Override
    public String toString() {
        return "DoItem{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}