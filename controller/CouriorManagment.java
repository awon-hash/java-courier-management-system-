/*
Couior Managment System : Solution
AWON ABBAS 
0075-BSCS-2019 (Section C)

Description: this class manage the all detail related to delivey and new coroir, and data of perious couiors
used classes :  couior
*/
package controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.ListIterator;

public class CouriorManagment implements Serializable {
    private ArrayList<Courior> couriors=new ArrayList<>();
    private ArrayList<Courior> complted=new ArrayList<>();

    public void addCurior(Courior courior) {
        couriors.add(courior);
    }

    public void completedOrder(int number) {
        ListIterator<Courior> couriorIterator = couriors.listIterator();
        Courior temp = null;
        while (couriorIterator.hasNext()) {
            temp = couriorIterator.next();
            if (temp.getNumber() == number)
                complted.add(temp);
            couriorIterator.remove();
        }
    }
public void showCOmpletedOrder(){
    ListIterator<Courior> couriorIterator = complted.listIterator();
    while (couriorIterator.hasNext()) {

        System.out.println(couriorIterator.next());
    }
}

    public void show(int number) {
        ListIterator<Courior> couriorIterator = couriors.listIterator();
        while (couriorIterator.hasNext()) {
            if (couriorIterator.next().getNumber() == number)
                System.out.println(couriorIterator.previous());
        }
    }

    public void showAll() {
        ListIterator<Courior> couriorIterator = couriors.listIterator();
        while (couriorIterator.hasNext()) {

            System.out.println(couriorIterator.next());
        }
    }

}
