//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Task3 {
    public static void main(String[] args) {
        StringChecker checker = new StringChecker();
        checker.displayResult();  // Output: Success!
    }
}

// Class to encapsulate string logic
class StringChecker {
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    public StringChecker() {
        b = "Wow";
        a = b;
        d = "Wow!";
        c = "NotWow";
    }

    public boolean checkConditions() {
        boolean b1 = a == b;
        boolean b2 = d.equals(b + "!");
        boolean b3 = !c.equals(a);
        return b1 && b2 && b3;
    }

    public void displayResult() {
        if (checkConditions()) {
            System.out.println("Success!");
            return;
        }

        System.out.println("Failed!");
    }
}