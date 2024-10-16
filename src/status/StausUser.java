/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm-Exam
 * @author srinivsi
 */
public class StausUser {
    
    public void statusDetail(UserStatus status) {
        switch (status) {
            case ZERO:
                System.out.println("User status: ZERO");
                break;
            case ONE:
                System.out.println("User status: ONE");
                break;
            case TWO:
                System.out.println("User status: TWO");
                break;
            case THREE:
                System.out.println("User status: THREE");
                break;
        }
    }
}

