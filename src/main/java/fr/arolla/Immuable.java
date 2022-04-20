package fr.arolla;

import java.util.List;

public final class Immuable {

     final String accountNumber;
     final List<Integer> operations;

    public Immuable(String accountNumber, List<Integer> operations) {
        this.accountNumber = accountNumber;
        this.operations = operations;
    }
}
