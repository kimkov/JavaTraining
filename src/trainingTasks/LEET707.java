package trainingTasks;

import java.util.ArrayList;

class MyLinkedListB {
    
    ArrayList<Integer> list;

    public MyLinkedListB() {
        list = new ArrayList<>();
    }
    
    public int get(int index) {
        if (index >= list.size()) {
            return -1;
        } 
        return list.get(index);
    }
    
    public void addAtHead(int val) {
        list.add(0, val);
    }
    
    public void addAtTail(int val) {
        list.add(list.size(), val);
    }
    
    public void addAtIndex(int index, int val) {
        if (index > list.size()) {
            return;
        }
        list.add(index, val);
    }
    
    public void deleteAtIndex(int index) {
        if (index >= list.size()) {
            return;
        }
        list.remove(index);
    }
}
