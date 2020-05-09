public class PetRock {
    private String InputString;
    private StringBuilder result;

    public PetRock(String InputString) {
        this.InputString = InputString;
        this.result=result;
      result = new StringBuilder();
        int stringLength = InputString.length();

        for (int i = 0; i < stringLength; i++) {
            result.insert(0,InputString.charAt(i));
         //   result = InputString.charAt(i) + result;

        }
    }

    public String getInputString() {

            return InputString;
        }
    public StringBuilder getResult() {

        return result;
    }

    }

