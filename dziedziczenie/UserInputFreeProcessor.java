package dziedziczenie;

public class UserInputFreeProcessor extends UserInputPreprocessor {

    private String lastResult;

    public UserInputFreeProcessor(UserInputReader reader) {
        super(reader);
    }

    @Override
    public String removeBadWords(String input) {
        return input;
    }

    @Override
    public void saveResult(String processedInput) {
        this.lastResult = processedInput;

        System.out.println(processedInput);
    }
}