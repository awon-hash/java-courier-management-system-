/*
Couior Managment System : Solution
AWON ABBAS 
0075-BSCS-2019 (Section C)

Description: in this class detail related to couior is given
used classes: sender, receiver
*/
package controller;

import java.io.Serializable;
import java.time.LocalDate;

public class Courior implements Serializable {
    private sender sender;
    private receiver receiver;
    private LocalDate date;
    private int number;

    public Courior(sender sender, receiver receiver, LocalDate date, int number) {
        this.sender = sender;
        this.receiver = receiver;
        this.date = date;
        this.number = number;
    }

    public sender getSender() {
        return sender;
    }

    public void setSender(sender sender) {
        this.sender = sender;
    }

    public receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(receiver receiver) {
        this.receiver = receiver;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Courior{" +
                "sender=" + sender +
                ", receiver=" + receiver +
                ", date=" + date +
                ", number=" + number +
                '}';
    }
}
