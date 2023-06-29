package P04_StackOfStrings_LAB;

import java.util.ArrayList;

public class StackOfStrings {

    private ArrayList<String> data;

    public StackOfStrings() {
        this.data = new ArrayList<>();
    }

    public void push(String item) {
        this.data.add(item);
    }

    public String pop() {
        String item = this.data.get(this.data.size() - 1);
        this.data.remove(this.data.size() - 1);
        return item;
    }

    public String peek() {
       return this.data.get(this.data.size() - 1);
    }

    public boolean isEmpty() {
        if (this.data.size() > 0){
            return true;
        } else {
            return false;
        }
    }
}
