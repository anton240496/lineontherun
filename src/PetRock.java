public class PetRock {
    private String InputString;
    private String result;

    public PetRock(String InputString) {
        this.InputString = InputString;
        this.result=result;
      result = "";
        int stringLength = InputString.length();

        for (int i = 0; i < stringLength; i++) {
            result = InputString.charAt(i) + result;

        }
    }

    public String getInputString() {

            return InputString;
        }
    public String getResult() {

        return result;
    }

    }

