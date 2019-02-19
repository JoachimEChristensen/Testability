package joachim.testability;

/**
 * @author Joachim
 */
public class Main {
    
    public static void main(String args[]) {
        boolean one = false;
        boolean two = false;
        boolean three = false;
        boolean four = false;
        boolean five = false;
        boolean six = false;
        boolean seven = false;
        
        for (int i = 0; i < 10; i++) {
            if (one) {
                if (two) {
                    if (three) {
                        if (four) {
                            if (five) {
                                if (six) {
                                    if (seven) {
                                        System.out.println("Hello World!");
                                        seven = false;
                                    } else {
                                        seven = true;
                                    }
                                } else {
                                    six = true;
                                }
                            } else {
                                five = true;
                            }
                        } else {
                            four = true;
                        }
                    } else {
                        three = true;
                    }
                } else {
                    two = true;
                }
            } else {
                one = true;
            }
        }
    }
}
