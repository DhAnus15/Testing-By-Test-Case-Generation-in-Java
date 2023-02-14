import java.util.Stack;
import java.util.Vector;

class RsaRepository {

    private Stack<Integer> s;

    public Integer store(int x) {

        Integer result_code;

        s.setSize(5);

        try {

            s.push(x);

            if (s.peek() == x) {

                result_code = 1;

            } else {

                result_code = 0;
            }
        } catch (IndexOutOfBoundsException e) {
            return 2;
        }

        return result_code;
    }

    public String retrive() {

        String resultString = "";
        String element;

        if (s.isEmpty()) {

            resultString = "# Repository Empty";

        } else {

            try {

                Integer popped_element = s.pop();
                element = popped_element.toString();
                resultString = "# Success";

            } catch (Exception e) {

                resultString = "# Failure for unknown reason";

            }
        }
        return resultString;
    }

    public Vector display() {

        Vector<Integer> v = s;

        return v;
    }
}

class Q1 {

    public static void main(String[] args) {

    }
}