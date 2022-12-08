package dziedziczenie;

public class UserInputCensorProcessor extends UserInputPreprocessor {
    private String[] lastResult = new String[1];

    public UserInputCensorProcessor(UserInputReader reader) {
        super(reader);
    }

    @Override
    public String removeBadWords(String input) {
        return input.replace("zupa", "");
    }

    @Override
    public void saveResult(String processedInput) {
        this.lastResult[0] = processedInput;

        System.out.println(processedInput);
    }

    public String getLastResult() {
        return this.lastResult[0];
    }
}